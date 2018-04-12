package ordertabulator;

import  java.util.Scanner;

public class OrderTabulator {
    //Declare global variables for tracking totals
    private static int NumPizzasOrdered;
    private static int NumBurgersOrdered;

    public static void main(String[] args) {
        //Declare variable for user selected choice
        int choice=10;
        //Declare variable for user inputed number of items ordered
        int num=0;
        
        //Declare scanner to store user input
        Scanner input = new Scanner(System.in);
        
        //Declare while loop to run until the user selects to end program
        while(choice!=0){            
            System.out.println("########### MENU ###########");
            System.out.println("Please choose which item you are ordering:");
            System.out.println("1) Pizza");
            System.out.println("2) Burger");
            System.out.println("Or press 0 to exit.");
            
            //store user input for which option they chose
            choice = input.nextInt();
            
            //If user selected to order an item they will be asked how many of that item
            if(choice==1||choice==2){
                System.out.println("Enter how many you would like to order:");                
                //Store user inputed number of item ordered
                num = input.nextInt();
            }
            
            //if statements that run appropriate methods based on the user selected choice
            if(choice==1){
                pizzaOrdered(num);
            }
            
            if(choice==2){
                burgerOrdered(num);
            }
            
            if(choice>2||choice<0){
                //error message if user inputs a number besides 0, 1, or 2 for choice
                System.out.println("ERROR! Must enter a valid number!");
            }
            
            //method that displays running total at the end of every transaction
            displayTotals();
        }
    }
    
    //adds to the total number of pizzas ordered
    public static void pizzaOrdered(int num){
        System.out.println("Cooking "+num+" Pizzas!");
        NumPizzasOrdered=num+NumPizzasOrdered;
    }
    
    //adds to the total number of burgers ordered
    public static void burgerOrdered(int num){
        System.out.println("Cooking "+num+" Burgers!");       
        NumBurgersOrdered=num+NumBurgersOrdered;
    }
    
    //displays order totals
    public static void displayTotals(){
        System.out.println("########TOTAL ORDERS########");
        System.out.println(NumPizzasOrdered+" Pizzas and "+NumBurgersOrdered+" Burgers Ordered");
        System.out.println("############################");
        System.out.println("");
    }
}
