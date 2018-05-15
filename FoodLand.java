
package foodland;

public class FoodLand {

    public static void main(String[] args) {
        Pizza newPizza;
        newPizza = new Pizza();
        Burger newBurger;
        newBurger = new Burger();
        Wings newWings;
        newWings = new Wings();
        newPizza.toppings("Pepperoni");
        newPizza.crispy();
        newPizza.eatSlice(3);
        
        newBurger.lettuce();
        newBurger.cheese();
        newBurger.tomato();
        
        newWings.typeSauce("Garlic Parm");
        newWings.crispy();
        newWings.eatingWings(4);
        
        printPizza(newPizza);
        printBurger(newBurger);
        printWings(newWings);
    }
    public static void printPizza(Pizza x){
        System.out.println("You have a "+x.toppings+" pizza with "+x.slices+" slices remaining.");
        if(x.wellDone==true){
            System.out.println("Your pizza is well done.");
        }
        else{
            System.out.println("Your pizza is not well done.");
        }
        System.out.println("......................");
    }
    public static void printBurger(Burger x){
        System.out.println("You have a burger with: ");
        if(x.lettuce==true){
            System.out.println("Lettuce");
        }
        if(x.tomato==true){
            System.out.println("Tomato");
        }
        if(x.cheese==true){
            System.out.println("Cheese");
        }
        System.out.println("......................");
    }
    public static void printWings(Wings x){
        System.out.println("You have "+x.wingsRemaining+" "+x.sauce+" wings remaining.");
        if(x.wellDone==true){
            System.out.println("Your wings are well done.");
        }
        else{
            System.out.println("Your wings are not well done.");
        }
        System.out.println("......................");
    }
}
