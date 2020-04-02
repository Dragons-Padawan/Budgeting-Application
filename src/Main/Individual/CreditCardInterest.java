package Main.Individual;

public class CreditCardInterest {
    //Title Method
    public static double Welcome() {
        //Retrieving APR about the users credit cards
        System.out.println("Please enter your current Credit Card APR");
        double apr = Income.input.nextDouble();
        //Retrieving the average Daily Balance
        System.out.println("Please enter your average daily balance");
        double adb = Income.input.nextDouble();
        //Manipulating data via Methods to return the desired result
        double dpr = DailyPeriodRate(apr);
        double di = DailyInterest(dpr, adb);
        double monthlyIR = MonthlyInterestRate(di, 30);
        System.out.println(monthlyIR);
        double result = (monthlyIR * (adb * 30)) * 0.02;

        return result;
    }
    //finding the Period Rate
    public static double DailyPeriodRate (double apr){
        return apr/365;
    }
    //Finding the Daily Interest Rate
    public static double DailyInterest(double dpr, double adb){
        return dpr * adb;
    }
    //Finding the Monthly Interest Rate
    public static double MonthlyInterestRate(double di, int monthDays){
        return di * monthDays;
    }
}
