package hu.progmatic.Application;

import java.util.Scanner;
import java.util.Set;

public class App {






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("===========================");
        System.out.println("Welcome to  Progmatic Plus ");
        System.out.println("===========================");
        System.out.println("To enjoy Progmatic Plus you'll need to have an account. " + "Have you got an account?" + "\tyes/no");
        String haveAccount = scanner.nextLine();
        if (haveAccount.equalsIgnoreCase("no")){
            CreateAccount.registrationIfNo();
        }else if (haveAccount.equalsIgnoreCase("yes")){
            CreateAccount.getRegistrationByEmailAddress();
            CreateAccount.getConfirmPasswordByEmail();
            CreateAccount.registrationIfYes();

        }
    }
}
