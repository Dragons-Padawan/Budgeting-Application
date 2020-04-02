package Main;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static double calculateMontlyPayment(int loanAmount, int termInYears, double interestRate) {
//        convert interest rate to a decimal
        interestRate /= 100.0;

//        monthly interest rate if year is divided by 12
        double monthlyRate = interestRate / 12.0;

//       the length of term in months
        int termInMonths = termInYears * 12;

//        calculate monthly payment
        double monthlyPayment = (loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));

        return monthlyPayment;
    }

// this can be used for the output not adding it in the main part because I don't want to mess with anyone's code
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Mortgage Calculate");

    System.out.println("Would you like to apply for a Mortgage Loan? Press Y for yes and N for No");

    String answer = scan.nextLine();

    if(answer.equals("Y") || answer.equals("Yes")) {
        System.out.println("Mortgage amount: ");
        int loanAmount = scan.nextInt();

        System.out.println("Interest rate (%)");
        double interestRate = scan.nextDouble();

        System.out.println("Mortgage period(years)");
        int termInYears = scan.nextInt();

        double monthlyPayment = calculateMontlyPayment(loanAmount,termInYears,interestRate);

//    format for the currency with NumberFormat
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat  = NumberFormat.getPercentInstance();

//     this show loan detail.
        System.out.println("Your Interest Rate: " + interestFormat.format(interestRate));
        System.out.println("Your loan term is: " + termInYears +" years");
        System.out.println("Total cost of mortgage: " + currencyFormat.format(loanAmount));
        System.out.println("Monthly payments: " + currencyFormat.format(monthlyPayment));
    }
    else {
        System.out.println("Thank you");
    }


    }
}
