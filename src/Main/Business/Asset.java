package Main.Business;

import Main.Individual.Income;
import java.util.HashMap;

public class Asset {

    public static HashMap<String, Double> currentAsset = new HashMap<>();
    public static HashMap<String, Double> nonCurrentAsset = new HashMap<>();
    public static double assets, current = 0.00, nonCurrent = 0.00;

    //Determining the held assets
    public static void setCurrentAsset() {
        currentAsset.put("Checking Account", 0.00);
        currentAsset.put("Saving Account", 0.00);
        currentAsset.put("Petty Cash", 0.00);
        currentAsset.put("Accounts Receivable", 0.00);
        currentAsset.put("Inventory", 0.00);
        currentAsset.put("PrePaid Insurance", 0.00);
    }
    public static void setNonCurrentAsset() {
        nonCurrentAsset.put("Accumulated Depreciation", 0.00);
        nonCurrentAsset.put("Computer", 0.00);
        nonCurrentAsset.put("Building", 0.00);
        nonCurrentAsset.put("Land", 0.00);
    }
    public static void setCurrentAssetValue() {
        System.out.println(" * * * Current Assets * * * ");
        for (String key: currentAsset.keySet()) {
            double value = 0.00;
            System.out.print("Enter a value for " + key + ": ");
            value = Income.input.nextDouble();
            Income.input.nextLine();
            currentAsset.put(key, value);
        }
    }
    public static void setNonCurrentAssetValue() {
        System.out.println(" * * * NON Current Assets * * * ");
        for (String key: nonCurrentAsset.keySet()) {
            double value = 0.00;
            System.out.print("Enter a value for " + key + ": ");
            value = Income.input.nextDouble();
            Income.input.nextLine();
            nonCurrentAsset.put(key, value);
        }
    }
    public static void totalAssets() {
        for (double value: currentAsset.values()) {
            current += value;
        }
        for (double value: nonCurrentAsset.values()) {
            nonCurrent += value;
        }
        assets = current + nonCurrent;
    }
    public static double getAssets() {return assets;}
}
