
package dailynutrition;

//import libraries
import java.util.Scanner;
import java.lang.Math;

public class DailyNutrition {

    public static void main(String[] args) {
        //declare new object person
        Person newUser;
        newUser = new Person();
        //declare ints to be used for input
        int input;
        double input1;
        //declare new scanner to take user input
        Scanner userinput = new Scanner(System.in);
        //ask user for input and store it
        System.out.println("Welcome to your daily caloric and macronutrient calculator.");
        System.out.println("Please enter your age in years: ");
        newUser.setAge(userinput.nextInt());
        System.out.println("Please enter your Height in inches: ");
        newUser.setHeight(userinput.nextInt());
        System.out.println("Please enter your weight in pounds: ");
        newUser.setWeight(userinput.nextInt());
        System.out.println("Please enter your Body Fat Percentage: ");
        newUser.setBFPercentage(userinput.nextDouble());
        System.out.println("Please select your sex: 1)male 2)female ");
        input = userinput.nextInt();
        //if statement to convert user input into a boolean
        if(input==1){
            newUser.setSex(true);
        }
        else{
            newUser.setSex(false);
        }
        System.out.println("Please select your Activity Level: 1)Sedentary 2)Moderately active 3)Extra Active ");
        input1 = userinput.nextDouble();
        //if statement to convert user selected choice into appropriate number for calculations
        if(input1==1){
            newUser.setactivitylevel(1.1);
        }
        if(input1==2){
            newUser.setactivitylevel(1.375);
        }
        if(input1==3){
            newUser.setactivitylevel(1.55);
        }
        //calculate all the users information
        newUser.calculateLBM();
        newUser.calculateBMR();
        newUser.calculateCaloricNeeds();
        newUser.calculateFatNeeds();
        newUser.calculateProteinNeeds();
        newUser.calculateCarbNeeds();
        //run print method to display results
        printResults(newUser);
    }
    //method to format printed results. I used the Math library to round off unnecessary decimals
    public static void printResults(Person x){
        System.out.println(".....................RESULTS.....................");
        System.out.println("With a height of "+x.getHeight()+" inches, a weight of "+x.getWeight()+" Pounds and an age of "+x.getAge()+" Years");
        System.out.println("Your daily Basal Metabolic Rate is: \n"+Math.round(x.getBMR())+" calories");
        System.out.println("Adjusted to your activity level your daily caloric needs are:\n "+Math.round(x.getCaloricNeeds())+" calories");
        System.out.println(Math.round(x.getFatNeeds())+" Calories should come from fats.");
        System.out.println(Math.round(x.getProteinNeeds())+" Calories should come from protein.");
        System.out.println(Math.round(x.getCarbNeeds())+" Calories should come from carbs.");
        System.out.println("With a weight of "+x.getWeight()+" Pounds and a body fat percentage of "+x.getBFPerc()+"%");
        System.out.println("Your Lean Body Weight is: \n"+x.getLBM()+" Pounds");
    }
}
