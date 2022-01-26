package com.cse2214.eldorado;
//Badrul

import java.io.File;  //Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // MongoDB ax = new Transportation();
        // ax.DomesticFlight();
        //new MongoDB().mongoDB();
        //System.console().writer().println("cls");
        System.out.print("\033[H\033[2J");
        //MongoDB mdb= new MongoDB();


 
        //mdb.mongoDB();






















        LogoAndUI logo = new LogoAndUI();
        logo.Logo();
        LogoAndUI welcome = new LogoAndUI();
        welcome.Welcome();
        LogoAndUI shut = new LogoAndUI();
        shut.ShutDown();
        System.out.println("\n\t\t\t\t\t\t\t         A Project by Astronauts");
        System.out.println("\n\t\t\t\t\t\t\t      Supervised By SR Kohinoor Sir");
        System.out.println("\n\t\t\t\t\t\t\t       Lecturer, Dept of CSE, LU");

        System.out.println("\n\n\t\t\t\t\t\t\t***************************************");
        System.out.println("\n\t\t\t\t\t\t\t|        1. ADMINISTRATION LOGIN      |");
        System.out.println("\n\t\t\t\t\t\t\t|        2. EMPLOYEE LOGIN            |");
        System.out.println("\n\t\t\t\t\t\t\t|        3. ABOUT US                  |");

    }
}



