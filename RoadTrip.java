/*
Goal of project is to determine if driver of vehicle has enough fuel to make it
to the next gas station given the amount of gallons of gas and the distance in 
miles to the next gas station. Then provide output if they will be marooned or 
if they will make it to the next gas station
*/
package roadtrip;

import java.util.Scanner;

public class RoadTrip {
    public static void main(String[] args) {
        double mpg;
        //created double to store user inputed values for miles per gallon
        double gas;
        //created double to store the user inputed value for gallons of gas
        double distance;
        //created double to store user inputed value for distance to next gas station
        
        System.out.println("********Will I Make it?********");
        //Title to format output
        
        Scanner userInputScanner = new Scanner(System.in);
        //scanner object to gather keyboard input
        
        System.out.println("How many gallons of gas remain in your tank?");
        // prompt user for input on gallons of gas in tank
        
        gas = userInputScanner.nextDouble();
        //store users input for gallons of gas in gas variable
        
        System.out.println("How many miles to next service station?");
        // prompt user for input on miles to next service station
        
        distance = userInputScanner.nextDouble();
        //store users input for distance to next service station in distance variable
        
        System.out.println("How many miles per gallon does your car get?");
        //prompt user for input on gallons of gas in tank
        
        mpg = userInputScanner.nextDouble();
        //store users input for miles per gallon in mpg variable
        
        //compare data to see if values entered are negative
        if((gas<0)||(distance<0)||(mpg<0)){
            System.out.println("VALUES ENTERED CANNOT BE NEGATIVE! PLEASE RE-RUN THE PROGRAM!");
        }
        
        //compare data to see if user will make it to next service station
        if(distance >(gas*mpg)){
            //code to output if statement is true
            System.out.println("Red Alert! You'll soon be marooned. Sucker!");
            System.out.println("You will run out of gas "+(distance-(gas*mpg))+" miles from the next service station.");
            System.out.println("In order to reach the next service staion you would need to get "+(distance/gas)+" miles per gallon.");
        }
        else{
            //code to output if statement is false
            System.out.println("Whew! You'll make it to the next station.");
            System.out.println("You will have "+((gas*mpg)-distance)+" miles of gas when you reach the service station.");
        }
    }
    
}
