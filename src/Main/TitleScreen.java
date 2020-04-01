package Main;

import Main.Business.BusinessBalance;
import Main.Individual.Balance;
import Main.Individual.Income;

import java.io.IOException;

public class TitleScreen {

    private static String userType = "";

    public static void title() throws IOException {
        //Determining whether to run through either an individual or a small business
        System.out.print("Are you Business or Individual? ");
        userType = Income.input.nextLine().toLowerCase();

        if (userType.equals("business")) {
            BusinessBalance.runningMethods();
        } else if (userType.equals("individual")) {
            Balance.setBalance();
        //Fail safe to ensure that correct type is run
        } else {
            System.out.println("Invalid Entry: ");
            title();
        }
    }
}
