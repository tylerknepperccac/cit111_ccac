/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysterydoor;

import java.util.Scanner;

public class MysteryDoor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Decare variable for user selected door
        int doornumber;
        //Declare variable for input into methods
        int methodinput;
        
        //declare scanner for user input
        Scanner userinput = new Scanner(System.in);
        
        //formatting
        System.out.println("###########");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("#    1    #");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("###########");
        System.out.println("###########");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("#    2    #");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("###########");
        System.out.println("###########");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("#    3    #");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println("###########");
        System.out.println("Please enter the door you would like to choose then press enter!");
        
        //Store user input for door selection
        doornumber = userinput.nextInt();
        
        System.out.println("Please enter an integer between 1-10:");
        
        //Store user input for input into method
        methodinput = userinput.nextInt();
        
        //Switch to run method based on user selected door
        switch(doornumber){
            case 1:
                squareofNumber(methodinput);
                break;
            case 2:
                factorialofNumber(methodinput);
                break;
            case 3:
                cubeofNumber(methodinput);
                break;
            default:
                //Error message if user inputs invalid door number
                System.out.println("Must choose a door between 1-3");
        }
        
    }
    
    //Methods purpose is to tell user what the square of the number they chose is
    public static void squareofNumber(int number){
        System.out.println("The square of "+number+" is "+(number*number));
    }
    
    //Methods purpose is to tell user what the factorial of their number is
    public static void factorialofNumber(int number){
        int total=1;
        for(int x = number; x>1; x--){
            total = x*total;
        }
        System.out.println(number+"! is "+total);
    }
    
    //Methods purpose is to tell the user what the cube of their number is
    public static void cubeofNumber(int number){
        System.out.println("The cube of "+number+" is "+(number*number*number));
    }
    
}
