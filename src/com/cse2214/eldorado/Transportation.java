package com.cse2214.eldorado;
//Takrim

import java.util.Scanner;





public class Transportation
{
    void domesticbus()
    {
         
       // LogoAndUI logo = new LogoAndUI();
       // logo.logo();

        int choice,n=1;
        

        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************************************************************");
        System.out.println("** BUS RESERVATION AND TICKETING SYSTEM   **");
        System.out.println("********************************************");
        System.out.println("** [1] Passernger Profile                  **");
        System.out.println("** [2] Destination                **");
        System.out.println("** [3] Ticket Purchase                       **");
        System.out.println("** [4] View                          **");
        System.out.println("** [5] Exit                          **");
        System.out.println("***************************************");
        System.out.println("***************************************\n");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        choice = scan.nextInt();
        
        switch(choice){
              
               case 1:
               {
                
                

                Transportation transportation = new Transportation();
                transportation.passengerprofile();
                n++;


                     

               }

               case 2:
               {

                
                 if(n<choice)
                 break;


                Transportation des  = new Transportation();
                des.destination();
                n++;

               
                }


               case 3:
               {
                
                if(n<choice)
                break;
                Transportation pur = new Transportation();
                pur.purchase();
                n++;

                  



               }

               case 4:
               {

                if(n<choice)
                break;


                     
                  n++;



               }

               case 5:
               {
                 










               }

            } 
        }   

         void passengerprofile()
         
         {
            
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


         void destination()
         
         {
            
            Scanner scan= new Scanner(System.in);  
            
            String destination;

            System.out.print("\t\t\t\t\t\t\tSelect Your Destination: ");
            destination = scan.nextLine();
             
            
            System.out.println("\t\t\t\t\t\t\tThe Availabel Buses list Acoording to Your Destination:  ");
            //bus database

         }




        void purchase()
        {
                 
            //system("cls");

            // loading();

           // logo();

           
           int choice;
    

            System.out.println("\n\n\t\t\t\t\t\t\t=======================================");
            System.out.println("\n\t\t\t\t\t\t\t|          PURCHASE PORTAL            |");
            System.out.println("\n\t\t\t\t\t\t\t|        New Customer Invoice         |");
            System.out.println("\n\t\t\t\t\t\t\t|          1.Buisness Class           |");
            System.out.println("\n\t\t\t\t\t\t\t|          2.Economic Class            |");
            System.out.println("\n\t\t\t\t\t\t\t=======================================");
            
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter Your Choice: ");

            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                {
                    //businees class

                    int Bclassticketprice, Bticketquantitiy,Bseatnumber, Btotalprice;

                    System.out.print("How many Tickets do you want to buy: ");
                    Bticketquantitiy = scan.nextInt();

                    System.out.print("The Seat number you want to choose: ");
                    Bseatnumber = scan.nextInt();

                   // Btotalprice=(Bclassticketprice*Bticketquantitiy) database
                    //database read;

                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t                       The amount You need to pay is: "+Btotalprice+"TK");
                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t|                             Order Taken Successfully                                  |");
                    System.out.println("\n\t\t\t\t|                        Go to Reciept Menu and Pay The Bill                            |");                         
                    System.out.println("\n\t\t\t\t|_______________________________________________________________________________________|"); 

                }

                case 2:

                 {
                     //economy class

                    int Eclassticketprice, Eticketquantitiy,Eseatnumber, Etotalprice;

                    System.out.print("How many Tickets do you want to buy: ");
                    Eticketquantitiy = scan.nextInt();

                    System.out.print("The Seat number you want to choose: ");
                    Eseatnumber = scan.nextInt();

                    //Etotalprice=(Eclassticketprice*Eticketquantitiy); database
                    //database read;

                    System.out.println("\n\t\t\t\t_________________________________________________________________________________________");
                    System.out.println("\n\t\t\t\t                       The amount You need to pay is: "+Etotalprice+"TK");
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
     
                    System.out.println("\n\t\t\t\t\t\t\t Transaction Successfull!");
     
                    System.out.println("\n\t\t\t\t\t\t\t Press Enter To Return");
     
                    //ofstream Payment_Directory("Payment_Directory.txt",ios::app);
                    //Payment_Directory<<'\n'<<date<<' '<<Number<<' '<<Employee_ID<<' '<<Name<<' '<<Phone_No<<' '<<sum<<" Rocket "<<card<<' '<<otp;
                    //Payment_Directory.close();
     
                    //cin.get();
                    //customer_invoice();

                }
            }

            void view()
            {
                    
                //passenger profile
                //destination
                //seat number, quantity of seat
                //payment status (paid)

                     



            }


            void exit()
            {

                   
               
                  



            }

            
           
            
                    


        }
            
            

             
    

    










