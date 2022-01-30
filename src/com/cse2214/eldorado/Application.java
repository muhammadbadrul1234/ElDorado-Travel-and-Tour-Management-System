package com.cse2214.eldorado;

import java.util.Scanner;
//Contribution-Badrul-2012020216

public class Application {
    UserInterface showlogo = new UserInterface();
    UserInterface front = new UserInterface();
    Scanner scan = new Scanner(System.in);

    void frontPage() {
        System.out.print("\033[H\033[2J");
        showlogo.logo();
        front.menuOfFrontMenu();
        int menu;
        menu = scan.nextInt();
        switch (menu) {
            case 1:
                new User().login();
                break;
            case 2:
                emergecyHelp();
                break;
            case 3:
                verification();
                break;
            case 4:
                new User().adminLogin();
                break;
            case 5:
                new UserInterface().about();
                break;
            case 6:
                new UserInterface().exit();
                break;
            case 7:// Feature implementation & testing Purpose
                new Application().usersLogin();
                break;
            default:
                frontPage();
                break;
        }
    }

    // Sabiha Sultana__Start//
    void emergecyHelp() {
        System.out.print("\033[H\033[2J");
        int x;
        String Country1 = new String("Bangladesh");
        String Country2 = new String("India");
        String Country3 = new String("Nepal");
        String Country4 = new String("Sri Lanka");
        String Country5 = new String("United Kingdom");
        String Country6 = new String("United States");
        String Country7 = new String("United Arab Emirates");
        String Country8 = new String("Canada");
        String Country9 = new String("Australia");
        showlogo.logo();
        new UserInterface().emergencyNumber();
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        switch (x) {
            case 1:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country1);
                eHelpex();
                break;
            case 2:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country2);
                eHelpex();
                break;
            case 3:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country3);
                eHelpex();
                break;
            case 4:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country4);
                eHelpex();
                break;
            case 5:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country5);
                eHelpex();
                break;
            case 6:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country6);
                eHelpex();
                break;
            case 7:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country7);
                eHelpex();
                break;
            case 8:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country8);
                eHelpex();
                break;
            case 9:
                ehelp();
                new MongoDB().mongoDBEmergencyDBFiler(Country9);
                eHelpex();
                break;
            case 10:
                ehelp();
                new MongoDB().mongoDBEmergencyDB();
                eHelpex();
                break;
            case 11:
                frontPage();
                break;
            default:
                emergecyHelp();
                break;
        }
    }

    void ehelp() {
        System.out.print("\033[H\033[2J");
        showlogo.logo();
        new UserInterface().emergencyNumber1();
        new UserInterface().emergencyNumber2();
    }

    void eHelpex() {
        new UserInterface().emergencyNumber3();
        new UserInterface().promptEnterKey();
        emergecyHelp();
    }
    // Sabiha Sultana____End//

    void usersLogin() {
        int choice;
        new UserInterface().userLoginMenu();
        Scanner scan = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t Enter Your choice: ");
        choice = scan.nextInt();
        switch (choice) {
            case 1: {
                new Transportation().busdestination();
                break;
            }
            case 2: {
                new Transportation().traindestination();
                break;
            }
            case 3: {
                new Transportation().planedestination();
                break;
            }
            case 4: {
                new Transportation().hoteldestination();
                break;
            }
            case 5: {
                new Transportation().planedestination2();
                break;
            }
            case 6: {
                new Transportation().hoteldestination2();
            }
            case 7: {
                Transportation immigration = new Transportation();
            }
            case 8: {
                frontPage();
                break;
            }
            default: {
                usersLogin();
                break;
            }
        }
    }

    void verification() {
        System.out.print("\033[H\033[2J");
        new UserInterface().logo();
        System.out.println("\t\t\t\t\t\t======================================================");
        System.out.println("\t\t\t\t\t\t|                        User                        |");
        System.out.println("\t\t\t\t\t\t|         Please Select from the option Below        |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.println("\t\t\t\t\t\t|               1. Visa Verification                 |");
        System.out.println("\t\t\t\t\t\t|               2. Paspport Verification             |");
        System.out.println("\t\t\t\t\t\t|               3. Covid Certificate Verification    |");
        System.out.println("\t\t\t\t\t\t|               4. Return To Homepage                |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                String x=scan.nextLine();
                if (new MongoDB().visaAuth(x)) {
                    System.out.print("\033[H\033[2J");
                    UserInterface showlogo1 = new UserInterface();
                    showlogo1.logo();
                    UserInterface menu2 = new UserInterface();
                    menu2.verificationSuccessfull();
                    UserInterface showloading2 = new UserInterface();
                    showloading2.loadingBar();
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                    }
                    new UserInterface().promptEnterKey();
                    verification();
        
                } else {
                    System.out.print("\033[H\033[2J");
                    UserInterface showlogo1 = new UserInterface();
                    showlogo1.logo();
                    UserInterface menu3 = new UserInterface();
                    menu3.verificationSuccessfull();
                    UserInterface showloading2 = new UserInterface();
                    showloading2.loadingBar();
                    new UserInterface().promptEnterKey();
                    verification();
                }
            }
            case 2: {
                String x=scan.nextLine();
                if (new MongoDB().passportAuth(x)) {
                    System.out.print("\033[H\033[2J");
                    UserInterface showlogo1 = new UserInterface();
                    showlogo1.logo();
                    UserInterface menu2 = new UserInterface();
                    menu2.verificationSuccessfull();
                    UserInterface showloading2 = new UserInterface();
                    showloading2.loadingBar();
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                    }
                    new UserInterface().promptEnterKey();
                    verification();
        
                } else {
                    System.out.print("\033[H\033[2J");
                    UserInterface showlogo1 = new UserInterface();
                    showlogo1.logo();
                    UserInterface menu3 = new UserInterface();
                    menu3.verificationSuccessfull();
                    UserInterface showloading2 = new UserInterface();
                    showloading2.loadingBar();
                    new UserInterface().promptEnterKey();
                    verification();
                }
            }
            case 3:{
                String x=scan.nextLine();
                if (new MongoDB().covidAuth(x)) {
                    System.out.print("\033[H\033[2J");
                    UserInterface showlogo1 = new UserInterface();
                    showlogo1.logo();
                    UserInterface menu2 = new UserInterface();
                    menu2.verificationSuccessfull();
                    UserInterface showloading2 = new UserInterface();
                    showloading2.loadingBar();
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                    }
                    new UserInterface().promptEnterKey();
                    verification();
        
                } else {
                    System.out.print("\033[H\033[2J");
                    UserInterface showlogo1 = new UserInterface();
                    showlogo1.logo();
                    UserInterface menu3 = new UserInterface();
                    menu3.verificationSuccessfull();
                    UserInterface showloading2 = new UserInterface();
                    showloading2.loadingBar();
                    new UserInterface().promptEnterKey();
                    verification();
                }
            }
            case 4:{
                frontPage();
                break;
            }
            default:
                verification();
                break;
        }
    }
}
