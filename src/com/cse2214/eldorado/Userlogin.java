package com.cse2214.eldorado;
//Takrim
//2012020205
//

import java.util.Scanner;

public class Userlogin 
{

    void login()
    {
        System.out.print("\033[H\033[2J"); //clear terminnal

        int menuSel;

        LogoAndUI showlogo = new LogoAndUI();
        showlogo.logo();
       
        String UserName, Password;

        Menus menu = new Menus();
        menu.loginSignup();

        Scanner scan = new Scanner(System.in);
        menuSel = scan.nextInt();

        switch (menuSel) 
        {
            case 1: 
            {

                Userlogin userlogin= new Userlogin();
                userlogin.login1();     
            
                break;
            }

            case 2: 
            {  
                Userlogin userlogin= new Userlogin();
                userlogin.login1();                                  
                
                break;
            }

            case 3: 
            {  
                Userlogin userlogin= new Userlogin();
                userlogin.login1();                                  
                
                break;
            }

            case 4: 
            {
                LogoAndUI showloading = new LogoAndUI();
                showloading.loadingBar(); 

                Userlogin userlogin= new Userlogin();
                userlogin.login1();                                  
                
                break;
            }

        
            default:
            {
                try 
                {
                    for(int i=0;i<10;i++)
                    {
                        Thread.sleep(50);
                    }
                    //System.out.println("\t\t\t\t\t\t\t !!!!Wrong Input!!!!");
                } 
                catch (Exception e)
                {
            
                }


               // System.out.print("\033[H\033[2J");

                Userlogin wronglogin= new Userlogin();
                wronglogin.login();
                System.out.println("\t\t\t\t\t\t\t !!!!Wrong Input!!!!");
                //break;
            }
            
        }
    }

    void login1()
    {
        System.out.print("\033[H\033[2J");

        //int menuSel;

        LogoAndUI showlogo = new LogoAndUI();
        showlogo.logo();


        String UserNumber,Name;
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

        System.out.print("\t\t\t\t\t\tPassword      : ");
        Name = scan.nextLine();

        if(new MongoDB().passwordAuth(UserNumber, Name))
        {
            System.out.print("\t\t\t\t\t\tTakrim IS Hijra..........****");

        }
        else
        {
            System.out.print("\t\t\t\t\t\tTakrim IS 100% Hijra..........****");

        }





    }
    
}
