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
                new Transportation().busdestination();
                break;

            case 6:// Feature implementation & testing Purpose
                new MongoDB().mongoDBEmergencyDB();
                break;
            default:
                break;
        }
    }

    void emergecyHelp() {
        System.out.print("\033[H\033[2J");
        int x;
        showlogo.logo();
        new UserInterface().emergencyNumber();
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("Bangladesh");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("India");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("Nepal");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("SriLanka");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 5:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("United Kingdom");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("United States of America");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 7:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                String Country = new String("United Arab Emirates");
                new MongoDB().mongoDBEmergencyDBFiler(Country);
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 8:
                System.out.print("\033[H\033[2J");
                showlogo.logo();
                new UserInterface().emergencyNumber1();
                System.out.println("\t\t\t   ______________________________________________________________________________________________");
                System.out.println("\t\t\t   |         Country            |               Service         |          Contact Number       |");
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new MongoDB().mongoDBEmergencyDB();
                System.out.println("\t\t\t   +--------------------------------------------------------------------------------------------+");
                new UserInterface().promptEnterKey();
                emergecyHelp();
                break;
            case 9:
                frontPage();
                break;
            default:
                emergecyHelp();
                break;
        }
    }
}
