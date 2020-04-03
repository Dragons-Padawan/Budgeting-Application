package Main.Individual;

public class CreditCardInterest {
    //Title Method
    public static double Welcome() {
        //Retrieving APR about the users credit cards
        System.out.print("Please enter your current Credit Card APR: ");
        double apr = Income.input.nextDouble();
        // Sanitize apr for errors
        while (apr < 1 || apr > 100){
            System.out.print("Sorry you must choose a number between 1 and 100. Please try again");
            apr = Income.input.nextDouble();
        }
        apr = apr/100;
        //Retrieving the average Daily Balance
        System.out.print("\nPlease enter your average daily balance: ");
        double adb = Income.input.nextDouble();
        //Determining how much of the balance the user wants to pay after interest
        double bem;
        do {
            System.out.print("\nWhat percentage of the principle do you want to pay each month? ");
            bem = Income.input.nextDouble();
            System.out.println();
        } while (bem < 1 || bem > 100);
        bem /= 100;
        //Manipulating data via Methods to return the desired result
        double dpr = DailyPeriodRate(apr);
        double di = DailyInterest(dpr, adb);
        double monthlyIR = MonthlyInterestRate(di, 30);

        return monthlyIR + (adb * bem);
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
