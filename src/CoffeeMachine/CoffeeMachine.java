package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner in  = new Scanner(System.in);
        int cup;
        int water = 200, milk = 50, coffee_beans = 15;
        System.out.println("Write how many cups of coffee you will need: ");
        cup = in.nextInt();
        System.out.println("For "+cup+" cups of coffee you will need: ");
        System.out.println(+cup*water+" ml of water");
        System.out.println(+cup*milk+" ml of milk");
        System.out.println(+cup*coffee_beans+" ml of water");
    }
}
