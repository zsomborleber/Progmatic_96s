package hu.progmatic.Application;

import java.util.Random;

public class PasswordGenerator {
    static User user = new User();

    public static void main(String[] args) {

        //generatePassword();


    }

    public static void generatePassword(){
        String uppeer ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstvwxyz";
        String num = "0123456789";
        String specialChars = "<>,.?/}]{[+_-)(*^%$#@!=";
        String combination = uppeer + lower + specialChars + num;

        int length = 8;
        char[] password = new char[length];
        Random r = new Random();

        for (int i = 0; i < length; i++){
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        password.toString();
        System.out.println("Generated password: " + password);

        user.setPassword(password.toString());


    }


}
