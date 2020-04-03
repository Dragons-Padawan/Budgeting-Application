package Main.Business;

import Main.Individual.Balance;
import Main.Individual.CreditCardInterest;
import Main.Individual.Expenses;
import Main.Individual.Income;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class BusinessBalance {
    private static String userName = System.getProperty("user.name"),
            boldLine, smallLine, title, lineOne, lineTwo, lineThree, lineFour,
            lineFive, lineSix, lineSeven, lineEight, lineNine, lineTen, lineEleven,
            lineTwelve, lineThirteen, lineFourteen, lineFifteen, lineSixteen,
            lineSeventeen, lineEighteen, lineNineteen;
    private static double assetBalance, liabilityBalance, equityBalance, liabilitiesAndEquity;
    //Calculating the final balance
    public static void runningMethods() throws IOException {
        //Setting the Assets for the business
        Asset.setCurrentAsset();
        Asset.setNonCurrentAsset();
        Asset.setCurrentAssetValue();
        Asset.setNonCurrentAssetValue();
        Asset.totalAssets();
        //Setting the Liabilities for the business
        Liability.setCurrentLiabilities();
        Liability.setNonCurrentLiabilities();
        Liability.setCurrentLiabilitiesValues();
        Liability.setNonCurrentLiabilitiesValues();
        Liability.totalLiabilities();
        //Setting the Equity for the business
        Equity.setEquity();
        Equity.setEquityValue();
        //Setting the balance
        setBalance();
    }
    public static void setBalance() throws IOException {
        assetBalance = Asset.getAssets();
        liabilityBalance = Liability.getLiabilities();
        equityBalance = Equity.getEquityBalance();
        liabilitiesAndEquity = liabilityBalance + equityBalance;
        setFileName();
            }
    //Naming the file that data will be saved to
    public static void setFileName() throws IOException {
            System.out.println("\n * * * File Name * * * ");
            System.out.print("Enter a name for the .txt file: ");
            String fileName = Income.input.nextLine();
            balanceReturn(fileName);
        }
    //Sending Data to a .txt file w/ full formatting
    public static void result() {
        DecimalFormat df = new DecimalFormat("##.##");
        boldLine = "=======================================================================================================================================\n";
        smallLine = "---------------------------------------------------------------------------------------------------------------------------------------\n";
        title = "|\t\tAssets\t\t\t|\tAmount\t\t|\t\tLiabilities\t\t\t|\tAmount\t\t\n";
        lineOne = "| Checking Account\t\t\t|\t$" + df.format(Asset.currentAsset.get("Checking Account")) + "\t| Accounts Payable\t\t\t\t\t|\t$" + df.format(Liability.currentLiabilities.get("Accounts Payable")) + "\t\n";
        lineTwo = "| Saving Account\t\t\t|\t$" + df.format(Asset.currentAsset.get("Saving Account")) + "\t| Note Payable\t\t\t\t\t\t| \t$" + df.format(Liability.currentLiabilities.get("Notes Payable")) + "\t\t\n";
        lineThree = "| Petty Cash\t\t\t\t|\t$" + df.format(Asset.currentAsset.get("Petty Cash")) + "\t| Short-term Loans\t\t\t\t\t| \t$" + df.format(Liability.currentLiabilities.get("Short-Term Loans")) + "\t\n";
        lineFour = "| Accounts Receivable\t\t\t|\t$" + df.format(Asset.currentAsset.get("Accounts Receivable")) + "\t| Long-Term Debt\t\t\t\t\t| \t$" + df.format(Liability.currentLiabilities.get("Current Portions of Long-Term Debt")) + "  \t\n";
        lineFive = "| Inventory\t\t\t\t|\t$" + df.format(Asset.currentAsset.get("Inventory")) + "\t| Accrued Expenses\t\t\t\t\t| \t$" + df.format(Liability.currentLiabilities.get("Accrued Expenses")) + " \t\n";
        lineSix = "| Pre-Paid Insurance\t\t\t|\t$" + df.format(Asset.currentAsset.get("PrePaid Insurance")) + "\t| Unearned Revenue\t\t\t\t\t| \t$" + df.format(Liability.currentLiabilities.get("Unearned Revenue")) + " \t\n";
        lineSeven = "|\tTotal Current Assets\t\t|\t$" + df.format(Asset.current) + "\t| Other\t\t\t\t\t\t\t| \t$" + df.format(Liability.currentLiabilities.get("Other Short-Term Debts")) + " \t\n";
        lineEight = "| Accumulated Depreciation\t\t|\t$" + df.format(Asset.nonCurrentAsset.get("Accumulated Depreciation")) + "\t| \tTotal Current Liabilities\t\t\t| \t$" + df.format(Liability.current) + " \t\n";
        lineNine = "| Computer\t\t\t\t|\t$" + df.format(Asset.nonCurrentAsset.get("Computer")) + "\t| Business Loan 1\t\t\t\t\t| \t$" + df.format(Liability.nonCurrentLiabilities.get("Long-Term Business Loan 1")) + "\t\n";
        lineTen = "| Building\t\t\t\t|\t$" + df.format(Asset.nonCurrentAsset.get("Building")) + "\t| Business Loan 2\t\t\t\t\t| \t$" + df.format(Liability.nonCurrentLiabilities.get("Long-Term Business Loan 2")) + " \t\n";
        lineEleven = "| Land\t\t\t\t\t|\t$" + df.format(Asset.nonCurrentAsset.get("Land")) + "\t| Business Loan 3\t\t\t\t\t| \t$" + df.format(Liability.nonCurrentLiabilities.get("Long-Term Business Loan 3")) + " \t\n";
        lineTwelve = "|\tTotal Non-Current Assets\t|\t$" + df.format(Asset.nonCurrent) + "\t| Business Loan 4\t\t\t\t\t| \t$" + df.format(Liability.nonCurrentLiabilities.get("Long-Term Business Loan 4")) + " \t\n";
        lineThirteen = "|\t\t\t\t\t|\t\t| Business Loan 5\t\t\t\t\t| \t$" + df.format(Liability.nonCurrentLiabilities.get("Long-Term Business Loan 5")) + " \t\n";
        lineFourteen = "|\t\t\t\t\t|\t\t| \tTotal Non-Current Liabilities\t\t\t| \t$" + df.format(Liability.nonCurrent) + " \t\n";
        lineFifteen = "|\t\t\t\t\t|\t\t| Owner's Capital\t\t\t\t\t| \t$" + df.format(Equity.equity.get("Owner's Capital")) + " \t\n";
        lineSixteen = "|\t\t\t\t\t|\t\t| Retained Earnings\t\t\t\t\t| \t$" + df.format(Equity.equity.get("Retained Earnings")) + " \t\n";
        lineSeventeen = "|\tTotal Assets\t\t\t| \t$" + df.format(Asset.assets) + "\t|\tTotal Equity\t\t\t\t\t| \t$" + df.format(Equity.equityBalance) + "\t\n";
        lineEighteen = "|\t\t\t\t\t\t\t\tLiabilities & Equity\t\t\t\t| \t$" + df.format(liabilitiesAndEquity) + "\t\t\n";
        lineNineteen = "\n\n";
    }
    public static void balanceReturn(String filename) throws IOException {
        result();
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), title.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), smallLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineOne.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineTwo.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineThree.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineFour.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineFive.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineSix.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineSeven.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineEight.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineNine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineTen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineEleven.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineTwelve.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineThirteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineFourteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineFifteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineSixteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineSeventeen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineEighteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineNineteen.getBytes(), StandardOpenOption.APPEND);

    }
}