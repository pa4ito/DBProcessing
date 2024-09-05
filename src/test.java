import com.tandem.ext.enscribe.EnscribeFile;
import com.tandem.ext.enscribe.EnscribeFileException;
import com.tandem.ext.enscribe.EnscribeKeyPositionOptions;
import com.tandem.ext.enscribe.EnscribeOpenOptions;
import com.tandem.ext.util.DataConversionException;
import com.tandem.util.FSException;
import dpkg.IO_CH;
import dpkg.IO_Pac;

import java.time.LocalTime;
import java.util.HashMap;

public class test {
    static String fileNameCH_From = new String("$APPLE.DOVIEMDI.MDICH");
    static String fileNameCH_To = new String("$APPLC.PLAMEN.MDICH");

    static String fileNamePAC_From = new String("$APPLE.DOVIEMDI.MDIPAC");
    static String fileNamePAC_To = new String("$APPLC.PLAMEN.MDIPAC");

    static String currencyFrom = "975";
    static String currencyTo = "978";

    static String searchingKey = "0000000000000000000";

    private static EnscribeFile dbCH;
    private static EnscribeFile dbPAC;

    private static IO_CH io_CH;
    private static IO_Pac io_PAC;

    public static void main(String[] args) {
        byte[] _buffer = new byte[150];

        dbPAC = new EnscribeFile(fileNamePAC_To);
        io_PAC = new IO_Pac();

        searchingKey = "ZZSA00000001000000";

        EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();


        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        // Time measuring...
        long timeStarted, timeFinished;

        // Measuring the time... Starting
        timeStarted = System.nanoTime();

        try {
            dbPAC.open(EnscribeOpenOptions.READ_ONLY, EnscribeOpenOptions.SHARED);
            kpa.setKeySpecifier((short) 0);
            kpa.setKeyValue(searchingKey);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short) 18);

            dbPAC.keyPosition(kpa);

            dbPAC.read(_buffer, _buffer.length);

            structPAC sPAC = new structPAC(_buffer);
            System.out.println("AccountID: " + sPAC.getAccountID());
            System.out.println("TotDcSteu: " + sPAC.getTotDcSteu());
            System.out.println("AvailAmt: " + sPAC.getAvailAmt());
            System.out.println("CachLimitDate: " + sPAC.getCachLimitDate());
            System.out.println("CurcyCode: " + sPAC.getCurcyCode());

            sPAC.setAccountID("ZZSA12345678901234");
            sPAC.setTotDcSteu(1234);
            sPAC.setAvailAmt(-4321);
            sPAC.setCachLimitDate(240904);
            sPAC.setCurcyCode(978);

            System.out.println("AccountID: " + sPAC.getAccountID());
            System.out.println("TotDcSteu: " + sPAC.getTotDcSteu());
            System.out.println("AvailAmt: " + sPAC.getAvailAmt());
            System.out.println("CachLimitDate: " + sPAC.getCachLimitDate());
            System.out.println("CurcyCode: " + sPAC.getCurcyCode());

        } catch (EnscribeFileException e) {
            throw new RuntimeException(e);
        } finally {
            dbPAC.close();
        }

        // Measuring the time...Finishing
        timeFinished = System.nanoTime();

        Tools.showMeasuredTime(timeStarted, timeFinished, "Elapsed time with structPAC");

        System.out.println("-----------------------------------");

        myObj = LocalTime.now();
        System.out.println(myObj);


        // Measuring the time... Starting
        timeStarted = System.nanoTime();

        try {
            dbPAC.open(EnscribeOpenOptions.READ_ONLY, EnscribeOpenOptions.SHARED);
            kpa.setKeySpecifier((short) 0);
            kpa.setKeyValue(searchingKey);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short) 18);

            dbPAC.keyPosition(kpa);

            dbPAC.read(io_PAC);

            System.out.println();
            System.out.println("AccountID: " + io_PAC.d__pac_account_id);
            System.out.println("TotDcSteu: " + io_PAC.d__pac_tot_dc_steu);
            System.out.println("AvailAmt: " + io_PAC.d__pac_avail_amt);
            System.out.println("CachLimitDate: " + io_PAC.d__pac_cash_limit_date_r);
            System.out.println("CurcyCode; " + io_PAC.d__pac_curcy_code);

            io_PAC.d__pac_account_id = "ZZSA12345678901234";
            io_PAC.d__pac_tot_dc_steu = "+        1234";
            io_PAC.d__pac_avail_amt = "-        4321";
            io_PAC.d__pac_cash_limit_date_r = "240904";
            io_PAC.d__pac_curcy_code = "978";

            System.out.println();
            System.out.println("AccountID: " + io_PAC.d__pac_account_id);
            System.out.println("TotDcSteu: " + io_PAC.d__pac_tot_dc_steu);
            System.out.println("AvailAmt: " + io_PAC.d__pac_avail_amt);
            System.out.println("CachLimitDate: " + io_PAC.d__pac_cash_limit_date_r);
            System.out.println("CurcyCode; " + io_PAC.d__pac_curcy_code);

        } catch (EnscribeFileException | DataConversionException e) {
            throw new RuntimeException(e);
        } finally {
            dbPAC.close();
        }

        // Measuring the time...Finishing
        timeFinished = System.nanoTime();

        Tools.showMeasuredTime(timeStarted, timeFinished, "Elapsed time with io_PAC");

        myObj = LocalTime.now();
        System.out.println(myObj);

    }

}
