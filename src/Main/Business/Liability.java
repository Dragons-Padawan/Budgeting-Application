package Main.Business;

import Main.Individual.Income;

import java.util.HashMap;

public class Liability {

    public static HashMap<String, Double> currentLiabilities = new HashMap<>();
    public static HashMap<String, Double> nonCurrentLiabilities = new HashMap<>();
    private static double liabilities, current = 0.00, nonCurrent = 0.00;

    //Setting up the Liabilities for a small business
    public static void setCurrentLiabilities() {
        currentLiabilities.put("Accounts Payable", 0.00);
        currentLiabilities.put("Notes Payable", 0.00);
        currentLiabilities.put("Short-Term Loans", 0.00);
        currentLiabilities.put("Current Portions of Long-Term Debt", 0.00);
        currentLiabilities.put("Accrued Expenses", 0.00);
        currentLiabilities.put("Unearned Revenue", 0.00);
        currentLiabilities.put("Other Short-Term Debts", 0.00);
    }
    public static void setNonCurrentLiabilities() {
        nonCurrentLiabilities.put("Long-Term Business Loan 1", 0.00);
        nonCurrentLiabilities.put("Long-Term Business Loan 2", 0.00);
        nonCurrentLiabilities.put("Long-Term Business Loan 3", 0.00);
        nonCurrentLiabilities.put("Long-Term Business Loan 4", 0.00);
        nonCurrentLiabilities.put("Long-Term Business Loan 5", 0.00);
    }
    public static void setCurrentLiabilitiesValues() {
        System.out.println("\t* * * Current Liabilities * * *");
        for (String key: currentLiabilities.keySet()) {
            double value = 0.00;
            System.out.print("Enter the value for " + key + ": ");
            value = Income.input.nextDouble();
            Income.input.nextLine();
            currentLiabilities.put(key, value);
        }
    }
    public static void setNonCurrentLiabilitiesValues() {
        System.out.println("\t* * * NON-Current Liabilities * * *");
        for (String key: nonCurrentLiabilities.keySet()) {
            double value = 0.00;
            System.out.print("\nEnter the value for " + key + ": ");
            value = Income.input.nextDouble();
            Income.input.nextLine();
            currentLiabilities.put(key, value);
        }
    }
    public static void totalLiabilities() {
        for (double value: currentLiabilities.values()) {
            current += value;
        }
        for (double value: nonCurrentLiabilities.values()) {
            nonCurrent += value;
        }
        liabilities = current + nonCurrent;
    }
    public static double getLiabilities() {return liabilities;}










}
