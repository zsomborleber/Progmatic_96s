package hu.progmatic.Application;

import java.util.List;
import java.util.Scanner;

public class LOG_IN {


    static String emailAddress;
    private static String password;

    public LOG_IN() {
    }

    public LOG_IN(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void logInWithEmail(List<String> registrationByEmailAddress){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your email address");
      emailAddress = scanner.nextLine();
      if (!registrationByEmailAddress.contains(emailAddress)){
          System.out.println("You have not registered with this email address, Please Register first ");
          CreateAccount.registrationIfNo();

      }

  }
  public static void logInWithPassword(List<String> confirmPasswordByEmail){
      Scanner scanner = new Scanner(System.in);
      String RED = "\u001B[31m";
      String DEFAULT = "\u001B[0m";

      System.out.println("Enter your password");
      password = scanner.nextLine();
      if (confirmPasswordByEmail.contains(password)){


      }
      while (!confirmPasswordByEmail.contains(password)){
          System.out.println(RED + "password is incorrect");
          System.out.println(DEFAULT + "Try again");
          password = scanner.nextLine();


      }
      System.out.println("You have successfully logged in");
      System.out.println("**************************************");
      System.out.println("Welcome to your Progmatic Plus Account");
      System.out.println("**************************************");
      System.out.println("===========================\n");

      Coupons.listCoupons();

      System.out.println("Activate any of these coupons to get it for free");
      System.out.println("Press the coupon's number you want to activate ");

  }

  public static void getAndActivateCoupon(){
        Scanner scanner = new Scanner(System.in);
      String RED = "\u001B[31m";
      String DEFAULT = "\u001B[0m";

      String activateCoupon = scanner.nextLine();

      if (activateCoupon.equals("1")){
          Coupons.productTomato.setPrice(0);
          Coupons.setActive(true);
      }else if (activateCoupon.equals("2")){
          Coupons.productHeinekenBeer.setPrice(0);
          Coupons.setActive(true);
      }else if (activateCoupon.equals("3")){
          Coupons.productWholeWheatBread.setPrice(0);
          Coupons.setActive(true);
      }else if (activateCoupon.equals("4")){
          Coupons.productFreshMilk.setPrice(0);
          Coupons.setActive(true);
      }while (!activateCoupon.equals("1")&& activateCoupon.equals("2")&& activateCoupon.equals("3")&&activateCoupon.equals("4")){
          System.out.println(RED + "Wrong coupon code");
          scanner.nextLine();
      }
      Coupons.listCoupons();

  }




}
