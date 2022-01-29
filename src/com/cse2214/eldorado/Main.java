package com.cse2214.eldorado;
//Contribution-Badrul-2012020216

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        new UserInterface().welcome();
        new UserInterface().loading();
        new Application().frontPage();

        //admin id pass-Badrul
    }



    
}





