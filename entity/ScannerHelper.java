package pl.coderslab.entity;

import java.util.Scanner;

public class ScannerHelper {
    public static int getInt(){
        Scanner consoleScanner = new Scanner(System.in);
        int intValue = -1;
        while(intValue < 0){
            String input = consoleScanner.next();
            try{
                intValue = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("You must enter an integer greater than 0");
            }
        }
        return intValue;
    }


    public static String getString(){
        Scanner consoleScanner = new Scanner(System.in);
        return consoleScanner.nextLine();
    }
}