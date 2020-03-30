package Main;

import java.util.Scanner;

public class Income {

    public static Scanner input = new Scanner(System.in);
    private static double hourlyRate, annualIncome;
    private static int weeklyHours;

    //setting up the hourly rate
    private static void setHourlyRate() {
        System.out.print("\nEnter your Hourly Rate: ");
        hourlyRate = input.nextDouble();
        input.nextLine();
    }
    public static void setHours() {
        System.out.print("\nEnter your Weekly Hours: ");
        weeklyHours = input.nextInt();
        input.nextLine();
    }
    public static void setHourlyIncome() {annualIncome = hourlyRate * weeklyHours * 52;}
    //setting up the annual rate
    public static void setAnnualIncome() {
        System.out.print("\nEnter your Annual Income: ");
        annualIncome = input.nextInt();
        input.nextLine();
    }
    //setting up the main call method
    public static double getAnnualIncome() {return annualIncome;}
    //Asking user a variety of questions
    public static double getIncome() {
        System.out.print("Are you Salary or Hourly? ");
        String payType = input.nextLine().toLowerCase();

        if (payType.equals("salary")) {
            setAnnualIncome();
        } else if (payType.equals("hourly")) {
            setHourlyRate();
            setHours();
            setHourlyIncome();
        } else {
            System.out.println("Invalid Response: Try Again");
            getIncome();
        }
        Expenses.setExpenses();
        Expenses.setAnnualExpenses();
        return annualIncome;
    }
}
