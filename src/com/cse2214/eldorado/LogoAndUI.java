package com.cse2214.eldorado;

//Contribution
//Badrul
//2012020216

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Thread;



public class LogoAndUI
{
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

    void logo()
    {
        try
        {
            File logo = new File("Logo.txt");
            Scanner readLogo = new Scanner(logo);
            while (readLogo.hasNextLine())
            {
                String show = readLogo.nextLine();
                System.out.println(ANSI_BLUE + show  + ANSI_RESET);
            }
            readLogo.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println(ANSI_WHITE_BACKGROUND +ANSI_RED + "\t\t\t\t\t\t\t \033[3m  Tour and Travel Management System  \033[0m" + ANSI_RESET);
    }

    void welcome()
    {
        try
        {
            File logo = new File("Welcome.txt");
            Scanner readLogo = new Scanner(logo);
            while (readLogo.hasNextLine())
            {
                String show = readLogo.nextLine();
                System.out.println(show);
            }
            readLogo.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        //Baddrul

    }

    void shutDown()
    {
        try
        {
            File logo = new File("Exit.txt");
            Scanner readLogo = new Scanner(logo);
            while (readLogo.hasNextLine())
            {
                String show = readLogo.nextLine();
                System.out.println(show);
            }
            readLogo.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }



    }

    void loading()
    {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\tLoading\n\n\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t      ");

        char x=16;

        try 
        {
            for(int i=0;i<50;i++)
            {
                
                System.out.print(ANSI_WHITE_BACKGROUND +ANSI_PURPLE + x  + ANSI_RESET);

                if(i<10)
                {
                    Thread.sleep(150);
                }
                if(i>=10 && i<20)
                {
                    Thread.sleep(20);
                }
                if(i>=10)
                {
                    Thread.sleep(20);
                }
            }
        } 
        catch (Exception e)
        {
            
        }
    }

    void loadingBar()
    {
        System.out.print("\n\t\t\t\t\t\t      ");

        char x=16;

        //LogoAndUI showloading = new LogoAndUI();
        //showloading.loading();

        try 
        {
            for(int i=0;i<50;i++)
            {
                
                System.out.print(x);

                if(i<10)
                {
                    Thread.sleep(10);
                }
                if(i>=10 && i<20)
                {
                    Thread.sleep(5);
                }
                if(i>=10)
                {
                    Thread.sleep(1);
                }
            }
            System.out.print("\n");

        } 
        catch (Exception e)
        {
            
        }

        

    }
}





