import java.util.Scanner;

public class CreditCardInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("");

        System.out.println("Welcome to the Credit Card Interest Rate Finder");
        // APR
        System.out.println("Please enter your current Credit Card APR");
        double apr = new Scanner(System.in).nextDouble();

        System.out.println("Please enter your average daily balance");
        double adb = new Scanner(System.in).nextDouble();

        double dpr = DailyPeriodRate(apr);
        double di = DailyInterest(dpr, adb);
        double monthlyIR = MonthlyInterestRate(di, 30);

        System.out.println("Your Monthly Interest for your credit card is: " + monthlyIR);

    }
    public static double DailyPeriodRate (double apr){
        return apr/365;
    }
    public static double DailyInterest(double dpr, double adb){
        return dpr * adb;
    }
    public static double MonthlyInterestRate(double di, double monthDays){
        return di * monthDays;
    }
}
