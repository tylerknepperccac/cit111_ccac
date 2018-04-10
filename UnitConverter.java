
package unitconverter;

import java.util.Scanner;

public class UnitConverter {

    
    public static void main(String[] args) {
        //declare int to store the users choice of conversion
        int choice =10;
        //create scanner to store inputed user information
        Scanner input = new Scanner(System.in);
        //while loop that terminates when the user enters 0
        while(choice!=0){
            System.out.println("********Unit Converter*********");
            System.out.println("What woud you like to convert?");
            System.out.println("1) Miles to Kilometers.");
            System.out.println("2) Kilometers to Miles.");
            System.out.println("3) Feet to meters.");
            System.out.println("Please enter 1-3 for your choice or 0 to exit: ");
            //store user inputed choice in choice integer
            choice = input.nextInt();
            //based on the number the user chooses it will run the method that corresponds
            if(choice==1){
                ConvertMilestoKM();
            }
            if(choice==2){
                ConvertKMtoMiles();
            }
            if(choice==3){
                ConvertFeettoMeters();
            }
            /*if user inputs an invalid number for his choice it will 
            return it is invalid then re run the program*/
            if(choice>3||choice<0){
                System.out.println("Invalid input!");
            }
        }
    }
    //method for converting miles to kilometers
    public static void ConvertMilestoKM(){
       //create scanner to store inputed user information
       Scanner input = new Scanner(System.in);
       //declare double to store user inputed length
       double length;
       System.out.println("Please enter how many miles:");
       //store user input in length
       length = input.nextDouble();
       //use formula for converting between miles and km
       length = length*1.62137119223733;
       System.out.println("That is equal to "+length+" Kilometers.");
    }
    
    public static void ConvertKMtoMiles(){
        //create scanner to store inputed user information
        Scanner input = new Scanner(System.in);
        //declare double to store user inputed length
        double length;
        System.out.println("Please enter how many Kilometers:");
        //store user input in length
        length = input.nextDouble();
        //use formula for converting between km and miles
        length = length*.62137119223733;
        System.out.println("That is equal to "+length+" Miles.");
    }
    
    public static void ConvertFeettoMeters(){
        //create scanner to store inputed user information
        Scanner input = new Scanner(System.in);
        //declare double to store user inputed length
        double length;
        System.out.println("Please enter how many Feet:");
        //store user input in length
        length = input.nextDouble();
        //use formula for converting between feet and meters
        length = length*.3048;
        System.out.println("That is equal to "+length+" Meters.");
    }
}
