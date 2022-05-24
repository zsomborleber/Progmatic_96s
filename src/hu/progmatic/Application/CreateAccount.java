package hu.progmatic.Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateAccount {
    static List<String> registrationByEmailAddress = new ArrayList<>();
    static List<String> confirmPasswordByEmail = new ArrayList<>();
    static User user = new User();

    public static List<String> getRegistrationByEmailAddress() {
        registrationByEmailAddress.add("leberzsombor96@gmail.com");

        return registrationByEmailAddress;
    }

    public static List<String> getConfirmPasswordByEmail() {
        confirmPasswordByEmail.add("123");
        return confirmPasswordByEmail;
    }

    public static void registrationIfNo(){
        String RED = "\u001B[31m";
        String DEFAULT = "\u001B[0m";

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);

            System.out.println("*******************************");
            System.out.println("CREATE A PROGMATIC PLUS ACCOUNT");
            System.out.println("*******************************");

        System.out.println("\n");

        System.out.println("Enter your Date of birth");

        int dateOfBirth = scanner.nextInt();
        scanner.nextLine();
        int atleastEighteen = (LocalDate.now().getYear() - dateOfBirth);

        while (atleastEighteen < 18) {
            atleastEighteen = (LocalDate.now().getYear() - dateOfBirth);
            if ((atleastEighteen > 18)) {
            } else {
                System.out.println(RED + "To create an account you need to be at least 18 years old.");
                System.out.println(DEFAULT);
                dateOfBirth = scanner.nextInt();
                scanner.nextLine();
            }
        }




        System.out.println("Enter your First name");
        user.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name");
        user.setLastName(scanner.nextLine());
        System.out.println(user.getFirstName() + ",What's your email address?");
        System.out.println("Please enter your email address carefully we'll use this to verify your account.");

        user.setEmailAddress(scanner.nextLine());
        while (user.getEmailAddress().equals("")){
            System.out.println("Enter any email address");
            user.setEmailAddress(scanner.nextLine());
        }
        addNewLogIn(registrationByEmailAddress, user.getEmailAddress());

        registrationByEmailAddress.add(user.getEmailAddress());
        System.out.println("Confirm your email address");
        String confirmEmailAddress = scanner.nextLine();
        registrationByEmailAddress.add(confirmEmailAddress);
        while  (!user.getEmailAddress().equals(confirmEmailAddress) ){

            System.out.println(RED + "The email addresses you've entered don't match");
            System.out.println(DEFAULT + "Try again");
            confirmEmailAddress = scanner.nextLine();
            registrationByEmailAddress.add(confirmEmailAddress);
        }
        System.out.println("Please enter your password" + " or generate your own, would you like to generate it? To generate password press 1.");
        user.setPassword(scanner.nextLine());
        if (!user.getPassword().equals("1")){
            user.getPassword();
            confirmPasswordByEmail.add(user.getPassword());


        }else {
            PasswordGenerator.generatePassword();
            user.setPassword(PasswordGenerator.user.getPassword());
            confirmPasswordByEmail.add(user.getPassword());
        }




        System.out.println("Confirm your password");
        String confirmPassword = scanner.nextLine();
        while (!user.getPassword().equals(confirmPassword)) {
            System.out.println(RED + "The passwords you've entered don't match");
            System.out.println(DEFAULT + "Try again");
            confirmPassword = scanner.nextLine();
            confirmPasswordByEmail.add(user.getPassword());

        }

        System.out.println("Your registraion was successful,Please LOG in.");
        LOG_IN.logInWithEmail(registrationByEmailAddress);
        LOG_IN.logInWithPassword(confirmPasswordByEmail);


    }
    public static void addNewLogIn(List<String> registrationByEmailAddress, String newEmailAddress){
        String RED = "\u001B[31m";
        String DEFAULT = "\u001B[0m";
        Scanner scanner = new Scanner(System.in);
        getRegistrationByEmailAddress();
        while (user.getEmailAddress() != null && registrationByEmailAddress.contains(newEmailAddress)){
            System.out.println(RED + "This email address is already used");
            System.out.println(DEFAULT + "Try again");
            newEmailAddress = scanner.nextLine();

            if (!registrationByEmailAddress.contains(newEmailAddress)){
                registrationByEmailAddress.add(newEmailAddress);
                System.out.println("Enter the new email address again");
                user.setEmailAddress(scanner.nextLine());
                break;
            }


        }
    }

    public static void registrationIfYes(){
        System.out.println("Please Log IN");
        LOG_IN.logInWithEmail(registrationByEmailAddress);
        LOG_IN.logInWithPassword(confirmPasswordByEmail);

    }
}
