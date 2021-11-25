package CoffeeMachine;
import java.util.Scanner;
import static java.lang.Math.*;

public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner in  = new Scanner(System.in);
        int cup, waterHas, milkHas, coffee_beansHas, aHasWater, aHasMilk, aHasCoffee_beans, minCup;
        int water = 200, milk = 50, coffee_beans = 15;
        System.out.println("Write how many ml of water the coffee machine has: ");
        waterHas = in.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milkHas = in.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        coffee_beansHas = in.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        cup = in.nextInt();

        aHasWater = waterHas/water;
        aHasMilk = milkHas/milk;
        aHasCoffee_beans = coffee_beansHas/coffee_beans;

        minCup = min(min(aHasWater, aHasMilk), aHasCoffee_beans);

        if (minCup > cup){
            cup = minCup - cup;
            System.out.print("Yes, I can make that amount of coffee (and even " +cup+ " more than that)");
        }
        else if (minCup == cup){
            System.out.print("Yes, I can make that amount of coffee");
        }
        else{
            System.out.print("No, I can only "+minCup+" cups of coffee");
        }
    }
}
