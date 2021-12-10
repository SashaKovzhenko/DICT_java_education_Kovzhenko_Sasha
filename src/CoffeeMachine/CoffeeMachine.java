package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int coffeeCup;
        int[] has = {400, 540, 120, 9, 550};
        boolean cycle = true, ent = true;
        int[] chislo;
        String action;
        do {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            do {
                action = in.next();
                if (action.equals("buy")||action.equals("take")||action.equals("remaining")||action.equals("fill")||action.equals("exit")){
                    ent = false;
                }
            }while(ent == true);
            if (action.equals("buy")) {
                coffeeCup = Coffee.buy();
                if (coffeeCup == 1){
                    has = Coffee.espresso(has);
                }
                else if (coffeeCup == 2){
                    has = Coffee.latte(has);
                }
                else if (coffeeCup == 3){
                    has = Coffee.cappuccino(has);
                }
            } else if (action.equals("fill")) {
                has = Coffee.fill(has);

            } else if (action.equals("take")) {
                has[4] = Coffee.take(has);
            } else if (action.equals("remaining")){
                Coffee.remaining(has);
            } else if (action.equals("exit")){
                Coffee.exit();
            }
        } while (cycle == true);
    }
}
class Coffee {
    public static int buy () {
        Scanner in = new Scanner(System.in);
        int coffeeCup;
        System.out.print("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino, 0 - back to main menu) ");
        coffeeCup = in.nextInt();
        return coffeeCup;

    }
    public static int[] fill (int[] has){
        Scanner in = new Scanner(System.in);
        int waterAdd, milkAdd, coffee_beansAdd, disp_cupsAdd;
        System.out.print("Write how many ml of water you want to add: ");
        waterAdd = in.nextInt();
        waterAdd +=has[0];
        System.out.print("Write how many ml of milk you want to add: ");
        milkAdd = in.nextInt();
        milkAdd+=has[1];
        System.out.print("Write how many grams of coffee beans you want to add: ");
        coffee_beansAdd = in.nextInt();
        coffee_beansAdd+=has[2];
        System.out.print("Write how many disposable coffee cups you want to add: ");
        disp_cupsAdd = in.nextInt();
        disp_cupsAdd +=has[3];
        int[] a = {waterAdd, milkAdd, coffee_beansAdd, disp_cupsAdd};
        return a;

    }
    public static int remaining(int[] has){
        System.out.println(("The coffee machine has: "));
        System.out.println((has[0]+" of water"));
        System.out.println((has[1]+" of milk"));
        System.out.println((has[2]+" of coffee beans"));
        System.out.println((has[3]+" of disposable cups"));
        System.out.println((has[4]+" of money"));
        return 0;
    }
    public static int take (int[] has){
        System.out.println("I gave you "+has[4]+" of money");
        int take;
        take = 0;
        return take;
    }
    public static int exit (){
        System.exit(0);
        return 0;
    }
    public static int[] espresso (int[] has){
        int waterEspresso = 250, milkEspresso = 0,coffee_beansEspresso = 16, moneyEspresso = 4;
        has[0] -= waterEspresso;
        has[1] -= coffee_beansEspresso;
        has[2] -= milkEspresso;
        has[3] += moneyEspresso;
        has[4]--;
        if (has[0] < 0 || has[1] < 0 || has[2] < 0 || has[3] < 0 || has[4] < 0){
            System.out.println("I have enough resources, making you a coffee!");
            has[0] += waterEspresso;
            has[1] += coffee_beansEspresso;
            has[2] += milkEspresso;
            has[3] -= moneyEspresso;
            has[4]++;
        }
        return has;
    }
    public static int[] latte (int[] has){
        int waterLatte = 350, milkLatte = 75, coffee_beansLatte = 20, moneyLatte = 7;
        has[0] -= waterLatte;
        has[1] -= coffee_beansLatte;
        has[2] -= milkLatte;
        has[3] += moneyLatte;
        has[4]--;
        if (has[0] < 0 || has[1] < 0 || has[2] < 0 || has[3] < 0 || has[4] < 0){
            System.out.println("I have enough resources, making you a coffee!");
            has[0] += waterLatte;
            has[1] += coffee_beansLatte;
            has[2] += milkLatte;
            has[3] -= moneyLatte;
            has[4]++;
        }
        return has;
    }
    public static int[] cappuccino (int[] has){
        int waterCappuccino = 200, milkCappuccino = 100, coffee_beansCappuccino = 12, moneyCappuccino = 6;
        has[0] -= waterCappuccino;
        has[1] -= coffee_beansCappuccino;
        has[2] -= milkCappuccino;
        has[3] += moneyCappuccino;
        has[4]--;
        if (has[0] < 0 || has[1] < 0 || has[2] < 0 || has[3] < 0 || has[4] < 0){
            System.out.println("Не хватает ресурсов");
            has[0] += waterCappuccino;
            has[1] += coffee_beansCappuccino;
            has[2] += milkCappuccino;
            has[3] -= moneyCappuccino;
            has[4]++;
        }
        return has;
    }
}