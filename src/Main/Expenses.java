package Main;

import java.util.HashMap;


public class Expenses {

    private static HashMap<String, Double> expenses = new HashMap<>();
    private static double annualExpenses;

    //setting up the initial expenses
    public static void setExpenses() {
        expenses.put("Mortgage", 12348.00);
        expenses.put("Transportation", 9907.20);
        expenses.put("Electricity", 1212.00);
        expenses.put("Gas", 1694.28);
        expenses.put("Water", 477.00);
        expenses.put("Internet", 794.04);
        expenses.put("Cable", 1200.00);
        expenses.put("Food", 6600.00);
        expenses.put("HealthCare", 6888.00);
        expenses.put("Entertainment", 2481.96);
        expenses.put("Clothes", 1932.00);
        expenses.put("Education", 2496.00);
        expenses.put("Miscellaneous", 959.04);
        expenses.put("Personal Care", 707.04);
    }
    //Adding any additional expenses
    public static void addExpenses() {
        System.out.print("\nWhat is this new expense called: ");
        String newExpense = Income.input.nextLine();
        Income.input.nextLine();
        System.out.print("\nHow much does the new expense cost monthly? ");
        double newExpenseCost = Income.input.nextDouble() * 12;
        Income.input.nextLine();
        expenses.put(newExpense, newExpenseCost);
    }
    //Printing expenses in a formatting
    public static void getExpenses() {
        System.out.println("Mortgage: " + expenses.get("Mortgage") + "\nTransportation: " + expenses.get("Transportation"));
        System.out.println("Electricity: " + expenses.get("Electricity") + "\nGas: " + expenses.get("Gas"));
        System.out.println("Water: " + expenses.get("Water") + "\nInternet: " + expenses.get("Internet"));
        System.out.println("Cable: " + expenses.get("Cable") + "\nFood: " + expenses.get("Food"));
        System.out.println("HealthCare: " + expenses.get("HealthCare") + "\nEntertainment: " + expenses.get("Entertainment"));
        System.out.println("Clothes: " + expenses.get("Clothes") + "\nEducation: " + expenses.get("Education"));
        System.out.println("Miscellaneous: " + expenses.get("Miscellaneous") + "\nPersonal Care: " + expenses.get("Personal Care"));
    }
    //adding together all the expenses to get an annual cost
    public static void setAnnualExpenses() {
        for (double expense: expenses.values()) {
            annualExpenses += expense;
        }
    }
    public static double getAnnualExpenses() {return (double) Math.round(annualExpenses);}
}
