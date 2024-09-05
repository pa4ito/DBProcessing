import com.tandem.ext.enscribe.EnscribeFile;
import com.tandem.ext.enscribe.EnscribeFileException;
import com.tandem.ext.enscribe.EnscribeOpenOptions;
import dpkg.IO_CH;
import dpkg.IO_Pac;

import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        String fileNameCH_From = new String("$APPLE.DOVIEMDI.MDICH");
        String fileNameCH_To = new String("$APPLC.PLAMEN.MDICH");

        String fileNamePAC_From = new String("$APPLE.DOVIEMDI.MDIPAC");
        String fileNamePAC_To = new String("$APPLC.PLAMEN.MDIPAC");

        String currencyFrom = "975";
        String currencyTo = "978";

        String searchingKey = "0000000000000000000";

        // Time measuring...
        long timeStarted, timeFinished;

        if (args.length < 1) {
            showHelp();
        }

        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        // Measuring the time... Starting
        timeStarted = System.nanoTime();

        switch (args[0]) {
            case "check":
                if (args.length > 1) {
                    searchingKey = Tools.paddingRight(args[1], 19, " ");
                }

                if (!Tools.checkIfExistsRecInCH(fileNameCH_To, searchingKey)) {
                    System.out.println("There was a problem reading " + fileNameCH_To);
                }
                break;

            case "insert":
                if (Tools.populateDBs(fileNameCH_From, fileNameCH_To, fileNamePAC_From,
                        fileNamePAC_To)) {
                    System.out.println("All records have been inserted");
                }
                break;

            case "change":
                if (args.length < 2) {
                    showHelp();
                }

                if (args.length == 4) {
                    currencyFrom = args[2];
                    currencyTo = args[3];
                }

                switch (args[1]) {
                    case "consistent":
                        if (Tools.changeCurrency(fileNameCH_To, fileNamePAC_To, currencyFrom, currencyTo)) {
                            System.out.println("All records have been treated");
                        }
                        break;

                    case "threadX2":
                    case "threadx2":
                        if (Tools.changeCurrencyX2(fileNameCH_To, fileNamePAC_To, currencyFrom, currencyTo)) {
                            System.out.println("All records have been treated");
                        }
                        break;
                }
                break;

            case "count":
                if (!Tools.countCurcyCodes(fileNameCH_To, fileNamePAC_To))
                    System.out.println("There was a problem reading " + fileNameCH_To);
                break;

            default:
                showHelp();
                break;
        }

        // Measuring the time...Finishing
        timeFinished = System.nanoTime();

        Tools.showMeasuredTime(timeStarted, timeFinished, "Elapsed time");

        myObj = LocalTime.now();
        System.out.println(myObj);

    }

    private static void showHelp() {
        System.out.println("Should be started as described below ...");
        System.out.println("Main <operation> [arg] [arg] [arg]");
        System.out.println("   operations: ");
        System.out.println("      \"insert\"  - populates CH and PAC");
        System.out.println("      \"check\" <SearchingPAN> - checks if record exists in CH.");
        System.out.println("                             By default searchingPAN = \"0000000000000000000\"");
        System.out.println("      \"change\" <type> <CurrencyFrom> <CurrencyTo> - changes currency in CH and PAC.");
        System.out.println("             <type> = ");
        System.out.println("                     \"consistent\" - change file row by row");
        System.out.println("                     \"threadX2\"   - change file using threads(Callable interface)");
        System.out.println("              By default CurrencyFrom = 975, CurrencyTo = 978");
        System.out.println("      \"count\" - counts and displays the number of currencies with their count");
        System.out.println();
        System.exit(0);
    }


}