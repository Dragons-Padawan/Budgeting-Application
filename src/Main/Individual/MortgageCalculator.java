package Main.Individual;

public class MortgageCalculator {
    public static double calculateMonthlyPayment(double loanAmount, int termInYears, double interestRate) {
//      convert interest rate to a decimal
        interestRate /= 100.0;

//      monthly interest rate if year is divided by 12
        double monthlyRate = interestRate / 12.0;

//      the length of term in months
        int termInMonths = termInYears * 12;

//      calculate monthly payment
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));

        return monthlyPayment;
    }

}
