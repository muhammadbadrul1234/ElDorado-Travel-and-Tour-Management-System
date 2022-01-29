import java.util.Scanner;
public class Immigrationhelp {

  
    
    void medicalSupport()
    {
             
        System.out.println("\t\t\t\t\t\t======================================================");
        System.out.println("\t\t\t\t\t\t|                        User                        |");
        System.out.println("\t\t\t\t\t\t|         Please Select from the option Below        |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.println("\t\t\t\t\t\t|               1. Covid Regitration                 |");
        System.out.println("\t\t\t\t\t\t|               2. Mediacl Test registration         |");
        System.out.println("\t\t\t\t\t\t|               3. TB Test Status                    |");
        System.out.println("\t\t\t\t\t\t|               4. Return To Homepage                |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        switch(choice)
        {
                case 1:
                {
                        
                          covidregistration();
                }

                case 2:
                {

                            medicalTest();


                }

                case 3:
                {

                              tbTestsStatus();
                            
                }
           }
    }

           static void covidregistration()
          {
                    
                 String username,userid,covidresult;
                 System.out.println("ENTER YOUR USER NAME: ");
                 Scanner scan = new Scanner(System.in);
                 username = scan.nextLine();

                 System.out.println("ENTER YOUR USER ID: ");
                 userid = scan.nextLine();

                 System.out.println("ENTER YOUR COVID RESULT: ");
                 covidresult = scan.nextLine();
                 
                 //database


            }

            static void medicalTest(){


                String username,userid,medicalresult;
                System.out.println("ENTER YOUR USER NAME: ");
                Scanner scan = new Scanner(System.in);
                username = scan.nextLine();

                System.out.println("ENTER YOUR USER ID: ");
                userid = scan.nextLine();

                System.out.println("Do YOU HAVE ANY PREVISIOUS DIESEAS: ");
                medicalresult = scan.nextLine();

                //database

                       


            }

            static void tbTestsStatus()
            {
                
                String username,userid,tbresult;  
                System.out.println("ENTER YOUR USER NAME: ");
                Scanner scan = new Scanner(System.in);
                username = scan.nextLine();

                System.out.println("ENTER YOUR USER ID: ");
                userid = scan.nextLine();

                System.out.println("Do YOU HAVE ANY PREVISIOUS TB RECORD: ");
                tbresult = scan.nextLine();

                // database
                
             }

             //Verification
              
             void verification()
            {

                System.out.println("\t\t\t\t\t\t======================================================");
                System.out.println("\t\t\t\t\t\t|                        User                        |");
                System.out.println("\t\t\t\t\t\t|         Please Select from the option Below        |");
                System.out.println("\t\t\t\t\t\t******************************************************");
                System.out.println("\t\t\t\t\t\t|               1. Visa Verification                 |");
                System.out.println("\t\t\t\t\t\t|               2. Paspport Verification             |");
                System.out.println("\t\t\t\t\t\t|               3. Covid Certificate Verification    |");
                System.out.println("\t\t\t\t\t\t|               4. Return To Homepage                |");
                System.out.println("\t\t\t\t\t\t******************************************************");
                Scanner scan = new Scanner(System.in);
                int choice = scan.nextInt();

                switch(choice)
                {

                         case 1:
                         {
                                visaVerification();

                         }
                         case 2:
                         {

                                 passportVerification();

                         }
                         case 3:
                         {
                                covidcertificate();    


                         }
                } 

            } 
                
                     static void visaVerification()
                     { 
                        int visanumber;
                        System.out.println("Enter your Visa Number: ");
                        Scanner scan = new Scanner(System.in);
                        visanumber = scan.nextInt();
                        //database


                     }


                    
                     static void passportVerification()
                     { 
                        int visanumber;
                        System.out.println("Enter your Passport Number: ");
                        Scanner scan = new Scanner(System.in);
                        visanumber = scan.nextInt();
                        //database


                     }

                     static void covidcertificate()
                     {
                        String covidcertificate;
                        System.out.println("Do you have Covid Certificate: ");
                        Scanner scan = new Scanner(System.in);
                        covidcertificate = scan.nextLine();
                     }


             void travelguide()
             {
                     
                    String Location;
                    System.out.println("Do Your wanna know more about your upcoming Travel Destination?Please Select The Location.....");
                    Scanner scan =new Scanner(System.in);
                    //Database

              }
                
}
