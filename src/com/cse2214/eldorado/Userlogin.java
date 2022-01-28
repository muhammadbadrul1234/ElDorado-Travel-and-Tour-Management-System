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

        Menus menu1 = new Menus();
        menu1.userLogin();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\t\t\t\t\t\t  Email    : ");
        UserNumber = scan.nextLine();

        System.out.print("\t\t\t\t\t\t  Password : ");
        Name = scan.nextLine();

        LogoAndUI showloading1 = new LogoAndUI();
        showloading1.loadingBar();

        if(new MongoDB().passwordAuth(UserNumber, Name))
        {
            System.out.print("\033[H\033[2J");

    
            LogoAndUI showlogo1 = new LogoAndUI();
            showlogo1.logo();

            Menus menu2 = new Menus();
            menu2.userLoginSuccessfull();

            LogoAndUI showloading2 = new LogoAndUI();
            showloading2.loadingBar();

        }
        else
        {
            System.out.print("\033[H\033[2J");

            LogoAndUI showlogo1 = new LogoAndUI();
            showlogo1.logo();

            Menus menu3 = new Menus();
            menu3.userLoginUnSuccessfull();

            LogoAndUI showloading2 = new LogoAndUI();
            showloading2.loadingBar();
        }





    }
    
}
