package com.cse2214.eldorado;

import java.util.Scanner;

public class Hotel{
                  
      
        void domesticHotelRental()
            {
                 
                  
                 int choice,n=1;

                 System.out.println("\t\t\t\t\t\t======================================================");
                 System.out.println("\t\t\t\t\t\t|         ** HOTEL RENTAL AND ROOM BOOKING SYSTEM   **");            
                 System.out.println("\t\t\t\t\t\t******************************************************");
                 System.out.println("\t\t\t\t\t\t|               1. Profile Creation                  |");
                 System.out.println("\t\t\t\t\t\t|               2. Destination                       |");
                 System.out.println("\t\t\t\t\t\t|               3. Booking & Payment                 |");
                 System.out.println("\t\t\t\t\t\t|               4. View Profile                      |");
                 System.out.println("\t\t\t\t\t\t|               5. Exit                              |");
                 System.out.println("\t\t\t\t\t\t******************************************************");



                 Scanner scan = new Scanner(System.in);
                 System.out.println("Enter Your Choice: ");
                 choice = scan.nextInt();
        
                 switch(choice){
              
                 case 1:
                 {
                
                

                    Hotel hotel = new Hotel();
                    hotel.guestProfile();
                    n++;


                     

                }

                case 2:
                {

                
                    if(n<choice)
                    break;


                    Hotel hotel = new Hotel();
                    hotel.guestdestination();
                    n++;

               
                }


               case 3:
               {
                
                    if(n<choice)
                    break;
                    Hotel hotel = new Hotel();
                    hotel.guestpurchase();
                    
                    n++;

                  



               }

               case 4:
               {

                if(n<choice)
                break;

                Hotel hotel = new Hotel();
                hotel.guestprofileview();
                n++;



               }

               case 5:
               {
                 
               
                Hotel hotel = new Hotel();
                hotel.guestexit();





               }

            } 
        }   

         void guestProfile() {
            
            Scanner scan= new Scanner(System.in);
            String name, currentlocation, mobilenumber, email;

            System.out.print("\t\t\t\t\t\t\tEnter Your Name: ");
            name = scan.nextLine();

            System.out.print("\t\t\t\t\t\t\tEnter Your Current Location: ");
            currentlocation = scan.nextLine();

            System.out.print("\t\t\t\t\t\t\tEnter YOur Mobile Number: ");
            mobilenumber = scan.nextLine();

            System.out.print("\t\t\t\t\t\t\tEnter Your Email: ");
            email = scan.nextLine();

            System.out.println("\t\t\t\t\t\t\tYour Name:  "+name);
            System.out.println("\t\t\t\t\t\t\tYour Current Location:  "+currentlocation);
            System.out.println("\t\t\t\t\t\t\tYour Mobile Number:  "+mobilenumber);
            System.out.println("\t\t\t\t\t\t\tYour Email:  "+email);



         }


         void guestdestination()
         
         {
            
            Scanner scan= new Scanner(System.in);  
            
            String destination;

            System.out.print("\t\t\t\t\t\t\tSelect Your Destination: ");
            destination = scan.nextLine();
             
            
            System.out.println("\t\t\t\t\t\t\tThe Availabel Hotel list Acoording to Your Destination:  ");
            //bus database

         }




        void guestpurchase()
        {
                 
            //system("cls");

            // loading();

           // logo();

           
           int choice;
    

            System.out.println("\n\n\t\t\t\t\t\t\t=======================================");
            System.out.println("\n\t\t\t\t\t\t\t|          PURCHASE PORTAL            |");
            System.out.println("\n\t\t\t\t\t\t\t|        New Customer Invoice         |");
            System.out.println("\n\t\t\t\t\t\t\t|          1.Suite Room               |");
            System.out.println("\n\t\t\t\t\t\t\t|          2.Normal Room          |");
            System.out.println("\n\t\t\t\t\t\t\t=======================================");
            
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter Your Choice: ");

            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                {
                    //Suite Room

                    int sroomticketprice, sroomquantitiy, sroomnumber, stotalprice;

                    System.out.print("How many room do you want to book: ");
                    sroomquantitiy = scan.nextInt();

                   

                   // stotalprice=(sroomticketprice*sroomquantitiy) database
                    //database read;

                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                   // System.out.println("\n\t\t\t\t                       The amount You need to pay is: "+stotalprice+"TK");
                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t|                             Order Taken Successfully                                  |");
                    System.out.println("\n\t\t\t\t|                        Go to Reciept Menu and Pay The Bill                            |");                         
                    System.out.println("\n\t\t\t\t|_______________________________________________________________________________________|"); 

                }

                case 2:

                 {
                     //Normal class

                    int nroomticketprice, nroomquantitiy, nroomnumber, ntotalprice;

                    System.out.print("How many Rooms do you want to book: ");
                    nroomquantitiy = scan.nextInt();

                    

                    //ntotalprice=(nclassticketprice*nticketquantitiy); database
                    //database read;

                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                   // System.out.println("\n\t\t\t\t                       The amount You need to pay is: "+ntotalprice+"TK");
                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t|                             Order Taken Successfully                                  |");
                    System.out.println("\n\t\t\t\t|                        Go to Reciept Menu and Pay The Bill                            |");                         
                    System.out.println("\n\t\t\t\t|_______________________________________________________________________________________|"); 

                     
                }
            }


