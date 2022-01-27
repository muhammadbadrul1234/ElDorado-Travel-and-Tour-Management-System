package com.cse2214.eldorado;
//Takrim

import java.util.Scanner;

public class Userlogin {

    void login()
    {
        System.out.print("\033[H\033[2J");

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


    }
    
}
