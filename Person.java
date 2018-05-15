
package dailynutrition;

public class Person {
    //declare all variables for person object
    private int weight;
    private int height;
    private double bodyFatPercentage;
    private double leanBodyMass;
    private double basalMetabolicRate;
    private double caloricNeeds;
    private double fatNeeds;
    private double proteinNeeds;
    private double carbNeeds;
    private double activityLevel;
    private int age;
    private boolean sex;
    
    //method to set weight
    public void setWeight(int x){
        weight = x;
    }
    //method to set height
     public void setHeight(int x){
        height = x;
    }
    //method to set body fat percentage
    public void setBFPercentage(double x){
        bodyFatPercentage = x;
    }
    //method to set activty level
    public void setactivitylevel(double x){
        activityLevel = x;
    }
    //method to set age
    public void setAge(int x){
        age = x;
    }
    //method to set sex
    public void setSex(boolean x){
        sex = x;
    }
    //method to calculate lean body mass
    public void calculateLBM(){
        leanBodyMass = weight * ((100-bodyFatPercentage)/100);
    }
    //method to calculate basal metabolic rate true= male false=female
    public void calculateBMR(){
       if(sex==true){
          basalMetabolicRate = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
       }
       else{
          basalMetabolicRate = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
       }
    }
    //method to calculate caloric needs
    public void calculateCaloricNeeds(){
        caloricNeeds = basalMetabolicRate*activityLevel;
    }
    //method to calculate fat needs base on recomended 25%
    public void calculateFatNeeds(){
        fatNeeds = caloricNeeds*.25;
    }
    //method to calculate protein needs based on 45%
    public void calculateProteinNeeds(){
        proteinNeeds = caloricNeeds*.45;
    }
    //method to calculate carb needs based on 30%
    public void calculateCarbNeeds(){
        carbNeeds = caloricNeeds*.3;
    }
    //method to get weight
    public double getWeight(){
        return weight;
    }
    //method to get height
    public double getHeight(){
        return height;
    }
    //method to get body fat percentage
    public double getBFPerc(){
        return bodyFatPercentage;
    }
    //method to get lean body mass
    public double getLBM(){
        return leanBodyMass;
    }
    //method to get basal metabolic rate
    public double getBMR(){        
        return basalMetabolicRate;
    }
    //method to get fat needs
    public double getFatNeeds(){        
        return fatNeeds;
    }
    //method to get protein needs
    public double getProteinNeeds(){        
        return proteinNeeds;
    }
    //method to get carb needs
    public double getCarbNeeds(){        
        return carbNeeds;
    }
    //method to get activity level
    public double getActivityLevel(){
        return activityLevel;
    }
    //method to get caloric needs
    public double getCaloricNeeds(){
        return caloricNeeds;
    }
    //method to get age
    public int getAge(){
        return age;
    }
    //method to get sex
    public boolean getSex(){
        return sex;
    }
}
