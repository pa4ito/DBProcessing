import com.tandem.ext.enscribe.EnscribeFile;
import com.tandem.ext.enscribe.EnscribeFileException;
import com.tandem.ext.enscribe.EnscribeKeyPositionOptions;
import com.tandem.ext.enscribe.EnscribeOpenOptions;
import com.tandem.ext.util.DataConversionException;
import com.tandem.tmf.Current;
import com.tandem.util.FSException;
import dpkg.IO_CH;
import dpkg.IO_Pac;

import java.util.concurrent.Callable;

public class ThreadX2 implements Callable<int[]> {
    String fromBIN;
    long toBIN;
    String fromCurrency;
    String toCurrency;
    EnscribeFile dbCH;
    EnscribeFile dbPAC;

    String FileNameCH;
    String FileNamePAC;

    int threadNumber = -1;

    int iCountCH = 0;
    int iCountTreatedCH = 0;
    int iCountPAC = 0;
    int iCountTreatedPAC = 0;

    public ThreadX2(String fromBIN, long toBIN, String fromCurrency, String toCurrency, String fileNameCH,
                    String fileNamePAC, int threadNumber) {
        this.fromBIN = fromBIN;
        this.toBIN = toBIN;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.FileNameCH = fileNameCH;
        this.FileNamePAC = fileNamePAC;
        this.threadNumber = threadNumber;
    }

    public int[] call() {
        dbCH = new EnscribeFile(FileNameCH);
        dbPAC = new EnscribeFile(FileNamePAC);

        IO_CH io_CH = new IO_CH();
        IO_Pac io_PAC;

        Current tx = new Current();

        try {
            dbCH.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);
            dbPAC.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);

