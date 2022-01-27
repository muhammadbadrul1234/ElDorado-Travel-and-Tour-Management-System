package com.cse2214.eldorado;

//Contribution
//Badrul
//2012020216

import java.util.Scanner;

public class FrontPage
{
    void frontPage()
    {
        System.out.print("\033[H\033[2J");

        int menu;

        LogoAndUI showlogo = new LogoAndUI();
        showlogo.logo();

        Menus front = new Menus();
        front.menuOfFrontMenu();

        Scanner scan = new Scanner(System.in);
        menu = scan.nextInt();

        switch (menu)
        {
            case 1:
            {
                Userlogin loginuser= new Userlogin();
                loginuser.login(); 
                break;
            }
            case 2:
            {
                UserRegistration regi = new UserRegistration();
                regi.registration();
            }

            case 5:
            {
                new MongoDB().mongoDBBus();
                break;
            }

            default:
            {

    
                break;

            }
            
        }
    }
}