                //cin.get();

                //cin.get();
            
                //system("cls") ;
            
                //loading();
            
                //logo()

                
                System.out.println("\n\t\t\t\t\t\t\t=======================================");
                System.out.println("\n\t\t\t\t\t\t\t***************************************");
                System.out.println("\n\t\t\t\t\t\t\t|     Select Your Payment Methood     |");
                System.out.println("\n\t\t\t\t\t\t\t***************************************");
                System.out.println("\n\t\t\t\t\t\t\t|  1.  Visa                           |");
                System.out.println("\n\t\t\t\t\t\t\t|  2.  Mastercard                     |");
                System.out.println("\n\t\t\t\t\t\t\t|  3.  American Express               |");
                System.out.println("\n\t\t\t\t\t\t\t|  4.  bKash                          |");
                System.out.println("\n\t\t\t\t\t\t\t|  5.  Nagad                          |");
                System.out.println("\n\t\t\t\t\t\t\t|  6.  Rocket                         |");
                System.out.println("\n\t\t\t\t\t\t\t***************************************");
                
                
                
                System.out.println("\n\t\t\t\t\t\t\tEnter Your choice: ");
                choice =scan.nextInt();
                
            
                String card, otp;
                
     
     
     
     
     
                if(choice==1)
                {
                    System.out.println("\n\t\t\t\t\t\t\tEnter Your Visa Card Number: ");
                    card = scan.next();
     
                    System.out.println("\n\t\t\t\t\t\t\tPlease Swipe Your Visa Card To the Pos Macthine And then Press Enter ");
     
                    //cin.get();
     
                    //cin.get();
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tEnter OTP Sent to The RMN: ");
                    otp = scan.next();
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tTransaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\tPress Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Visa_Card "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }



                else if(choice==2)
                {
                    System.out.println("\n\t\t\t\t\t\t\tEnter Your Master Card Number: ");
                    card = scan.next();
     
                    System.out.println("\n\t\t\t\t\t\t\tPlease Swipe Your Master Card To the Pos Macthine And then Press Enter ");
     
                    //cin.get();
     
                    //cin.get();
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tEnter OTP Sent to The RMN: ");
                    otp = scan.next();
                    
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tTransaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Master_Card "<<card<<' '<<otp;
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }




                else if(choice==3)
                {
                    System.out.println("\n\t\t\t\t\t\t\tEnter Your American Express Card Number: ");
                    card = scan.next();
     
                    System.out.println("\n\t\t\t\t\t\t\t Please Swipe Your American Express Card To the Pos Macthine And then Press Enter ");
     
                    //cin.get();
     
                    //cin.get();
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Enter OTP Sent to The RMN: ");
                    otp = scan.next();
                    //cin>>otp;
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Transaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" American_Express_Card "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }



                else if(choice==4)
                {
                    System.out.println("\n\t\t\t\t\t\t\t Enter Your bKash Number: ");
                    card = scan.next();
     
     
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Enter OTP Sent to The RMN: ");
                    otp = scan.next();
                    //cin>>otp;
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Transaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" bKash "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }



                else if(choice==5)
                {
                    System.out.println("\n\t\t\t\t\t\t\t Enter Your Nagad Number: ");
                    card = scan.next();
     
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Enter OTP Sent to The RMN: ");
                    otp = scan.next();

                    
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Transaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Nagad "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }


                else if(choice==6)
                {
                    System.out.println("\n\t\t\t\t\t\t\t Enter Your Rocket Number: ");
                    card = scan.next();
     
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Enter OTP Sent to The RMN: ");
                    otp = scan.next();
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tTransaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\tPress Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Rocket "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
                    //customer_invoice();

                }
            }
                  
      


      void guestprofileview()
      {
              
          //guest profile
          //destination
          //room number
          //payment status (paid)

      }


        void guestexit()
      {

             
         
            
      
      }


      // international hotel roome booking



      void internationalHotelRental()
            {
                 
                  
                 int choice,n=1;

                 System.out.println("\t\t\t\t\t\t======================================================");
                 System.out.println("\t\t\t\t\t\t|          ** HOTEL RENTAL AND ROOM BOOKING SYSTEM   **");            
                 System.out.println("\t\t\t\t\t\t******************************************************");
                 System.out.println("\t\t\t\t\t\t|               1. Profile Creation                  |");
                 System.out.println("\t\t\t\t\t\t|               2. Destination                       |");
                 System.out.println("\t\t\t\t\t\t|               3. Booking & Payment                 |");
                 System.out.println("\t\t\t\t\t\t|               4. View Profile                      |");
                 System.out.println("\t\t\t\t\t\t|               5. Exit                              |");
                 System.out.println("\t\t\t\t\t\t******************************************************");



                 Scanner scan = new Scanner(System.in);
                 System.out.println("Enter Your Choice: ");
                 choice = scan.nextInt();
        
                 switch(choice){
              
                 case 1:
                 {
                
                

                    Hotel hotel = new Hotel();
                    hotel.intguestProfile();
                    n++;


                     

                }

                case 2:
                {

                
                    if(n<choice)
                    break;


                    Hotel hotel = new Hotel();
                    hotel.intguestdestination();
                    n++;

               
                }


               case 3:
               {
                
                    if(n<choice)
                    break;
                    Hotel hotel = new Hotel();
                    hotel.intguestpurchase();
                    
                    n++;

                  



               }

               case 4:
               {

                if(n<choice)
                break;

                Hotel hotel = new Hotel();
                hotel.intguestprofileview();
                n++;



               }

               case 5:
               {
                 
               
                Hotel hotel = new Hotel();
                hotel.intguestexit();





               }

            } 
        }   

         void intguestProfile() {
            
            Scanner scan= new Scanner(System.in);
            String name, currentlocation, mobilenumber, email;

            System.out.print("\t\t\t\t\t\t\tEnter Your Name: ");
            name = scan.nextLine();

            System.out.print("\t\t\t\t\t\t\tEnter Your Current Location: ");
            currentlocation = scan.nextLine();

            System.out.print("\t\t\t\t\t\t\tEnter YOur Mobile Number: ");
            mobilenumber = scan.nextLine();

            System.out.print("\t\t\t\t\t\t\tEnter Your Email: ");
            email = scan.nextLine();

            System.out.println("\t\t\t\t\t\t\tYour Name:  "+name);
            System.out.println("\t\t\t\t\t\t\tYour Current Location:  "+currentlocation);
            System.out.println("\t\t\t\t\t\t\tYour Mobile Number:  "+mobilenumber);
            System.out.println("\t\t\t\t\t\t\tYour Email:  "+email);



         }


         void intguestdestination()
         
         {
            
            Scanner scan= new Scanner(System.in);  
            
            String destination;

            System.out.print("\t\t\t\t\t\t\tSelect Your Destination: ");
            destination = scan.nextLine();
             
            
            System.out.println("\t\t\t\t\t\t\tThe Availabel Hotel list Acoording to Your Destination:  ");
            //bus database

         }




        void intguestpurchase()
        {
                 
            //system("cls");

            // loading();

           // logo();

           
           int choice;
    

            System.out.println("\n\n\t\t\t\t\t\t\t=======================================");
            System.out.println("\n\t\t\t\t\t\t\t|          PURCHASE PORTAL            |");
            System.out.println("\n\t\t\t\t\t\t\t|        New Customer Invoice         |");
            System.out.println("\n\t\t\t\t\t\t\t|          1.Suite Room               |");
            System.out.println("\n\t\t\t\t\t\t\t|          2.Normal Room          |");
            System.out.println("\n\t\t\t\t\t\t\t=======================================");
            
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter Your Choice: ");

            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                {
                    //Suite Room

                    int sroomticketprice, sroomquantitiy, sroomnumber, stotalprice;

                    System.out.print("How many room do you want to book: ");
                    sroomquantitiy = scan.nextInt();

                   

                   // stotalprice=(sroomticketprice*sroomquantitiy) database
                    //database read;

                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                   // System.out.println("\n\t\t\t\t                       The amount You need to pay is: "+stotalprice+"TK");
                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t|                             Booking Taken Successfully                                  |");
                    System.out.println("\n\t\t\t\t|                        Go to Reciept Menu and Pay The Bill                            |");                         
                    System.out.println("\n\t\t\t\t|_______________________________________________________________________________________|"); 

                }

                case 2:

                 {
                     //Normal class

                    int nroomticketprice, nroomquantitiy, nroomnumber, ntotalprice;

                    System.out.print("How many Rooms do you want to book: ");
                    nroomquantitiy = scan.nextInt();

                    

                    //ntotalprice=(nclassticketprice*nticketquantitiy); database
                    //database read;

                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                   // System.out.println("\n\t\t\t\t                       The amount You need to pay is: "+ntotalprice+"TK");
                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t|                            Booking Taken Successfully                                  |");
                    System.out.println("\n\t\t\t\t|                        Go to Reciept Menu and Pay The Bill                            |");                         
                    System.out.println("\n\t\t\t\t|_______________________________________________________________________________________|"); 

                     
                }
            }


                //cin.get();

                //cin.get();
            
                //system("cls") ;
            
                //loading();
            
                //logo()

                
                System.out.println("\n\t\t\t\t\t\t\t=======================================");
                System.out.println("\n\t\t\t\t\t\t\t***************************************");
                System.out.println("\n\t\t\t\t\t\t\t|     Select Your Payment Methood     |");
                System.out.println("\n\t\t\t\t\t\t\t***************************************");
                System.out.println("\n\t\t\t\t\t\t\t|  1.  Visa                           |");
                System.out.println("\n\t\t\t\t\t\t\t|  2.  Mastercard                     |");
                System.out.println("\n\t\t\t\t\t\t\t|  3.  American Express               |");
                System.out.println("\n\t\t\t\t\t\t\t***************************************");
                
                
                
                System.out.println("\n\t\t\t\t\t\t\tEnter Your choice: ");
                choice =scan.nextInt();
                
            
                String card, otp;
                
     
     
     
     
     
                if(choice==1)
                {
                    System.out.println("\n\t\t\t\t\t\t\tEnter Your Visa Card Number: ");
                    card = scan.next();
     
                    System.out.println("\n\t\t\t\t\t\t\tPlease Swipe Your Visa Card To the Pos Macthine And then Press Enter ");
     
                    //cin.get();
     
                    //cin.get();
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tEnter OTP Sent to The RMN: ");
                    otp = scan.next();
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tTransaction Successfull! You are CHecked in!");
     
                    System.out.println("\n\t\t\t\t\t\t\tPress Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Visa_Card "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }



                else if(choice==2)
                {
                    System.out.println("\n\t\t\t\t\t\t\tEnter Your Master Card Number: ");
                    card = scan.next();
     
                    System.out.println("\n\t\t\t\t\t\t\tPlease Swipe Your Master Card To the Pos Macthine And then Press Enter ");
     
                    //cin.get();
     
                    //cin.get();
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tEnter OTP Sent to The RMN: ");
                    otp = scan.next();
                    
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\tTransaction Successfull! You are Checked in!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Master_Card "<<card<<' '<<otp;
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }




                else if(choice==3)
                {
                    System.out.println("\n\t\t\t\t\t\t\tEnter Your American Express Card Number: ");
                    card = scan.next();
     
                    System.out.println("\n\t\t\t\t\t\t\t Please Swipe Your American Express Card To the Pos Macthine And then Press Enter ");
     
                    //cin.get();
     
                    //cin.get();
     
                    //loading();
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Enter OTP Sent to The RMN: ");
                    otp = scan.next();
                    //cin>>otp;
     
                    //loading();
                    //loading();
     
                    System.out.println("\n\t\t\t\t\t\t\t Transaction Successfull! You are chekced in!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" American_Express_Card "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
     
                    //cin.get();
     
                    //customer_invoice();
     
     
                }
            }



                
      


            void intguestprofileview()
                       {
              
                              //guest profile
                             //destination
                            //room number
                            //payment status (paid)

                        }


        void intguestexit()
      {

             
         
            
      
      }



            

    }
