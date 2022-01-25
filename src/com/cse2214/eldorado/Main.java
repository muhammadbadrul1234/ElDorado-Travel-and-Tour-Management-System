package com.cse2214.eldorado;

import java.io.File;  //Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        LogoAndUI logo = new LogoAndUI();
        logo.Logo();
        LogoAndUI welcome = new LogoAndUI();
        welcome.Welcome();
        LogoAndUI shut = new LogoAndUI();
        shut.ShutDown();
    }
}



