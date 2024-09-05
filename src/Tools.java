import com.tandem.ext.enscribe.EnscribeFile;
import com.tandem.ext.enscribe.EnscribeFileException;
import com.tandem.ext.enscribe.EnscribeKeyPositionOptions;
import com.tandem.ext.enscribe.EnscribeOpenOptions;
import com.tandem.ext.util.DataConversionException;
import com.tandem.tmf.Current;
import com.tandem.util.FSException;
import dpkg.IO_CH;
import dpkg.IO_Pac;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tools {
    /**
     * Finding record by Primary key in CH.
     */
    public static IO_CH findByKeyCH_Exact(EnscribeFile dbCH, String searchingKey) {
        IO_CH io_CH = new IO_CH();
        EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();

        int bytesReaded = 0;

        try {
            io_CH.clear_All();

            kpa.setKeySpecifier((short) 0);
            kpa.setKeyValue(searchingKey);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short) 19);

            dbCH.keyPosition(kpa);
            bytesReaded = dbCH.read(io_CH);
        } catch (EnscribeFileException | DataConversionException e) {
            // e.printStackTrace();
            System.out.println("Catch in findByKeyCH thread:  -> " + e.getMessage());
        }

        // return returnValue;
        if (bytesReaded > 0)
            return io_CH;

        return null;
    }

    /**
     * Finding record by Primary key in PAC.
     */
    public static IO_Pac findByKeyPAC_Exact(EnscribeFile dbPAC, String searchingKey) {
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
            System.out.println("Catch in findByKeyPAC thread:  -> " + e.getMessage());
        } finally {
            dbPAC.close();
        }

        if (bytesReaded > 0)
            return io_PAC;

        return null;
    }

    public static IO_CH changeRecordsCH(IO_CH io_CH, String fromCurrency, String toCurrency) {
        io_CH.setD__ch_curcy_code(toCurrency);

        double rate = 1.95583;

        io_CH.d__ch_saldo_on_host = calculateBgnToEur(io_CH.d__ch_saldo_on_host, fromCurrency, toCurrency, rate);
        io_CH.d__ch_crac_limit = calculateBgnToEur(io_CH.d__ch_crac_limit, fromCurrency, toCurrency, rate);
        io_CH.d__ch_temp_disp_increm = calculateBgnToEur(io_CH.d__ch_temp_disp_increm, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_auth_pend = calculateBgnToEur(io_CH.d__ch_tot_auth_pend, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_dc_aleu = calculateBgnToEur(io_CH.d__ch_tot_dc_aleu, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_dc_steu = calculateBgnToEur(io_CH.d__ch_tot_dc_steu, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_dc_steu = calculateBgnToEur(io_CH.d__ch_tot_dc_steu, fromCurrency, toCurrency, rate);

        rate = 2.00;

        io_CH.d__ch_dom_sale_max_tx = calculateBgnToEur(io_CH.d__ch_dom_sale_max_tx, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_cash_max_tx = calculateBgnToEur(io_CH.d__ch_dom_cash_max_tx, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_sale_max_tx = calculateBgnToEur(io_CH.d__ch_int_sale_max_tx, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_cash_max_tx = calculateBgnToEur(io_CH.d__ch_int_cash_max_tx, fromCurrency, toCurrency, rate);

        io_CH.d__ch_dom_sale_max_24h = calculateBgnToEur(io_CH.d__ch_dom_sale_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_cash_max_24h = calculateBgnToEur(io_CH.d__ch_dom_cash_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_tot_max_24h = calculateBgnToEur(io_CH.d__ch_dom_tot_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_sale_max_24h = calculateBgnToEur(io_CH.d__ch_int_sale_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_cash_max_24h = calculateBgnToEur(io_CH.d__ch_int_cash_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_tot_max_24h = calculateBgnToEur(io_CH.d__ch_int_tot_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_sale_max_24h = calculateBgnToEur(io_CH.d__ch_sale_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_cash_max_24h = calculateBgnToEur(io_CH.d__ch_cash_max_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_max_24h = calculateBgnToEur(io_CH.d__ch_tot_max_24h, fromCurrency, toCurrency, rate);

        io_CH.d__ch_dom_sale_max_7d = calculateBgnToEur(io_CH.d__ch_dom_sale_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_cash_max_7d = calculateBgnToEur(io_CH.d__ch_dom_cash_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_tot_max_7d = calculateBgnToEur(io_CH.d__ch_dom_tot_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_sale_max_7d = calculateBgnToEur(io_CH.d__ch_int_sale_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_cash_max_7d = calculateBgnToEur(io_CH.d__ch_int_cash_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_tot_max_7d = calculateBgnToEur(io_CH.d__ch_int_tot_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_sale_max_7d = calculateBgnToEur(io_CH.d__ch_sale_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_cash_max_7d = calculateBgnToEur(io_CH.d__ch_cash_max_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_tot_max_7d = calculateBgnToEur(io_CH.d__ch_tot_max_7d, fromCurrency, toCurrency, rate);

        io_CH.d__ch_dom_sale_cur_24h = calculateBgnToEur(io_CH.d__ch_dom_sale_cur_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_cash_cur_24h = calculateBgnToEur(io_CH.d__ch_dom_cash_cur_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_sale_cur_24h = calculateBgnToEur(io_CH.d__ch_int_sale_cur_24h, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_cash_cur_24h = calculateBgnToEur(io_CH.d__ch_int_cash_cur_24h, fromCurrency, toCurrency, rate);

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

        io_CH.d__ch_dom_sale_cur_7d = calculateBgnToEur(io_CH.d__ch_dom_sale_cur_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_dom_cash_cur_7d = calculateBgnToEur(io_CH.d__ch_dom_cash_cur_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_sale_cur_7d = calculateBgnToEur(io_CH.d__ch_int_sale_cur_7d, fromCurrency, toCurrency, rate);
        io_CH.d__ch_int_cash_cur_7d = calculateBgnToEur(io_CH.d__ch_int_cash_cur_7d, fromCurrency, toCurrency, rate);

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
        io_CH.d__ch_cash_limit_bank = calculateBgnToEur(io_CH.d__ch_cash_limit_bank, fromCurrency, toCurrency, rate);
        io_CH.d__ch_sca_amt = calculateBgnToEur(io_CH.d__ch_sca_amt, fromCurrency, toCurrency, rate);

        return io_CH;
    }

    public static IO_Pac changeRecordsPAC(IO_Pac io_PAC, String fromCurrency, String toCurrency) {
        io_PAC.setD__pac_curcy_code(toCurrency);

        double rate = 1.95583;

        io_PAC.d__pac_avail_amt = calculateBgnToEur(io_PAC.d__pac_avail_amt, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_tot_auth_pend = calculateBgnToEur(io_PAC.d__pac_tot_auth_pend, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_tot_dc_aleu = calculateBgnToEur(io_PAC.d__pac_tot_dc_aleu, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_tot_dc_steu = calculateBgnToEur(io_PAC.d__pac_tot_dc_steu, fromCurrency, toCurrency, rate);

        rate = 2.00;

        io_PAC.d__pac_cash_limit = calculateBgnToEur(io_PAC.d__pac_cash_limit, fromCurrency, toCurrency, rate);
        io_PAC.d__pac_cash_limit_bank = calculateBgnToEur(io_PAC.d__pac_cash_limit_bank, fromCurrency, toCurrency,
                rate);

        return io_PAC;
    }

    public static String calculateBgnToEur(String val, String fromCurrency, String toCurrency, double rate) {
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

    /**
     * Getting one record from CH and multiplying it into CH_To
     * Getting one record from PAC and multiplying it into PAC_To
     */
    public static boolean populateDBs(String fileNameCH_From, String fileNameCH_To, String fileNamePAC_From,
                                      String fileNamePAC_To) {
        boolean returnValue = false;

        IO_CH io_CH = null;
        IO_Pac io_PAC;
        EnscribeFile dbFromCH = new EnscribeFile(fileNameCH_From);
        EnscribeFile dbToCH = new EnscribeFile(fileNameCH_To);

        EnscribeFile dbFromPAC = new EnscribeFile(fileNamePAC_From);
        EnscribeFile dbToPAC = new EnscribeFile(fileNamePAC_To);

        EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();
        Current tx;

        try {
            String searchingKey = "4402556222357326   ";
            dbFromCH.open(EnscribeOpenOptions.READ_ONLY, EnscribeOpenOptions.SHARED);
            io_CH = findByKeyCH_Exact(dbFromCH, searchingKey);
            if (io_CH != null) {
                searchingKey = "UNCR70001504562977";
                dbFromPAC.open(EnscribeOpenOptions.READ_ONLY, EnscribeOpenOptions.SHARED);
                io_PAC = findByKeyPAC_Exact(dbFromPAC, searchingKey);

                if (io_PAC != null) {
                    String chFormat = "9000000001";
                    String padding = "   ";
                    String pacFormat = "ZZSA00000001";

                    dbToCH.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);
                    dbToCH.purgeData();

                    dbToPAC.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);
                    dbToPAC.purgeData();

                    tx = new Current();

                    for (int i = 0; i < 1000000; i++) {
                        io_PAC.setD__pac_account_id(pacFormat + String.format("%06d", i));
                        io_PAC.setD__pac_curcy_code("975");

                        io_CH.setD__ch_card_pan_r(chFormat + String.format("%06d", i) + padding);
                        io_CH.setD__ch_curcy_code("975");
                        io_CH.setD__ch_account(io_PAC.getD__pac_account_id());
                        io_CH.setD__ch_account_ind("1");

//                        System.out.println("PAN: " + io_CH.getD__ch_card_pan_r() + " -> " + io_CH.getD__ch_card_pan_r().length());
                        // System.out.println(io_CH.getD__ch_curcy_code());
                        // System.out.println(io_CH.getD__ch_account());
                        // System.out.println(io_CH.getD__ch_account_ind());

//                        System.out.println("ACC: " + io_PAC.getD__pac_account_id() + " -> " + io_PAC.getD__pac_account_id().length());
                        // System.out.println(io_PAC.getD__pac_curcy_code());

                        tx.begin();
                        dbToCH.write(io_CH);
                        dbToPAC.write(io_PAC);
                        tx.commit(true);

                    }
                    returnValue = true;

                } else {
                    System.out.println("The key: " + searchingKey + " was not found in PAC!");
                }

            } else {
                System.out.println("The key: " + searchingKey + " was not found in CH!");
            }
        } catch (EnscribeFileException | FSException | IllegalArgumentException | DataConversionException e) {
//        } catch (EnscribeFileException | IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            String msg = ((io_CH == null) ? "null" : io_CH.getD__ch_card_pan_r() + " - " + io_CH.getD__ch_account());
            System.out.println("Error in: " + msg);
        } finally {
            dbToCH.close();
            dbToPAC.close();
        }

        return returnValue;
    }

    public static boolean checkIfExistsRecInCH(String fileNameCH, String searchingKey) {
        boolean returnValue = false;
        System.out.println("searchingKey: " + searchingKey + "->" + searchingKey.length());

        EnscribeFile dbCH = new EnscribeFile(fileNameCH);
        IO_CH io_CH = new IO_CH();

        try {
            dbCH.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);

            io_CH = Tools.findByKeyCH_Exact(dbCH, searchingKey);
            String msg = ((io_CH == null) ? "null" : io_CH.d__ch_card_pan_r);
            System.out.println("Founded: " + msg + " |");
            returnValue = true;
        } catch (EnscribeFileException | NullPointerException e) {
            String msg = io_CH == null ? "null" : io_CH.getD__ch_card_pan_r() + " - " + io_CH.getD__ch_account();
            System.out.println("Error in thread:  -> " + msg + " -> " + e.getMessage());
        } finally {
            dbCH.close();
        }

        return returnValue;
    }

    /**
     * Reading the entire file CH, finding IBAN(if exists) in PAC and changing the
     * currency in both files
     */
    public static boolean changeCurrency(String fileNameCH, String fileNamePAC, String fromCurrency,
                                          String toCurrency) {
        boolean returnValue = false;

        IO_CH io_CH = new IO_CH();
        IO_Pac io_PAC = new IO_Pac();

        EnscribeFile dbCH = new EnscribeFile(fileNameCH);
        EnscribeFile dbPAC = new EnscribeFile(fileNamePAC);
        EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();
        Current tx;

        try {
            io_CH.clear_All();

            int iCountCH = 0;
            int iCountTreatedCH = 0;
            int iCountPAC = 0;
            int iCountTreatedPAC = 0;

            dbCH.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);
            dbPAC.open(EnscribeOpenOptions.READ_WRITE, EnscribeOpenOptions.SHARED);

            tx = new Current();

            while (dbCH.read(io_CH) != -1) {
                // for (int i = 0; i < 100000; i++) {
                // dbCH.read(io_CH);

                iCountCH++;

                if ((io_CH.getD__ch_curcy_code().equals(fromCurrency))
                        || (io_CH.getD__ch_curcy_code().trim().equals("0"))) {

                    io_CH = changeRecordsCH(io_CH, fromCurrency, toCurrency);
                    // dbCH.writeUpdateUnlock(io_CH);
                    tx.begin();
                    dbCH.lockRecord();
                    // System.out.println("CH: " + io_CH.d__ch_dom_tot_max_7d + " |");
                    dbCH.writeUpdateUnlock(io_CH);
                    // tx.commit(true);
                    iCountTreatedCH++;

                    if (!io_CH.getD__ch_account().equals("000000000000000000")) {
                        kpa.setKeySpecifier((short) 0);
                        kpa.setKeyValue(io_CH.getD__ch_account());
                        kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
                        kpa.setKeyLength((short) 18);

                        dbPAC.keyPosition(kpa);

                        int bytesReaded = dbPAC.read(io_PAC);
                        if (bytesReaded > 0) {
                            iCountPAC++;
                            if ((io_PAC.getD__pac_curcy_code().equals(fromCurrency))
                                    || (io_PAC.getD__pac_curcy_code().trim().equals("0"))) {

                                io_PAC = changeRecordsPAC(io_PAC, fromCurrency, toCurrency);
                                // dbPAC.writeUpdateUnlock(io_PAC);
                                // tx.begin();
                                dbPAC.lockRecord();
                                // System.out.println("PAC: " + io_PAC.d__pac_curcy_code);
                                dbPAC.writeUpdateUnlock(io_PAC);
                                // tx.commit(true);
                                iCountTreatedPAC++;
                            }
                        } // else
                        // dbPAC.unlockRecord();
                    }
                    tx.commit(true);
                } // else
                // dbCH.unlockRecord();
            }

            // tx.commit(true);


            System.out.println();
            System.out.println("================================");
            System.out.println();

            System.out.println("Number of CH records: " + iCountCH);
            System.out.println("Number of treated CH records: " + iCountTreatedCH);
            System.out.println("Number of PAC records: " + iCountPAC);
            System.out.println("Number of treated PAC records: " + iCountTreatedPAC);

            returnValue = true;

        } catch (EnscribeFileException | DataConversionException | FSException e) {
            e.printStackTrace();
            String msg = (io_CH == null) ? "null" : io_CH.getD__ch_card_pan_r() + " - " + io_CH.getD__ch_account();
            System.out.println("Error in: " + msg);
        } finally {
            dbCH.close();
            dbPAC.close();
        }

        return returnValue;
    }

    /**
     * Reading the entire file CH, finding IBAN(if exists) in PAC and changing the
     * currency in both files
     *  Realised with threads - Callable interface
     */
    public static boolean changeCurrencyX2(String fileNameCH, String fileNamePAC, String fromCurrency,
                                           String toCurrency) {
        boolean returnValue = false;

        String[] fromBIN = { "9000000001000000   ", "9000000001100000   ", "9000000001200000   ", "9000000001300000   ",
                "9000000001400000   ", "9000000001500000   ", "9000000001600000   ", "9000000001700000   ",
                "9000000001800000   ", "9000000001900000   " };
        long[] toBIN = { 9000000001100000L, 9000000001200000L, 9000000001300000L, 9000000001400000L,
                9000000001500000L, 9000000001600000L, 9000000001700000L, 9000000001800000L,
                9000000001900000L, 9000000002000000L };

        Future<int[]> retCounters[] = new Future[10];

        ExecutorService service = Executors.newFixedThreadPool(10);
//        System.out.println("retCounters.length: " + retCounters.length);

        for (int i = 0; i < retCounters.length; i++) {
            retCounters[i] = service
                    .submit(new ThreadX2(fromBIN[i], toBIN[i], fromCurrency, toCurrency, fileNameCH, fileNamePAC, i));
        }

        // int iCountCH, int iCountTreatedCH, int iCountPAC, int iCountTreatedPAC
        int[] arrCounters = new int[4];

        for (int i = 0; i < retCounters.length; i++) {
            try {
                int[] arrCountersX = retCounters[i].get();

//                System.out.println();
//                System.out.print("Thread " + i + ": ");

                for (int j = 0; j < 4; j++) {
                    arrCounters[j] += arrCountersX[j];
//                    System.out.print(arrCountersX[j] + " ");
                }
//                System.out.println();
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Catch in main - retCounters[" + i + "].get() -> " + e.getMessage());
            }
        }

        service.shutdown();

        return returnValue;
    }

    /** Reading the entire file */
    public static boolean countCurcyCodes(String fileNameCH, String fileNamePAC) {
        boolean returnValue = false;
        EnscribeFile dbCH = new EnscribeFile(fileNameCH);
        EnscribeFile dbPAC = new EnscribeFile(fileNamePAC);
        IO_CH io_CH = new IO_CH();
        IO_Pac io_PAC = new IO_Pac();

        HashMap<String, Integer> currencyCodesCH = new HashMap<String, Integer>();
        HashMap<String, Integer> currencyCodesPAC = new HashMap<String, Integer>();

        Integer val = 1;
        int iCountCH = 0;
        int iCountPAC = 0;

        try {
            io_CH.clear_All();
            dbCH.open(EnscribeOpenOptions.READ_ONLY, EnscribeOpenOptions.SHARED);
            while (dbCH.read(io_CH) != -1) {
                iCountCH++;
                if(currencyCodesCH.containsKey(io_CH.d__ch_curcy_code)) {
                    val = currencyCodesCH.get(io_CH.d__ch_curcy_code);
                    val++;
                }
                currencyCodesCH.put(io_CH.d__ch_curcy_code, val);

            }
            val = 1;
            io_PAC.clear_All();
            dbPAC.open(EnscribeOpenOptions.READ_ONLY, EnscribeOpenOptions.SHARED);
            while (dbPAC.read(io_PAC) != -1) {
                iCountPAC++;
                if(currencyCodesPAC.containsKey(io_PAC.d__pac_curcy_code)) {
                    val = currencyCodesPAC.get(io_PAC.d__pac_curcy_code);
                    val++;
                }
                currencyCodesPAC.put(io_PAC.d__pac_curcy_code, val);
            }

            returnValue = true;

            System.out.println();

            System.out.println("Number of records CH: " + iCountCH);
            System.out.println(currencyCodesCH);
            System.out.println();
            System.out.println("Number of records PAC: " + iCountPAC);
            System.out.println(currencyCodesPAC);
            System.out.println();

        } catch (EnscribeFileException | DataConversionException e) {
            e.printStackTrace();
        } finally {
            dbCH.close();
        }

        return returnValue;
    }

    /**
     * Auxiliary method for Right padding.
     */
    public static String paddingRight(String inputString, int padLength, String character) {
        if (inputString.length() >= padLength) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder(inputString);
        while (sb.length() < padLength) {
            sb.append(character);
        }

        return sb.toString();
    }

    /**
     * Showing measured time
     */
    public static void showMeasuredTime(long timeStarted, long timeFinished, String message) {
        double d;
        long timeElapsed = timeFinished - timeStarted;

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println((message.trim().length() > 0 ? message + ": " : "") + timeElapsed + " ns");
        d = timeElapsed;
        System.out.println("                " + (d / 1000000) + " ms");
        System.out.println("                " + (d / 1000000000) + " s");
        System.out.println("                " + (d / 1000000000 / 60) + " min");
        System.out.println();
    }

}
