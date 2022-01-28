package com.cse2214.eldorado;
//Contribution
//Badrul
//2012020216
import java.util.Scanner;
public class FrontPage{
    void frontPage(){
        System.out.print("\033[H\033[2J");
        int menu;
        LogoAndUI showlogo = new LogoAndUI();
        showlogo.logo();
        Menus front = new Menus();
        front.menuOfFrontMenu();
        Scanner scan = new Scanner(System.in);
        menu = scan.nextInt();
        switch (menu){
            case 1:
                Userlogin loginuser= new Userlogin();
                loginuser.login(); 
                break;
            case 2:
                new FrontPage().emergecyHelp();
                break;
            case 3:
                break;
                
            case 6://Feature implementation & testing Purpose
                new MongoDB().mongoDBEmergencyDB();
                break;
            default:
                break;
        }
    }

    void emergecyHelp(){
        System.out.print("\033[H\033[2J");
        int x;
        LogoAndUI showlogo = new LogoAndUI();
        showlogo.logo();
        new Menus().emergencyNumber();
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        switch (x) {
            case 1:
                
                break;
            case 2:
            
                break;
            case 3:
            
                break;
            case 4:
            
                break;
            case 5:
            
                break;
            case 6:
            
                break;
            case 7:
            
                break;
            case 8:

                new MongoDB().mongoDBEmergencyDB();
                break;
            case 9:
                new FrontPage().frontPage();
                break;
        
            default:
                break;
        }
    }
}
