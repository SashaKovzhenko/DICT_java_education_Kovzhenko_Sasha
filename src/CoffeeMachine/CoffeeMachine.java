package CoffeeMachine;
import java.util.Scanner;
import static java.lang.Math.*;

public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner in  = new Scanner(System.in);
        int coffeeCup, waterHas = 400, milkHas = 540, coffee_beansHas = 120, disp_cupsHas = 550, moneyHas = 550, aHasWater, waterAdd, milkAdd, coffee_beansAdd, disp_cupsAdd;
        int water_Latte = 350, milk_Latte = 75, coffee_beans_Latte = 20, money_Latte = 7;
        int water_Cappuccino = 200, milk_Cappuccino = 100, coffee_beans_Cappuccino = 12, money_Cappuccino = 6;
        int water_Espresso = 350, coffee_beans_Espresso = 20, money_Espresso = 7;
        boolean cycle = true, ent = true;
        String action;
        do {
            System.out.print("Write action (buy, fill, take, remaining,exit): ");
            do {
                action =  coffee_machine.doing();
                if (action.equals("buy")||action.equals("take")||action.equals("remaining")||action.equals("fill")||action.equals("exit")){
                    ent = false;
                }
            }while(ent == true);
            if (action.equals("buy")) {
                System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino, 0 - back to main menu) ");
                coffeeCup = in.nextInt();
                if (coffeeCup == 1) {
                    waterHas = waterHas - water_Espresso;
                    coffee_beansHas = coffee_beansHas - coffee_beans_Espresso;
                    moneyHas = moneyHas + money_Espresso;
                    disp_cupsHas--;
                    if (waterHas < 0 || coffee_beansHas < 0 || moneyHas < 0 || disp_cupsHas < 0){
                        System.out.println("I have enough resources, making you a coffee!");
                        waterHas = waterHas+water_Espresso;
                        coffee_beansHas = coffee_beansHas+coffee_beans_Espresso;
                        moneyHas = moneyHas-money_Espresso;
                        disp_cupsHas++;
                    }
                } else if (coffeeCup == 2) {
                    waterHas = waterHas - water_Latte;
                    milkHas = milkHas - milk_Latte;
                    coffee_beansHas = coffee_beansHas - coffee_beans_Latte;
                    moneyHas = moneyHas + money_Latte;
                    disp_cupsHas--;
                    if (waterHas < 0 || coffee_beansHas < 0 || moneyHas < 0 || disp_cupsHas < 0){
                        System.out.println("I have enough resources, making you a coffee!");
                        waterHas = waterHas+water_Latte;
                        coffee_beansHas = coffee_beansHas+coffee_beans_Latte;
                        moneyHas = moneyHas-money_Latte;
                        disp_cupsHas++;
                    }
                } else if (coffeeCup == 3) {
                    waterHas = waterHas - water_Cappuccino;
                    milkHas = milkHas - milk_Cappuccino;
                    coffee_beansHas = coffee_beansHas - coffee_beans_Cappuccino;
                    moneyHas = moneyHas + money_Cappuccino;
                    disp_cupsHas--;
                    if (waterHas < 0 || coffee_beansHas < 0 || moneyHas < 0 || disp_cupsHas < 0){
                        System.out.println("I have enough resources, making you a coffee!");
                        waterHas = waterHas+water_Cappuccino;
                        coffee_beansHas = coffee_beansHas+coffee_beans_Cappuccino;
                        moneyHas = moneyHas-money_Cappuccino;
                        disp_cupsHas++;
                    }
                }else if (coffeeCup == 0){
                    ent = false;
                }
            }else if (action.equals("fill")) {
            System.out.println("Write how many ml of water you want to add: ");
            waterAdd = in.nextInt();
            waterHas = waterHas + waterAdd;
            System.out.println("Write how many ml of milk you want to add: ");
            milkAdd = in.nextInt();
            milkHas = milkHas + milkAdd;
            System.out.println("Write how many grams of coffee beans you want to add: ");
            coffee_beansAdd = in.nextInt();
            coffee_beansHas = coffee_beansHas + coffee_beansAdd;
            System.out.println("Write how many disposable coffee cups you want to add: ");
            disp_cupsAdd = in.nextInt();
            disp_cupsHas = disp_cupsHas + disp_cupsAdd;
        }else if (action.equals("take")){
                System.out.println("I gave you "+moneyHas);
                moneyHas = 0;

        }else if (action.equals("remaining")){
                System.out.println(("The coffee machine has: "));
                System.out.println((waterHas+" of water"));
                System.out.println((milkHas+" of milk"));
                System.out.println((coffee_beansHas+" of coffee beans"));
                System.out.println((disp_cupsHas+" of disposable cups"));
                System.out.println((moneyHas+" of money"));
            }else if (action.equals("exit")){
                System.exit(0);
            }

        }while (cycle == true);
    }
}

class coffee_machine {
    public static String doing() {
        Scanner in = new Scanner(System.in);
        String doing = in.nextLine();
        return doing;

    }
}