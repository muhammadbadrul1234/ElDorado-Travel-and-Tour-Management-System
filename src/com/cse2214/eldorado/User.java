package com.cse2214.eldorado;

//Takrim-2012020205
import java.util.Scanner;

public class User {
    static void adminLogin() {
        System.out.print("\033[H\033[2J");
        UserInterface showlogo = new UserInterface();
        showlogo.logo();
        String UserNumber, Name;
        UserInterface menu1 = new UserInterface();
        menu1.adminLogin();
        Scanner scan = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t  Admin ID : ");
        UserNumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\t  Password : ");
        Name = scan.nextLine();
        UserInterface showloading1 = new UserInterface();
        showloading1.loadingBar();
        if (new MongoDB().adminpasswordAuth(UserNumber, Name)) {
            System.out.print("\033[H\033[2J");
            UserInterface showlogo1 = new UserInterface();
            showlogo1.logo();
            UserInterface menu2 = new UserInterface();
            menu2.adminLoginSuccessfull();
            UserInterface showloading2 = new UserInterface();
            showloading2.loadingBar();
            try {
                Thread.sleep(2500);
            } catch (Exception e) {
            }
            new Application().frontPage();
            new Administration().administration();
        } else {
            System.out.print("\033[H\033[2J");
            UserInterface showlogo1 = new UserInterface();
            showlogo1.logo();
            UserInterface menu3 = new UserInterface();
            menu3.adminLoginUnSuccessfull();
            UserInterface showloading2 = new UserInterface();
            showloading2.loadingBar();
            new UserInterface().promptEnterKey();
            new Application().frontPage();

        }
    }

    void login() {
        System.out.print("\033[H\033[2J"); // clear terminnal
        int UserInterfaceel;
        UserInterface showlogo = new UserInterface();
        showlogo.logo();
        String UserName, Password;
        UserInterface menu = new UserInterface();
        menu.loginSignup();
        Scanner scan = new Scanner(System.in);
        UserInterfaceel = scan.nextInt();
        switch (UserInterfaceel) {
            case 1:
                login1();
                break;
            case 2:
                User user2 = new User();
                user2.login1();
                break;
            case 3:
                forgetLogin1();
                break;
            case 4:
                UserInterface showloading = new UserInterface();
                showloading.loadingBar();
                User user1 = new User();
                user1.login1();
                break;
            default: {
                break;
            }
        }
    }

    static void login1() {
        System.out.print("\033[H\033[2J");
        UserInterface showlogo = new UserInterface();
        showlogo.logo();
        String UserNumber, Name;
        UserInterface menu1 = new UserInterface();
        menu1.userLogin();
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\t\t\t\t\t\t  Email    : ");
        UserNumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\t  Password : ");
        Name = scan.nextLine();
        UserInterface showloading1 = new UserInterface();
        showloading1.loadingBar();
        if (new MongoDB().passwordAuth(UserNumber, Name)) {
            System.out.print("\033[H\033[2J");
            UserInterface showlogo1 = new UserInterface();
            showlogo1.logo();
            UserInterface menu2 = new UserInterface();
            menu2.userLoginSuccessfull();
            UserInterface showloading2 = new UserInterface();
            showloading2.loadingBar();
        } else {
            System.out.print("\033[H\033[2J");
            UserInterface showlogo1 = new UserInterface();
            showlogo1.logo();
            UserInterface menu3 = new UserInterface();
            menu3.userLoginUnSuccessfull();
            UserInterface showloading2 = new UserInterface();
            showloading2.loadingBar();
        }
    }

    void registration() {
        UserInterface logo = new UserInterface();
        logo.logo();
        String UserNumber, Name, gender, PassportNumber, PhoneNumber, Email, CardNumber, VisaID, City, Country,
                UserName, Password;
        System.out.println("\n\n\t\t\t\t\t\t==========================================================");
        System.out.println("\n\t\t\t\t\t\t|                 ADMINISTRATION PORTAL                  |");
        System.out.println("\n\t\t\t\t\t\t|                   New User Sign-up                    |");
        System.out.println("\n\t\t\t\t\t\t==========================================================");
        System.out.println("\n\t\t\t\t\t\t**********************************************************");
        System.out.println("\n\t\t\t\t\t\t|        Please Provide the Recquired Information        |");
        System.out.println("\n\t\t\t\t\t\t**********************************************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\tEnter The User number  : ");
        UserNumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\tName      : ");
        Name = scan.nextLine();
        System.out.print("\t\t\t\t\t\tGender      : ");
        gender = scan.nextLine();
        System.out.print("\t\t\t\t\t\tPassport Number : ");
        PassportNumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\tPhone Number : ");
        PhoneNumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\tEmail  : ");
        Email = scan.nextLine();
        System.out.print("\t\t\t\t\t\tCard Number : ");
        CardNumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\tVisa Id : ");
        VisaID = scan.nextLine();
        System.out.print("\t\t\t\t\t\tCity  : ");
        City = scan.nextLine();
        System.out.print("\t\t\t\t\t\tCountry     : ");
        Country = scan.nextLine();
        System.out.print("\t\t\t\t\t\tUser Name     : ");
        UserName = scan.nextLine();
        System.out.print("\t\t\t\t\t\tPassword  : ");
        Password = scan.nextLine();
        System.out.println("\n\n\t\t\t\t\t\t==========================================================");
        System.out.println("\n\t\t\t\t\t\t|                 ADMINISTRATION PORTAL                  |");
        System.out.println("\n\t\t\t\t\t\t|                   New User Sign-up                    |");
        System.out.println("\n\t\t\t\t\t\t==========================================================");
        System.out.println("\n\t\t\t\t\t\t**********************************************************");
        System.out.println("\n\t\t\t\t\t\t|          Congratulation!! Welcome to  ELDORADO       |");
        System.out.println("\n\t\t\t\t\t\t**********************************************************");
        System.out.println("\t\t\t\t\t\tUsernumber: " + UserNumber);
        System.out.println("\t\t\t\t\t\tName : " + Name);
        System.out.println("\t\t\t\t\t\tGender: " + gender);
        System.out.println("\t\t\t\t\t\tPassportNumber: " + PassportNumber);
        System.out.println("\t\t\t\t\t\tPhoneNumber: " + PhoneNumber);
        System.out.println("\t\t\t\t\t\tEmail: " + Email);
        System.out.println("\t\t\t\t\t\tCard Number: " + CardNumber);
        System.out.println("\t\t\t\t\t\tVisa Id: " + UserNumber);
        System.out.println("\t\t\t\t\t\tCity: " + City);
        System.out.println("\t\t\t\t\t\tCountry: " + Country);
        System.out.println("\t\t\t\t\t\tUser Name: " + UserName);
        System.out.println("\t\t\t\t\t\tUser Password: " + Password);
        new MongoDB().insertMongoDB(Integer.parseInt(UserNumber), Name, gender, PassportNumber, PhoneNumber, Email,
                CardNumber, UserNumber, City, Country, UserName, Password);
    }

    void forgetLogin1() {

    }

}
