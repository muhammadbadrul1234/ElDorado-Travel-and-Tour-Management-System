package com.cse2214.eldorado;

//Contribution
//Badrul
//2012020216

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

        switch (menu)
        {
            case 1:
                
                break;
        
            default:
                break;
        }

        

        

 

    
    }
    
}
