package Main.Individual;

import com.sun.jdi.Value;

import java.util.HashMap;

public class Expenses {

    public static HashMap<String, Double> expenses = new HashMap<>();
    private static double annualExpenses;

    //setting up the initial expenses
    public static void setExpenses() {
        expenses.put("Mortgage", 0.00);
        expenses.put("Transportation", 0.00);
        expenses.put("Electricity", 0.00);
        expenses.put("Natural Gas", 0.00);
        expenses.put("Water", 0.00);
        expenses.put("Internet", 0.00);
        expenses.put("Cable", 0.00);
        expenses.put("Food", 0.00);
        expenses.put("HealthCare", 0.00);
        expenses.put("Entertainment", 0.00);
        expenses.put("Clothes", 0.00);
        expenses.put("Education", 0.00);
        expenses.put("Miscellaneous", 0.00);
        expenses.put("Personal Care", 0.00);
        expenses.put("Credit Cards", 0.00);
    }
    public static void setExpenseValues() {
        for (String key: expenses.keySet()) {
            double value = 0.00;
            System.out.print("Enter a monthly value for " + key + ": ");
            value = Income.input.nextDouble();
            Income.input.nextLine();
            expenses.put(key, (value * 12));
        }
    }
    //Calculating the annual cost
    public static void setAnnualExpenses() {
        for (double expense: expenses.values()) {
            annualExpenses += expense;
        }
    }
    public static double getAnnualExpenses() {return (double) Math.round(annualExpenses);}
}
