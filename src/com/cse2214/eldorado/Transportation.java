package com.cse2214.eldorado;

//Takrim

import java.util.ArrayList;
import java.util.Scanner;

public class Transportation {
    UserInterface logo = new UserInterface();
    void buspassengerprofile() {
        Scanner scan = new Scanner(System.in);
        String name, currentlocation, mobilenumber, email;
        System.out.print("\t\t\t\t\t\t\tEnter Your Name: ");
        name = scan.nextLine();
        System.out.print("\t\t\t\t\t\t\tEnter Your Current Location: ");
        currentlocation = scan.nextLine();
        System.out.print("\t\t\t\t\t\t\tEnter YOur Mobile Number: ");
        mobilenumber = scan.nextLine();
        System.out.print("\t\t\t\t\t\t\tEnter Your Email: ");
        email = scan.nextLine();
        System.out.println("\t\t\t\t\t\t\tYour Name:  " + name);
        System.out.println("\t\t\t\t\t\t\tYour Current Location:  " + currentlocation);
        System.out.println("\t\t\t\t\t\t\tYour Mobile Number:  " + mobilenumber);
        System.out.println("\t\t\t\t\t\t\tYour Email:  " + email);
    }
    void busdestination() {
        Scanner scan = new Scanner(System.in);
        String destination;
        String to;
        System.out.print("\t\t\t\t\t\t Enter Start Point:");
        to = scan.nextLine();
        System.out.print("\t\t\t\t\t\t Enter Destination:");
        destination = scan.nextLine();
        new UserInterface().loadingBar();
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().availableBus(destination);
        System.out.println("\t\t\t\t\t\tThe Available Buses list Acoording to Your Destination:  ");
        System.out.print(
                "\t\t\t\t_________________________________________________________________________________________\n");
        System.out.print(
                "\t\t\t\t|   SL  |         Route         |           Bus Name    |  Time | Fare  |AvailableTicket|");
        System.out.print(
                "\n\t\t\t\t+---------------------------------------------------------------------------------------+");
        ArrayList<Integer> Fares = new MongoDB().mongoDBBusFinder(to, destination);
        System.out.print(
                "\n\t\t\t\t+---------------------------------------------------------------------------------------+\n");
        int num1, num2;
        System.out.print("\t\t\t\t Which one do you want to buy       : ");
        num1 = scan.nextInt();
        System.out.print("\t\t\t\t How many Tickets do you want to buy: ");
        num2 = scan.nextInt();
        int cost = Fares.get(num1 - 1) * num2;
        System.out.print(
                "\n\t\t\t\t_________________________________________________________________________________________");
        System.out.print(
                "\n\t\t\t\t|                             Order Taken Successfully                                  |");
        System.out.print(
                "\n\t\t\t\t|   Please Press Enter Key to Confirm your Purchase. Your bank Account will be Charged  |");
        System.out.print(
                "\n\t\t\t\t|_______________________________________________________________________________________|\n");
        new UserInterface().promptEnterKey();

        System.out.print("\t\t\t\t " + cost);
    }
    void traindestination() {
        Scanner scan = new Scanner(System.in);
        String destination;
        String to;
        System.out.print("\t\t\t\t\t\t Enter Start Point:");
        to = scan.nextLine();
        System.out.print("\t\t\t\t\t\t Enter Destination:");
        destination = scan.nextLine();
        new UserInterface().loadingBar();
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().availableBus(destination);
        System.out.println("\t\t\t\t\t\t The Available Train list Acoording to Your Destination:  ");
        System.out.print(
                "\t\t_________________________________________________________________________________________________________________\n");
        System.out.print(
                "\t\t|   SL  |         Route         |        Train Name     |            Class         | Time| Fare |AvailableTicket|");
        System.out.print(
                "\n\t\t+---------------------------------------------------------------------------------------------------------------+");
        ArrayList<Integer> Fares = new MongoDB().mongoDBTrainFinder(to, destination);
        System.out.print(
                "\n\t\t+---------------------------------------------------------------------------------------------------------------+\n");
        int num1, num2;
        System.out.print("\t\t\t\t Which one do you want to buy       : ");
        num1 = scan.nextInt();
        System.out.print("\t\t\t\t How many Tickets do you want to buy: ");
        num2 = scan.nextInt();
        int cost = Fares.get(num1 - 1) * num2;
        System.out.print(
                "\n\t\t\t\t_________________________________________________________________________________________");
        System.out.print(
                "\n\t\t\t\t|                             Order Taken Successfully                                  |");
        System.out.print(
                "\n\t\t\t\t|   Please Press Enter Key to Confirm your Purchase. Your bank Account will be Charged  |");
        System.out.print(
                "\n\t\t\t\t|_______________________________________________________________________________________|\n");
        new UserInterface().promptEnterKey(); 
    }
    void planedestination() {
        Scanner scan = new Scanner(System.in);
        String destination;
        String to;
        System.out.print("\t\t\t\t\t\t Enter Start Point:");
        to = scan.nextLine();
        System.out.print("\t\t\t\t\t\t Enter Destination:");
        destination = scan.nextLine();
        new UserInterface().loadingBar();
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().availablePlane1(destination);
        System.out.println("\t\t\t\t\t\t The Available Plane list Acoording to Your Destination:  ");
        System.out.print(
                "\t\t_________________________________________________________________________________________________________________\n");
        System.out.print(
                "\t\t|   SL  |         Route         |        Plane Name     |            Class         | Time| Fare |AvailableTicket|");
        System.out.print(
                "\n\t\t+---------------------------------------------------------------------------------------------------------------+");
        ArrayList<Integer> Fares = new MongoDB().mongoDBPlaneFinder(to, destination);
        System.out.print(
                "\n\t\t+---------------------------------------------------------------------------------------------------------------+\n");
        int num1, num2;
        System.out.print("\t\t\t\t Which one do you want to buy       : ");
        num1 = scan.nextInt();
        System.out.print("\t\t\t\t How many Tickets do you want to buy: ");
        num2 = scan.nextInt();
        int cost = Fares.get(num1 - 1) * num2;
        System.out.print(
                "\n\t\t\t\t_________________________________________________________________________________________");
        System.out.print(
                "\n\t\t\t\t|                             Order Taken Successfully                                  |");
        System.out.print(
                "\n\t\t\t\t|   Please Press Enter Key to Confirm your Purchase. Your bank Account will be Charged  |");
        System.out.print(
                "\n\t\t\t\t|_______________________________________________________________________________________|\n");
        new UserInterface().promptEnterKey(); 
    }
    void planedestination2() {
        Scanner scan = new Scanner(System.in);
        String destination;
        String to;
        System.out.print("\t\t\t\t\t\t Enter Start Point:");
        to = scan.nextLine();
        System.out.print("\t\t\t\t\t\t Enter Destination:");
        destination = scan.nextLine();
        new UserInterface().loadingBar();
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().availablePlane2(destination);
        System.out.println("\t\t\t\t\t\t The Available Plane list Acoording to Your Destination:  ");
        System.out.print(
                "\t\t_________________________________________________________________________________________________________________\n");
        System.out.print(
                "\t\t|   SL  |         Route         |        Plane Name     |            Class         | Time| Fare |AvailableTicket|");
        System.out.print(
                "\n\t\t+---------------------------------------------------------------------------------------------------------------+");
        ArrayList<Integer> Fares = new MongoDB().mongoDBPlaneFinder2(to, destination);
        System.out.print(
                "\n\t\t+---------------------------------------------------------------------------------------------------------------+\n");
        int num1, num2;
        System.out.print("\t\t\t\t Which one do you want to buy       : ");
        num1 = scan.nextInt();
        System.out.print("\t\t\t\t How many Tickets do you want to buy: ");
        num2 = scan.nextInt();
        int cost = Fares.get(num1 - 1) * num2;
        System.out.print(
                "\n\t\t\t\t_________________________________________________________________________________________");
        System.out.print(
                "\n\t\t\t\t|                             Order Taken Successfully                                  |");
        System.out.print(
                "\n\t\t\t\t|   Please Press Enter Key to Confirm your Purchase. Your bank Account will be Charged  |");
        System.out.print(
                "\n\t\t\t\t|_______________________________________________________________________________________|\n");
        new UserInterface().promptEnterKey(); 
    }
    void hoteldestination() {
        Scanner scan = new Scanner(System.in);
        String destination;
        String to="X";
        //System.out.print("\t\t\t\t\t\t Enter Start Point:");
       // to = scan.nextLine();
        System.out.print("\t\t\t\t\t\t Enter Destination:");
        destination = scan.nextLine();
        new UserInterface().loadingBar();
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().availablehotel(destination);
        System.out.println("\t\t\t\t\t\t The Available Hotel list Acoording to Your Destination:  ");
        System.out.print(
                "\t\t\t\t\t\t______________________________________________________\n");
        System.out.print(
                "\t\t\t\t\t\t|   SL  |         Hotel Name     |          Price    |");
        System.out.print(
                "\n\t\t\t\t\t\t+----------------------------------------------------+");
        ArrayList<Integer> Fares = new MongoDB().mongoDBHotelFinder(to, destination);
        System.out.print(
                "\n\t\t\t\t\t\t+----------------------------------------------------+\n");
        int num1, num2;
        System.out.print("\t\t\t\t\t\t Which one do you want to book       : ");
        num1 = scan.nextInt();
        System.out.print("\t\t\t\t\t\t How many Room do you want to book: ");
        num2 = scan.nextInt();
        int cost = Fares.get(num1 - 1) * num2;
        System.out.print(
                "\n\t\t\t\t_________________________________________________________________________________________");
        System.out.print(
                "\n\t\t\t\t|                             Order Taken Successfully                                  |");
        System.out.print(
                "\n\t\t\t\t|   Please Press Enter Key to Confirm your Purchase. Your bank Account will be Charged  |");
        System.out.print(
                "\n\t\t\t\t|_______________________________________________________________________________________|\n");
        new UserInterface().promptEnterKey(); 
    }
    void hoteldestination2() {
        Scanner scan = new Scanner(System.in);
        String destination;
        String to="x";
       // System.out.print("\t\t\t\t\t\t Enter Start Point:");
       // to = scan.nextLine();
        System.out.print("\t\t\t\t\t\t Enter Destination:");
        destination = scan.nextLine();
        //int x;
        new UserInterface().loadingBar();
        System.out.print("\033[H\033[2J");
        logo.logo();
        new UserInterface().availablehotel2(destination);
        System.out.println("\t\t\t\t\t\t The Available Hotel list Acoording to Your Destination:  ");
        System.out.print(
                "\t\t\t\t\t\t______________________________________________________\n");
        System.out.print(
                "\t\t\t\t\t\t|   SL  |         Hotel Name     |         Price     |");
        System.out.print(
                "\n\t\t\t\t\t\t+----------------------------------------------------+");
        ArrayList<Integer> Fares = new MongoDB().mongoDBHotelFinder2(to, destination);
        System.out.print(
                "\n\t\t\t\t\t\t+----------------------------------------------------+\n");
        int num1, num2;
        System.out.print("\t\t\t\t\t\t Which one do you want to book       : ");
        num1 = scan.nextInt();
        System.out.print("\t\t\t\t\t\t How many Room do you want to book: ");
        num2 = scan.nextInt();
        int cost = Fares.get(num1 - 1) * num2;
        System.out.print(
                "\n\t\t\t\t_________________________________________________________________________________________");
        System.out.print(
                "\n\t\t\t\t|                             Order Taken Successfully                                  |");
        System.out.print(
                "\n\t\t\t\t|   Please Press Enter Key to Confirm your Purchase. Your bank Account will be Charged  |");
        System.out.print(
                "\n\t\t\t\t|_______________________________________________________________________________________|\n");
        new UserInterface().promptEnterKey(); 
    }
    void paymentGateway()
    {

       // new 

    }

}
