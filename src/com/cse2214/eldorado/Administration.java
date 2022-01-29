package com.cse2214.eldorado;

import java.util.Scanner;
//Badrul
public class Administration{
    UserInterface logo= new UserInterface();
    Scanner scan = new Scanner(System.in);
    void administration(){
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().adminMenu();
        int menu;
        String Name;
        menu = scan.nextInt();
        switch(menu) {
            case 1:
                new UserInterface().adminMenu111();
                new UserInterface().promptEnterKey();
                administration();
                break;
            case 2:
                System.out.print("\t\t\t\t\t\t\t");
                System.out.print(" Email User/Email : ");
                Name = scan.nextLine();
                System.out.print("\033[H\033[2J");
                new UserInterface().logo();
                new UserInterface().adminMenu12();
                new UserInterface().promptEnterKey();
                administration();
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 5:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 7:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 8:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 9:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 10:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 11:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 12:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 13:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            case 14:
                System.out.print("\033[H\033[2J");
                logo.logo();
                break;
            default:
                administration();
                break;
        }




    }
}
