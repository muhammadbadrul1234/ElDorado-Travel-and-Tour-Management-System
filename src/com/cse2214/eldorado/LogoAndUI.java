package com.cse2214.eldorado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogoAndUI
{
    void Logo()
    {
        try
        {
            File logo = new File("Logo.txt");
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
    void Welcome()
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
    void ShutDown()
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


}

