package Main.Business;

import Main.Individual.Balance;
import Main.Individual.CreditCardInterest;
import Main.Individual.Expenses;
import Main.Individual.Income;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BusinessBalance {
    private static String userName = System.getProperty("user.name"),
            boldLine, smallLine, title, lineOne, lineTwo, lineThree, lineFour,
            lineFive, lineSix, lineSeven, lineEight, lineNine, lineTen, lineEleven,
            lineTwelve, lineThirteen, lineFourteen, lineFifteen, lineSixteen;
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
            System.out.print("Enter a name for the .txt file: ");
            String fileName = Income.input.nextLine();
            balanceReturn(fileName);
        }
    //Sending Data to a .txt file w/ full formatting
    public static void result() {
        boldLine = "=======================================================================================================================================\n";
        smallLine = "---------------------------------------------------------------------------------------------------------------------------------------\n";
        title = "|\t\tAssets\t\t\t|\tAmount\t\t|\t\tLiabilities\t\t|\tAmount\t\t\n";
        lineOne = "| Checking Account\t\t|\t$" + Income.getAnnualIncome() + "\t| Mortgage\t\t\t\t|\t$" + Expenses.expenses.get("Mortgage") + "\t\n";
        lineTwo = "| Saving Account\t\t|\t$| Electricity\t\t\t\t| \t$" + Expenses.expenses.get("Electricity") + "\t\t\n";
        lineThree = "| Petty Cash\t\t|\t$| Gas\t\t\t\t\t| \t$" + Expenses.expenses.get("Gas") + "\t\n";
        lineFour = "| Accounts Receivable\t\t|\t$| Water\t\t\t\t\t| \t$" + Expenses.expenses.get("Water") + "  \t\n";
        lineFive = "| Inventory\t\t|\t$| Internet\t\t\t\t| \t$" + Expenses.expenses.get("Internet") + " \t\n";
        lineSix = "| Pre-Paid Insurance\t\t|\t$| Cable\t\t\t\t\t| \t$" + Expenses.expenses.get("Cable") + " \t\n";
        lineSeven = "|\tTotal Current Assets\t\t|\t$| Food\t\t\t\t\t| \t$" + Expenses.expenses.get("Food") + " \t\n";
        lineEight = "| Accumulated Depreciation\t\t|\t$| HealthCare\t\t\t\t| \t$" + Expenses.expenses.get("HealthCare") + " \t\n";
        lineNine = "| Computer\t\t|\t$| Entertainment\t\t\t\t| \t$" + Expenses.expenses.get("Entertainment") + "\t\n";
        lineTen = "| Building\t\t|\t$| Clothes\t\t\t\t| \t$" + Expenses.expenses.get("Clothes") + " \t\n";
        lineEleven = "| Land\t\t|\t$| Education\t\t\t\t| \t$" + Expenses.expenses.get("Education") + " \t\n";
        lineTwelve = "|\tTotal Non-Current Assets\t\t|\t$| Miscellaneous\t\t\t\t| \t$" + Expenses.expenses.get("Miscellaneous") + " \t\n";
        lineThirteen = "|\t\t\t\t\t\t|\t\t\t| Personal Care\t\t\t\t| \t$" + Expenses.expenses.get("Personal Care") + " \t\n";
        lineFourteen = "|\t\tTotal Income\t\t\t| \t$" + Income.getAnnualIncome() + "\t|\t\tTotal Expenses\t\t| \t$" + Expenses.getAnnualExpenses() + "\t\n";
        lineFifteen = "|\tTotal Assets\t\t|\t$\t\t\t\t\t\tAnnual Balance\t\t| \t$" + Balance.getBalance() + "\t\t\n";
        lineSixteen = "\n\n";
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
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineFourteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), smallLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineFifteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\"+ userName +"\\Documents\\" + filename + ".txt"), lineSixteen.getBytes(), StandardOpenOption.APPEND);

    }
}