package Main;

public class Balance {

    private static double balance;
    //Calculating the final annual balance
    public static void setBalance() {balance = Income.getIncome() - Expenses.getAnnualExpenses();}
    public static double getBalance() {return balance;}


}
