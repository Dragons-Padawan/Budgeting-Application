package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Balance.setBalance();
        System.out.println(Income.getAnnualIncome());
        System.out.println(Expences.getAnnualExpenses());
        System.out.println(Balance.getBalance());
    }
}
