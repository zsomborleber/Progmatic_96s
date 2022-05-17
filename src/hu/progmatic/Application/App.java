package hu.progmatic.Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String RED = "\u001B[31m";
        String DEFAULT = "\u001B[0m";
        List<String> registration = new ArrayList<>();


        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Welcome to your Progmatic Plus Account");
        System.out.println("======================================\n\n");
        System.out.println("To enjoy Progmatic Plus you'll need to have an account. " + "Have you got an account?" + "\tyes/no");
        String haveAccount = scanner.nextLine();
        if (haveAccount.equalsIgnoreCase("yes")){
            System.out.println("LOG IN");
        }else if (haveAccount.equalsIgnoreCase("no")){
            System.out.println("*******************************");
            System.out.println("CREATE A PROGMATIC PLUS ACCOUNT");
            System.out.println("*******************************");
        }else {
            System.out.println("Choose yes or no");
            haveAccount = scanner.nextLine();
        }
        System.out.println("\n");



        System.out.println("Enter your First name");
        String firstName = scanner.nextLine();
        registration.add(firstName);
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        registration.add(lastName);
        System.out.println(firstName + ",what's your email address?");
        System.out.println("Please enter your email address carefully we'll use this to verify your account.");
        String emailAddress = scanner.nextLine();
        registration.add(emailAddress);
        System.out.println("Confirm your email address");
        String confirmEmailAddress = scanner.nextLine();
        while  (!emailAddress.equals(confirmEmailAddress) ){

            System.out.println(RED + "The email addresses you've entered don't match");
            System.out.println(DEFAULT + "Try again");
            confirmEmailAddress = scanner.nextLine();
            registration.add(confirmEmailAddress);
        }
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        registration.add(password);
        System.out.println("Confirm your password");
        String confirmPassword = scanner.nextLine();
        registration.add(confirmPassword);
        while (!password.equals(confirmPassword)) {
            System.out.println(RED + "The passwords you've entered don't match");
            System.out.println(DEFAULT + "Try again");
            confirmPassword = scanner.nextLine();
            registration.add(confirmPassword);
        }
        System.out.println("Date of birth");

        int dateOfBirth = scanner.nextInt();
        scanner.nextLine();
        int atleastEighteen = (LocalDate.now().getYear() - dateOfBirth);

        while (atleastEighteen < 18){
            atleastEighteen = (LocalDate.now().getYear() - dateOfBirth);
            if ((atleastEighteen > 18)) {
                registration.add(String.valueOf(dateOfBirth));
            }else {
                System.out.println(RED + "To create an account you need to be at least 18 years old.");
                System.out.println(DEFAULT);
                dateOfBirth =  scanner.nextInt();
                scanner.nextLine();
            }


        }
    }




}
