package Main.Individual;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class Balance {

    //finding the currently logged in user
    private static String userName = System.getProperty("user.name"),
            boldLine, smallLine, title, lineOne, lineTwo, lineThree, lineFour,
            lineFive, lineSix, lineSeven, lineEight, lineNine, lineTen, lineEleven,
            lineTwelve, lineThirteen, lineFourteen, lineFifteen, lineSixteen;
    private static double balance;
    //Calculating the final annual balance
    public static void setBalance() throws IOException {
        balance = Income.getIncome() - Expenses.getAnnualExpenses();
        setFileName();
    }
    //Returning the overall balance
    public static double getBalance() {return balance;}
    //Naming the file that data will be saved to
    public static void setFileName() throws IOException {
        System.out.print("\nEnter a name for the .txt file: ");
        String fileName = Income.input.nextLine();
        balanceReturn(fileName);
    }
    //Sending Data to a .txt file w/ full formatting
    public static void result() {
        DecimalFormat df = new DecimalFormat("##.##");
        boldLine = "=======================================================================================================================================\n";
        smallLine = "---------------------------------------------------------------------------------------------------------------------------------------\n";
        title = "\t\tAnnual Income\t\t\t|\tAmount\t\t|\t\tAnnual Expenses\t\t|\tAmount\t\t\n";
        lineOne = " Salary\t\t\t\t\t\t|\t$" + df.format(Income.getAnnualIncome()) + "\t\t| Mortgage\t\t\t\t|\t$" + df.format(Expenses.expenses.get("Mortgage")) + "\t\n";
        lineTwo = "\t\t\t\t\t\t|\t\t\t| Electricity\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Electricity")) + "\t\t\n";
        lineThree = "\t\t\t\t\t\t|\t\t\t| Natural Gas\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Natural Gas")) + "\t\n";
        lineFour = "\t\t\t\t\t\t|\t\t\t| Water\t\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Water")) + "  \t\n";
        lineFive = "\t\t\t\t\t\t|\t\t\t| Internet\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Internet")) + " \t\n";
        lineSix = "\t\t\t\t\t\t|\t\t\t| Cable\t\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Cable")) + " \t\n";
        lineSeven = "\t\t\t\t\t\t|\t\t\t| Food\t\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Food")) + " \t\n";
        lineEight = "\t\t\t\t\t\t|\t\t\t| HealthCare\t\t\t\t| \t$" + df.format(Expenses.expenses.get("HealthCare")) + " \t\n";
        lineNine = "\t\t\t\t\t\t|\t\t\t| Entertainment\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Entertainment")) + "\t\n";
        lineTen = "\t\t\t\t\t\t|\t\t\t| Clothes\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Clothes")) + " \t\n";
        lineEleven = "\t\t\t\t\t\t|\t\t\t| Education\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Education")) + " \t\n";
        lineTwelve = "\t\t\t\t\t\t|\t\t\t| Credit Cards\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Credit Cards")) + " \t\n";
        lineThirteen = "\t\t\t\t\t\t|\t\t\t| Miscellaneous\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Miscellaneous")) + " \t\n";
        lineFourteen = "\t\t\t\t\t\t|\t\t\t| Personal Care\t\t\t\t| \t$" + df.format(Expenses.expenses.get("Personal Care")) + " \t\n";
        lineFifteen = "\t\tTotal Income\t\t\t| \t$" + df.format(Income.getAnnualIncome()) + "\t\t|\t\tTotal Expenses\t\t| \t$" + df.format(Expenses.getAnnualExpenses()) + "\t\n";
        lineSixteen = "\t\t\t\t\t\t\t\t\t\t\tAnnual Balance\t\t| \t$" + df.format(getBalance()) + "\t\t\n";
    }
    public static void balanceReturn(String filename) throws IOException {
        result();
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), boldLine.getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), title.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), smallLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineOne.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineTwo.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineThree.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineFour.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineFive.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineSix.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineSeven.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineEight.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineNine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineTen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineEleven.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineTwelve.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineThirteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineFourteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineFifteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), smallLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineSixteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), "\n\n".getBytes(), StandardOpenOption.APPEND);
    }
}
