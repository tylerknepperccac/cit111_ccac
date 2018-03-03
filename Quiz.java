package quiz;

import  java.util.Scanner;

/**
 *
 * @author tyler
 */
public class Quiz {

    public static void main(String[] args) {
        //initialize variables
        int count = 0;
        int userinput=0;
        int answer = (6*10-3*(5+5));
        
        //establish scanner for input
        Scanner input = new Scanner(System.in);
        
        //Print title
        System.out.println("*****Math Checker*****");
        
        //establish while loop to run 3 times or if the user inputs correct answer
        while(count<3){
            //Ask question
            System.out.println("Compute the value of 6*10-3(5+5):");
            
            //Store user input in userinput
            userinput = input.nextInt();
            
            //See if users answer is correct
            if(userinput==answer){
                System.out.println("Correct! Nice work");
                break;
            }
            
            //If user is incorrect determine how they are incorrect
            else{
                System.out.println("Sorry, Incorrect");
                
                //Check if answer is too high
                if(userinput>answer){
                System.out.println("(Your answer is too high)");
                }
                
                //Check if answer is too low
                if(userinput<answer){
                System.out.println("(Your answer is too low)");
                }
                
                //Line for formatting
                System.out.println("********");
                
                //increase count so while loop only runs 3 times
                count++;
                
                //If user has tried 3 times give them the answer then while loop terminates
                if(count==3){
                    System.out.println("The answer is "+answer);
                }
            }   
        }
        System.out.println("Solution: 6*10-3(5+5)= 60-3*10= 60-30= 30");
    }   
}
