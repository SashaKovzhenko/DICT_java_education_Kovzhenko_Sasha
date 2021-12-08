package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        String field;
        System.out.print("Enter cells: ");
        field = in.next();
        System.out.println("-----");
        for (int i = 0; i < 3; i ++){
            System.out.print("|");
            for (int i1 = 0; i1 < 3; i1 ++){
                System.out.print(field.charAt(num));
                num ++;
            }
            System.out.println("|");
        }
        System.out.println("-----");
    }
}
