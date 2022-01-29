package com.cse2214.eldorado;

//Contribution-Badrul-2012020216
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.print.attribute.standard.Destination;
import java.lang.Thread;

public class UserInterface {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    void logo() {
        try {
            File logo = new File("Logo.txt");
            Scanner readLogo = new Scanner(logo);
            while (readLogo.hasNextLine()) {
                String show = readLogo.nextLine();
                System.out.println(ANSI_BLUE + show + ANSI_RESET);
            }
            readLogo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_RED
                + "\t\t\t\t\t\t\t \033[3m  Tour and Travel Management System  \033[0m" + ANSI_RESET);
    }

    void welcome() {
        try {
            File logo = new File("Welcome.txt");
            Scanner readLogo = new Scanner(logo);
            while (readLogo.hasNextLine()) {
                String show = readLogo.nextLine();
                System.out.println(show);
            }
            readLogo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void shutDown() {
        System.out.println("");
        try {
            File logo = new File("Exit.txt");
            Scanner readLogo = new Scanner(logo);
            while (readLogo.hasNextLine()) {
                String show = readLogo.nextLine();
                System.out.println(show);
            }
            readLogo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void about() {
        System.out.print("\033[H\033[2J");
        logo();
        about1();
        try {
            File logo = new File("About.txt");
            Scanner readLogo = new Scanner(logo);
            System.out.print(
                    "\t\t+-----------------------------------------------------------------------------------------------------------------------+\n");
            while (readLogo.hasNextLine()) {
                String show = readLogo.nextLine();
                System.out.print("\t\t|\t");
                System.out.format("%100s", show);
                System.out.print("\t\t|\n");
                try {
                    Thread.sleep(1000); 
                } catch (Exception e) {
                }
                
            }
            System.out.print(
                    "\t\t+-----------------------------------------------------------------------------------------------------------------------+\n");

            readLogo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        promptEnterKey();
        new Application().frontPage();
    }

    void loading() {
        System.out.println("\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\tLoading\n\n\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t      ");
        char x = 16;
        try {
            for (int i = 0; i < 50; i++) {
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + x + ANSI_RESET);
                if (i < 10)
                    Thread.sleep(150);
                if (i >= 10 && i < 20)
                    Thread.sleep(20);
                if (i >= 10)
                    Thread.sleep(20);
            }
        } catch (Exception e) {
        }
    }

    void loadingBar() {
        System.out.print("\n\t\t\t\t\t\t      ");
        char x = 16;
        try {
            for (int i = 0; i < 50; i++) {
                System.out.print(x);
                if (i < 10)
                    Thread.sleep(10);
                if (i >= 10 && i < 20)
                    Thread.sleep(5);
                if (i >= 10)
                    Thread.sleep(1);
            }
            System.out.print("\n");
        } catch (Exception e) {
        }
    }

    public void promptEnterKey() {
        System.out.println("\t\t\t\t\t\tPress \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    void exit() {
        System.out.print("\033[H\033[2J");
        logo();
        loading();
        shutDown();
    }

    void menuOfFrontMenu() {
        System.out.println("\n\n\t\t\t\t\t\t\t         A Project by ElDorado");
        System.out.println("\t\t\t\t\t\t        Supervised By \033[3mAdil Ahmed Chowdhury Sir\033[0m");
        System.out.println("\t\t\t\t\t\t\t       Lecturer, Dept of CSE, LU");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.println("\t\t\t\t\t\t|               1. Login/Signup                      |");
        System.out.println("\t\t\t\t\t\t|               2. Emergency Helplines               |");
        System.out.println("\t\t\t\t\t\t|               3. Document Verification             |");
        System.out.println("\t\t\t\t\t\t|               4. ADMINISTRATION                    |");
        System.out.println("\t\t\t\t\t\t|               5. About                             |");
        System.out.println("\t\t\t\t\t\t|               6. Exit                              |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.print("\t\t\t\t\t\t\t Enter Your choice: ");
    }
    void adminMenu(){
        System.out.print("\t\t\t\t\t\t======================================================\n");
        System.out.print("\t\t\t\t\t\t|                    ADMIN MENU                      |\n");
        System.out.print("\t\t\t\t\t\t|          Please Select from the option Below       |\n");
        System.out.print("\t\t\t\t\t\t******************************************************\n");
        System.out.print("\t\t\t\t\t\t|          1. View List of Users                     |\n");
        System.out.print("\t\t\t\t\t\t|          2. View Individual Users Details          |\n");
        System.out.print("\t\t\t\t\t\t|          3. Edit User Data                         |\n");
        System.out.print("\t\t\t\t\t\t|          4. Bus Info                               |\n");
        System.out.print("\t\t\t\t\t\t|          5. Modify Bus Information                 |\n");
        System.out.print("\t\t\t\t\t\t|          6. Train Info                             |\n");
        System.out.print("\t\t\t\t\t\t|          7. Modify Train Details                   |\n");
        System.out.print("\t\t\t\t\t\t|          8. Domestic Flights Information           |\n");
        System.out.print("\t\t\t\t\t\t|          9. International Flights Information      |\n");
        System.out.print("\t\t\t\t\t\t|         10. Modify Domestic Flights Information    |\n");
        System.out.print("\t\t\t\t\t\t|         11. Edit International Flights Data        |\n");
        System.out.print("\t\t\t\t\t\t|         12. Hotels Information                     |\n");
        System.out.print("\t\t\t\t\t\t|         13. Modify Hotel Details                   |\n");
        System.out.print("\t\t\t\t\t\t|         14. Return to Previous Menu                |\n");
        System.out.print("\t\t\t\t\t\t******************************************************\n");
        System.out.print("\t\t\t\t\t\t Enter Your choice: ");
    }
    void adminMenu1(){
        System.out.print("\t\t\t\t\t\t======================================================\n");
        System.out.print("\t\t\t\t\t\t|                    ADMIN MENU                      |\n");
        System.out.print("\t\t\t\t\t\t|                  List of Users                     |\n");
        System.out.print("\t\t\t\t\t\t******************************************************\n");
    }
    void loginSignup() {
        System.out.println("\t\t\t\t\t\t======================================================");
        System.out.println("\t\t\t\t\t\t|                        User                        |");
        System.out.println("\t\t\t\t\t\t|         Please Select from the option Below        |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.println("\t\t\t\t\t\t|               1. Login                             |");
        System.out.println("\t\t\t\t\t\t|               2. New User Registraion              |");
        System.out.println("\t\t\t\t\t\t|               3. Forgot Credentials                |");
        System.out.println("\t\t\t\t\t\t|               4. Return To Homepage                |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.print("\t\t\t\t\t\t\t Enter Your choice: ");
    }

    void userLogin() {
        System.out.println("\t\t\t\t\t\t======================================================");
        System.out.println("\t\t\t\t\t\t|                    User LOGIN                      |");
        System.out.println("\t\t\t\t\t\t|       Please Provide the Recquired Information     |");
        System.out.println("\t\t\t\t\t\t******************************************************");
    }

    void adminLogin() {
        System.out.println("\t\t\t\t\t\t======================================================");
        System.out.println("\t\t\t\t\t\t|                    Admin LOGIN                     |");
        System.out.println("\t\t\t\t\t\t|       Please Provide the Recquired Information     |");
        System.out.println("\t\t\t\t\t\t******************************************************");
    }

    void userLoginSuccessfull() {
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t|                User LOGIN Successfull              |" + ANSI_RESET);
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t|               Redirecting To User Menu             |" + ANSI_RESET);
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
    }

    void userLoginUnSuccessfull() {
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|            Email & Password doesn'n Match          |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|       Press enter to Return to Prtevious Menu      |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
    }

    void adminLoginSuccessfull() {
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t|                Admin LOGIN Successfull             |" + ANSI_RESET);
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t|               Redirecting To Admin Menu            |" + ANSI_RESET);
        System.out.println(
                ANSI_GREEN + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
    }

    void adminLoginUnSuccessfull() {
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|           Admin ID & Password doesn'n Match        |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|       Press enter to Return to Prtevious Menu      |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
    }

    void emergencyNumber() {
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|                  Emergency Number                  |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|          Please Select from the option Below       |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               1. Bangladesh                        |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               2. India                             |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               3. Nepal                             |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               4. Sri Lanka                         |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               5. United Kingdom                    |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               6. United States of America          |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               7. United Arab Emirates              |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               8. Canada                            |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|               9. Australia                         |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|              10. View All Emergency Number         |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|              11. Return to Previous Menu           |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
        System.out.print(ANSI_RED + "\t\t\t\t\t\t\t Enter Your choice: " + ANSI_RESET);
    }

    void emergencyNumber1() {
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|                  Emergency Number                  |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t|              For Fast Resposne call 911            |" + ANSI_RESET);
        System.out
                .println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
    }

    void emergencyNumber2() {
        System.out.println(
                "\t\t\t   ______________________________________________________________________________________________");
        System.out.println(
                "\t\t\t   |         Country            |               Service         |          Contact Number       |");
        System.out.println(
                "\t\t\t   +--------------------------------------------------------------------------------------------+");
    }

    void emergencyNumber3() {
        System.out.println(
                "\t\t\t   +--------------------------------------------------------------------------------------------+");
    }

    void availableBus(String destination) {
        System.out.println("\t\t\t\t\t\t======================================================");
        System.out.println("\t\t\t\t\t\t|                    Available Bus                   |");
        System.out.println("\t\t\t\t\t\t|                      To: " + destination + "\t\t|");
        System.out.println("\t\t\t\t\t\t******************************************************");
    }

    void about1() {
        System.out
                .println(ANSI_BLUE + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out
                .println(ANSI_BLUE + "\t\t\t\t\t\t|                       About                        |" + ANSI_RESET);
        System.out
                .println(ANSI_BLUE + "\t\t\t\t\t\t|            The Software and the Developers         |" + ANSI_RESET);
        System.out
                .println(ANSI_BLUE + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
    }
}
