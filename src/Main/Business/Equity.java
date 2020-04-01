package Main.Business;

import Main.Individual.Income;

import java.util.HashMap;

public class Equity {

    public static HashMap<String, Double> equity = new HashMap<>();
    private static double equityBalance;

    public static void setEquity() {
        equity.put("Owner's Capital", 0.00);
        equity.put("Retained Earnings", 0.00);
    }
    public static void setEquityValue() {
        System.out.println(" * * * Equity * * * ");
        for (String key: equity.keySet()) {
            double value = 0.00;
            System.out.print("Enter a value for " + key + ": ");
            value = Income.input.nextDouble();
            Income.input.nextLine();
            equity.put(key, value);
        }
    }
    public static double getEquityBalance() {
        for (double value: equity.values()) {
            equityBalance += value;
        }
        return equityBalance;
    }
}