            io_CH = findByKeyCH_Approx(fromBIN);
//            System.out.println("Thread " + threadNumber + " - fromBIN: " + fromBIN + " toBIN: " + toBIN + " first PAN: " + io_CH.d__ch_card_pan_r);
            if (io_CH != null) {
                while (Long.valueOf((io_CH.d__ch_card_pan_r).trim()) < toBIN) {
//                    System.out.println("[" + threadNumber + "] - Long:  " + Long.valueOf((io_CH.d__ch_card_pan_r).trim()));
//                    System.out.println("[" + threadNumber + "] - toBIN: " + toBIN);
//                    System.out.println("[" + threadNumber + "] - check: " + (Long.valueOf((io_CH.d__ch_card_pan_r).trim()) < toBIN));
                    iCountCH++;
                    if ((io_CH.getD__ch_curcy_code().equals(fromCurrency))
                            || (io_CH.getD__ch_curcy_code().trim().equals("0"))) {
                        io_CH = changeRecordsCH(io_CH, fromCurrency, toCurrency);
                        tx.begin();
                        dbCH.lockRecord();
                        dbCH.writeUpdateUnlock(io_CH);
                        iCountTreatedCH++;

                        if (!io_CH.getD__ch_account().equals("000000000000000000")) {
                            io_PAC = findByKeyPAC_Exact(io_CH.getD__ch_account());
                            if (io_PAC != null) {
                                iCountPAC++;
                                if ((io_PAC.getD__pac_curcy_code().equals(fromCurrency))
                                        || (io_PAC.getD__pac_curcy_code().trim().equals("0"))) {

                                    io_PAC = changeRecordsPAC(io_PAC, fromCurrency, toCurrency);
                                    dbPAC.lockRecord();
                                    dbPAC.writeUpdateUnlock(io_PAC);
                                    iCountTreatedPAC++;
                                }
                            }
                        }
                        tx.commit(true);
                    }

                    if (dbCH.read(io_CH) == -1) {
                        break;
                    }
                }
            }
//            System.out.println("Thread " + threadNumber + " - endPAN: " + io_CH.d__ch_card_pan_r);
        } catch (EnscribeFileException | FSException | DataConversionException e) {
            String msg = io_CH == null ? "null" : io_CH.getD__ch_card_pan_r() + " - "
                    + io_CH.getD__ch_account();
            System.out.println("Error in thread: " + threadNumber + " -> " + msg + " -> " + e.getMessage());
        } finally {
            dbCH.close();
            dbPAC.close();
        }

        return new int[]{iCountCH, iCountTreatedCH, iCountPAC, iCountTreatedPAC, threadNumber};
    }

    private String calculateBgnToEur(String val, String fromCurrency, String toCurrency, double rate) {
        if ((val != null) && (!val.equals("0"))) {
            double amount = Double.parseDouble(val);

            if (fromCurrency.equals("975"))
                amount = Math.ceil(amount / rate);
            else
                amount = Math.ceil(amount * rate);

            return String.valueOf(amount);
        }

        return "0";
    }

    private IO_CH changeRecordsCH(IO_CH io_CH, String fromCurrency, String toCurrency) {
        io_CH.setD__ch_curcy_code(toCurrency);

        double rate = 1.95583;

        io_CH.d__ch_saldo_on_host = calculateBgnToEur(io_CH.d__ch_saldo_on_host, fromCurrency, toCurrency, rate);
        io_CH.d__ch_crac_limit = calculateBgnToEur(io_CH.d__ch_crac_limit, fromCurrency, toCurrency, rate);
        io_CH.d__ch_temp_disp_increm = calculateBgnToEur(io_CH.d__ch_temp_disp_increm, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_tot_auth_pend = calculateBgnToEur(io_CH.d__ch_tot_auth_pend, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_dc_aleu = calculateBgnToEur(io_CH.d__ch_tot_dc_aleu, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_dc_steu = calculateBgnToEur(io_CH.d__ch_tot_dc_steu, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_dc_steu = calculateBgnToEur(io_CH.d__ch_tot_dc_steu, fromCurrency, toCurrency, rate);

        rate = 2.00;

        io_CH.d__ch_dom_sale_max_tx = calculateBgnToEur(io_CH.d__ch_dom_sale_max_tx, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_cash_max_tx = calculateBgnToEur(io_CH.d__ch_dom_cash_max_tx, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_sale_max_tx = calculateBgnToEur(io_CH.d__ch_int_sale_max_tx, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_cash_max_tx = calculateBgnToEur(io_CH.d__ch_int_cash_max_tx, fromCurrency, toCurrency,
                rate);

        io_CH.d__ch_dom_sale_max_24h = calculateBgnToEur(io_CH.d__ch_dom_sale_max_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_cash_max_24h = calculateBgnToEur(io_CH.d__ch_dom_cash_max_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_tot_max_24h = calculateBgnToEur(io_CH.d__ch_dom_tot_max_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_sale_max_24h = calculateBgnToEur(io_CH.d__ch_int_sale_max_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_cash_max_24h = calculateBgnToEur(io_CH.d__ch_int_cash_max_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_tot_max_24h = calculateBgnToEur(io_CH.d__ch_int_tot_max_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_sale_max_24h = calculateBgnToEur(io_CH.d__ch_sale_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_cash_max_24h = calculateBgnToEur(io_CH.d__ch_cash_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_max_24h = calculateBgnToEur(io_CH.d__ch_tot_max_24h, fromCurrency, toCurrency, rate);

        io_CH.d__ch_dom_sale_max_7d = calculateBgnToEur(io_CH.d__ch_dom_sale_max_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_cash_max_7d = calculateBgnToEur(io_CH.d__ch_dom_cash_max_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_tot_max_7d = calculateBgnToEur(io_CH.d__ch_dom_tot_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_sale_max_7d = calculateBgnToEur(io_CH.d__ch_int_sale_max_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_cash_max_7d = calculateBgnToEur(io_CH.d__ch_int_cash_max_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_tot_max_7d = calculateBgnToEur(io_CH.d__ch_int_tot_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_sale_max_7d = calculateBgnToEur(io_CH.d__ch_sale_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_cash_max_7d = calculateBgnToEur(io_CH.d__ch_cash_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_max_7d = calculateBgnToEur(io_CH.d__ch_tot_max_7d, fromCurrency, toCurrency, rate);

        io_CH.d__ch_dom_sale_cur_24h = calculateBgnToEur(io_CH.d__ch_dom_sale_cur_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_cash_cur_24h = calculateBgnToEur(io_CH.d__ch_dom_cash_cur_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_sale_cur_24h = calculateBgnToEur(io_CH.d__ch_int_sale_cur_24h, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_cash_cur_24h = calculateBgnToEur(io_CH.d__ch_int_cash_cur_24h, fromCurrency, toCurrency,
                rate);

        for (int i = 0; i < 6; i++) {
            io_CH.setD__ch__cur_4h_dom_sale(
                    calculateBgnToEur(io_CH.getD__ch__cur_4h_dom_sale(i), fromCurrency, toCurrency, rate), i);
            io_CH.setD__ch__cur_4h_dom_cash(
                    calculateBgnToEur(io_CH.getD__ch__cur_4h_dom_cash(i), fromCurrency, toCurrency, rate), i);
            io_CH.setD__ch__cur_4h_int_sale(
                    calculateBgnToEur(io_CH.getD__ch__cur_4h_int_sale(i), fromCurrency, toCurrency, rate), i);
            io_CH.setD__ch__cur_4h_int_cash(
                    calculateBgnToEur(io_CH.getD__ch__cur_4h_int_cash(i), fromCurrency, toCurrency, rate), i);
        }

        io_CH.d__ch_dom_sale_cur_7d = calculateBgnToEur(io_CH.d__ch_dom_sale_cur_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_dom_cash_cur_7d = calculateBgnToEur(io_CH.d__ch_dom_cash_cur_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_sale_cur_7d = calculateBgnToEur(io_CH.d__ch_int_sale_cur_7d, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_int_cash_cur_7d = calculateBgnToEur(io_CH.d__ch_int_cash_cur_7d, fromCurrency, toCurrency,
                rate);

        for (int i = 0; i < 7; i++) {
            io_CH.setD__ch__cur_day_dom_sale(
                    calculateBgnToEur(io_CH.getD__ch__cur_day_dom_sale(i), fromCurrency, toCurrency, rate), i);
            io_CH.setD__ch__cur_day_dom_cash(
                    calculateBgnToEur(io_CH.getD__ch__cur_day_dom_cash(i), fromCurrency, toCurrency, rate), i);
            io_CH.setD__ch__cur_day_int_sale(
                    calculateBgnToEur(io_CH.getD__ch__cur_day_int_sale(i), fromCurrency, toCurrency, rate), i);
            io_CH.setD__ch__cur_day_int_cash(
                    calculateBgnToEur(io_CH.getD__ch__cur_day_int_cash(i), fromCurrency, toCurrency, rate), i);
        }

        io_CH.d__ch_cash_limit = calculateBgnToEur(io_CH.d__ch_cash_limit, fromCurrency, toCurrency, rate);
        io_CH.d__ch_cash_limit_bank = calculateBgnToEur(io_CH.d__ch_cash_limit_bank, fromCurrency, toCurrency,
                rate);
        io_CH.d__ch_sca_amt = calculateBgnToEur(io_CH.d__ch_sca_amt, fromCurrency, toCurrency, rate);

        return io_CH;
    }

    private IO_Pac changeRecordsPAC(IO_Pac io_PAC, String fromCurrency, String toCurrency) {
        io_PAC.setD__pac_curcy_code(toCurrency);

        double rate = 1.95583;

        io_PAC.d__pac_avail_amt = calculateBgnToEur(io_PAC.d__pac_avail_amt, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_tot_auth_pend = calculateBgnToEur(io_PAC.d__pac_tot_auth_pend, fromCurrency, toCurrency,
                rate);
        io_PAC.d__pac_tot_dc_aleu = calculateBgnToEur(io_PAC.d__pac_tot_dc_aleu, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_tot_dc_steu = calculateBgnToEur(io_PAC.d__pac_tot_dc_steu, fromCurrency, toCurrency, rate);

        rate = 2.00;

        io_PAC.d__pac_cash_limit = calculateBgnToEur(io_PAC.d__pac_cash_limit, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_cash_limit_bank = calculateBgnToEur(io_PAC.d__pac_cash_limit_bank, fromCurrency, toCurrency,
                rate);

        return io_PAC;
    }

    /**
     * Finding record by Primary key.
     */
    private IO_CH findByKeyCH_Approx(String searchingKey) {
        IO_CH io_CH = new IO_CH();
        EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();

        int bytesReaded = 0;

        try {
            io_CH.clear_All();

            kpa.setKeySpecifier((short) 0);
            kpa.setKeyValue(searchingKey);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_APPROXIMATE);
            kpa.setKeyLength((short) 19);

            dbCH.keyPosition(kpa);
            bytesReaded = dbCH.read(io_CH);
        } catch (EnscribeFileException | DataConversionException e) {
            // e.printStackTrace();
            System.out.println("Catch in findByKeyCH thread: " + threadNumber + " -> " + e.getMessage());
        }

        // return returnValue;
        if (bytesReaded > 0)
            return io_CH;

        return null;
    }

    /**
     * Finding record by Primary key.
     */
    private IO_Pac findByKeyPAC_Exact(String searchingKey) {
        IO_Pac io_PAC = new IO_Pac();
        EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();

        int bytesReaded = 0;

        try {
            io_PAC.clear_All();

            kpa.setKeySpecifier((short) 0);
            kpa.setKeyValue(searchingKey);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short) 18);

            dbPAC.keyPosition(kpa);
            bytesReaded = dbPAC.read(io_PAC);
        } catch (EnscribeFileException | DataConversionException e) {
            // e.printStackTrace();
            System.out.println("Catch in findByKeyPAC thread: " + threadNumber + " -> " + e.getMessage());
        }

        if (bytesReaded > 0)
            return io_PAC;

        return null;
    }

}
