package com.cse2214.eldorado;

public class Menus {
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

    void menuOfFrontMenu() {
        System.out.println("\n\n\t\t\t\t\t\t\t         A Project by ElDorado");
        System.out.println("\t\t\t\t\t\t        Supervised By \033[3mAdil Ahmed Chowdhury Sir\033[0m");
        System.out.println("\t\t\t\t\t\t\t       Lecturer, Dept of CSE, LU");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.println("\t\t\t\t\t\t|               1. Login/Signup                      |");
        System.out.println("\t\t\t\t\t\t|               2. Emergency Helplines               |");
        System.out.println("\t\t\t\t\t\t|               3. Get Free Reward                   |");
        System.out.println("\t\t\t\t\t\t|               4. ADMINISTRATION                    |");
        System.out.println("\t\t\t\t\t\t|               5. About Developers                  |");
        System.out.println("\t\t\t\t\t\t|               6. Exit                              |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.print("\t\t\t\t\t\t\t Enter Your choice: ");
    }

    void loginSignup() {
        System.out.println("\t\t\t\t\t\t======================================================");
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

    void emergencyNumber() {
        System.out.println(ANSI_RED + "\t\t\t\t\t\t======================================================" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|                  Emergency Number                  |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|          Please Select from the option Below       |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               1. Bangladesh                        |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               2. India                             |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               3. Nepal                             |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               4. SriLanka                          |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               5. United Kingdom                    |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               6. United States of America          |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               7. United Arab Emirates              |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               8. View All Emergency Number         |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t|               9. Return to Previous Menu           |" + ANSI_RESET);
        System.out.println(ANSI_RED + "\t\t\t\t\t\t******************************************************" + ANSI_RESET);
        System.out.print(ANSI_RED + "\t\t\t\t\t\t\t Enter Your choice: " + ANSI_RESET);
    }

}
