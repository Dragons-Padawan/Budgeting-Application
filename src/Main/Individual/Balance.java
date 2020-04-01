package Main.Individual;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Balance {

    //finding the currently logged in user
    private static String userName = System.getProperty("user.name");
    private static double balance;
    //Calculating the final annual balance
    public static void setBalance() throws IOException {
        System.out.println("Do you have any credit cards? (Y/N)");
        char creditChoice = Income.input.next().toUpperCase().charAt(0);
        if (creditChoice == 'Y') {
            CreditCardInterest.Welcome();
            System.out.print("Do you want to add your credit card to your expense sheet? (Y/N)");
            char addCredit = Income.input.next().toUpperCase().charAt(0);
            if (addCredit == 'Y') {
                Expenses.addExpenses();
                balance = Income.getIncome() - Expenses.getAnnualExpenses();
                setFileName();
            } else if (addCredit == 'N') {
                balance = Income.getIncome() - Expenses.getAnnualExpenses();
                setFileName();
            }

        } else if (creditChoice == 'N') {
            balance = Income.getIncome() - Expenses.getAnnualExpenses();
            setFileName();
        } else {
            System.out.println("Invalid Entry: ");
            setBalance();
        }
    }
    //Returning the overall balance
    public static double getBalance() {return balance;}
    //Naming the file that data will be saved to
    public static void setFileName() throws IOException {
        System.out.print("Enter a name for the .txt file: ");
        String fileName = Income.input.nextLine();
        balanceReturn(fileName);
    }
    //Sending Data to a .txt file w/ full formatting
    public static void balanceReturn(String filename) throws IOException {
        String boldLine = "|=======================================================================================================================================|\n";
        String smallLine = "|---------------------------------------------------------------------------------------------------------------------------------------|\n";
        String title = "|\t\tAnnual Income\t\t\t|\tAmount\t\t|\t\tAnnual Expenses\t\t|\tAmount\t\t|\n";
        String lineOne = "| Salary\t\t\t\t\t|\t$" + Income.getAnnualIncome() + "\t| Mortgage\t\t\t\t|\t$" + Expenses.expenses.get("Mortgage") + "\t|\n";
        String lineTwo = "|\t\t\t\t\t\t|\t\t\t| Electricity\t\t\t\t| \t$" + Expenses.expenses.get("Electricity") + "\t\t|\n";
        String lineThree = "|\t\t\t\t\t\t|\t\t\t| Gas\t\t\t\t\t| \t$" + Expenses.expenses.get("Gas") + "\t|\n";
        String lineFour = "|\t\t\t\t\t\t|\t\t\t| Water\t\t\t\t\t| \t$" + Expenses.expenses.get("Water") + "  \t|\n";
        String lineFive = "|\t\t\t\t\t\t|\t\t\t| Internet\t\t\t\t| \t$" + Expenses.expenses.get("Internet") + " \t|\n";
        String lineSix = "|\t\t\t\t\t\t|\t\t\t| Cable\t\t\t\t\t| \t$" + Expenses.expenses.get("Cable") + " \t|\n";
        String lineSeven = "|\t\t\t\t\t\t|\t\t\t| Food\t\t\t\t\t| \t$" + Expenses.expenses.get("Food") + " \t|\n";
        String lineEight = "|\t\t\t\t\t\t|\t\t\t| HealthCare\t\t\t\t| \t$" + Expenses.expenses.get("HealthCare") + " \t|\n";
        String lineNine = "|\t\t\t\t\t\t|\t\t\t| Entertainment\t\t\t\t| \t$" + Expenses.expenses.get("Entertainment") + "\t|\n";
        String lineTen = "|\t\t\t\t\t\t|\t\t\t| Clothes\t\t\t\t| \t$" + Expenses.expenses.get("Clothes") + " \t|\n";
        String lineEleven = "|\t\t\t\t\t\t|\t\t\t| Education\t\t\t\t| \t$" + Expenses.expenses.get("Education") + " \t|\n";
        String lineTwelve = "|\t\t\t\t\t\t|\t\t\t| Miscellaneous\t\t\t\t| \t$" + Expenses.expenses.get("Miscellaneous") + " \t|\n";
        String lineThirteen = "|\t\t\t\t\t\t|\t\t\t| Personal Care\t\t\t\t| \t$" + Expenses.expenses.get("Personal Care") + " \t|\n";
        String lineFourteen =  "|\t\tTotal Income\t\t\t| \t$" + Income.getAnnualIncome() + "\t|\t\tTotal Expenses\t\t| \t$" + Expenses.getAnnualExpenses() + "\t|\n";
        String lineFifteen = "|\t\t\t\t\t\t\t\t\t\t\tAnnual Balance\t\t| \t$" + getBalance() + "\t\t|\n";

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
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineFourteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), smallLine.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), lineFifteen.getBytes(), StandardOpenOption.APPEND);
        Files.write(Paths.get("C:\\Users\\" + userName + "\\Documents\\" + filename + ".txt"), boldLine.getBytes(), StandardOpenOption.APPEND);
    }
}
