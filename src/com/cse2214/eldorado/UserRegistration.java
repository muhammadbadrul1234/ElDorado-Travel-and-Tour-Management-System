package com.cse2214.eldorado;

//Takrim

import java.util.Scanner;

public class UserRegistration{


    
   void registration()
    {
       
      

    String UserNumber, Name, gender, PassportNumber, PhoneNumber, Email, CardNumber, VisaID, City, Country, UserName, Password;

     
     
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
  
    

    System.out.print("\t\t\t\t\t\tName      : ");
    Name = scan.nextLine();





    System.out.print("\t\t\t\t\t\tGender      : ");
    gender = scan.nextLine();



    System.out.print("\t\t\t\t\t\tPassport Number : ");
    PassportNumber = scan.nextLine();



    System.out.print("\t\t\t\t\t\tPhone Number : ");
    PhoneNumber = scan.nextLine();

    

    System.out.print("\t\t\t\t\t\tEmail  : ");
    Email = scan.nextLine();

    

    System.out.print("\t\t\t\t\t\tCard Number : ");
    CardNumber = scan.nextLine();

    

    System.out.print("\t\t\t\t\t\tVisa Id : ");
    VisaID = scan.nextLine();



    System.out.print("\t\t\t\t\t\tCity  : ");
    City = scan.nextLine();

    

    System.out.print("\t\t\t\t\t\tCountry     : ");
    Country = scan.nextLine();



    System.out.print("\t\t\t\t\t\tUser Name     : ");
    UserName = scan.nextLine();

    

    System.out.print("\t\t\t\t\t\tPassword  : ");
    Password = scan.nextLine();



    System.out.println("\n\n\t\t\t\t\t\t==========================================================");
    System.out.println("\n\t\t\t\t\t\t|                 ADMINISTRATION PORTAL                  |");
    System.out.println("\n\t\t\t\t\t\t|                   New User Sign-up                    |");
    System.out.println("\n\t\t\t\t\t\t==========================================================");
    System.out.println("\n\t\t\t\t\t\t**********************************************************");
    System.out.println("\n\t\t\t\t\t\t|          Congratulation!! Welcome to  ELDORADO       |");
    System.out.println("\n\t\t\t\t\t\t**********************************************************");


    System.out.println("\t\t\t\t\t\tUsernumber: "+UserNumber);
    System.out.println("\t\t\t\t\t\tName : "+Name);
    System.out.println("\t\t\t\t\t\tGender: "+gender);
    System.out.println("\t\t\t\t\t\tPassportNumber: "+PassportNumber);
    System.out.println("\t\t\t\t\t\tPhoneNumber: "+PhoneNumber);
    System.out.println("\t\t\t\t\t\tEmail: "+Email);
    System.out.println("\t\t\t\t\t\tCard Number: "+CardNumber);
    System.out.println("\t\t\t\t\t\tVisa Id: "+UserNumber);
    System.out.println("\t\t\t\t\t\tCity: "+City);
    System.out.println("\t\t\t\t\t\tCountry: "+Country);
    System.out.println("\t\t\t\t\t\tUser Name: "+UserName);
    System.out.println("\t\t\t\t\t\tUser Password: "+Password);
        

    }

    
}
