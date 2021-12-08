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
            }System.out.println("|");
        }System.out.println("-----");
        if (((field.charAt(0) == 'X' && field.charAt(1) == 'X' && field.charAt(2) == 'X') ||
                (field.charAt(3) == 'X' && field.charAt(4) == 'X' && field.charAt(5) == 'X') ||
                (field.charAt(6) == 'X' && field.charAt(7) == 'X' && field.charAt(8) == 'X') ||
                (field.charAt(0) == 'X' && field.charAt(3) == 'X' && field.charAt(6) == 'X') ||
                (field.charAt(1) == 'X' && field.charAt(4) == 'X' && field.charAt(7) == 'X') ||
                (field.charAt(2) == 'X' && field.charAt(5) == 'X' && field.charAt(8) == 'X') ||
                (field.charAt(0) == 'X' && field.charAt(4) == 'X' && field.charAt(8) == 'X') ||
                (field.charAt(2) == 'X' && field.charAt(4) == 'X' && field.charAt(6) == 'X'))
        && ((field.charAt(0) == 'O' && field.charAt(1) == 'O' && field.charAt(2) == 'O') ||
                (field.charAt(3) == 'O' && field.charAt(4) == 'O' && field.charAt(5) == 'O') ||
                (field.charAt(6) == 'O' && field.charAt(7) == 'O' && field.charAt(8) == 'O') ||
                (field.charAt(0) == 'O' && field.charAt(3) == 'O' && field.charAt(6) == 'O') ||
                (field.charAt(1) == 'O' && field.charAt(4) == 'O' && field.charAt(7) == 'O') ||
                (field.charAt(2) == 'O' && field.charAt(5) == 'O' && field.charAt(8) == 'O') ||
                (field.charAt(0) == 'O' && field.charAt(4) == 'O' && field.charAt(8) == 'O') ||
                (field.charAt(2) == 'O' && field.charAt(4) == 'O' && field.charAt(6) == 'O'))){
            System.out.println("Impossible");
        }else if ((field.charAt(0) == 'X' && field.charAt(1) == 'X' && field.charAt(2) == 'X') ||
                (field.charAt(3) == 'X' && field.charAt(4) == 'X' && field.charAt(5) == 'X') ||
                (field.charAt(6) == 'X' && field.charAt(7) == 'X' && field.charAt(8) == 'X') ||
                (field.charAt(0) == 'X' && field.charAt(3) == 'X' && field.charAt(6) == 'X') ||
                (field.charAt(1) == 'X' && field.charAt(4) == 'X' && field.charAt(7) == 'X') ||
                (field.charAt(2) == 'X' && field.charAt(5) == 'X' && field.charAt(8) == 'X') ||
                (field.charAt(0) == 'X' && field.charAt(4) == 'X' && field.charAt(8) == 'X') ||
                (field.charAt(2) == 'X' && field.charAt(4) == 'X' && field.charAt(6) == 'X')){
            System.out.println("X win");
        }else if ((field.charAt(0) == 'O' && field.charAt(1) == 'O' && field.charAt(2) == 'O') ||
                (field.charAt(3) == 'O' && field.charAt(4) == 'O' && field.charAt(5) == 'O') ||
                (field.charAt(6) == 'O' && field.charAt(7) == 'O' && field.charAt(8) == 'O') ||
                (field.charAt(0) == 'O' && field.charAt(3) == 'O' && field.charAt(6) == 'O') ||
                (field.charAt(1) == 'O' && field.charAt(4) == 'O' && field.charAt(7) == 'O') ||
                (field.charAt(2) == 'O' && field.charAt(5) == 'O' && field.charAt(8) == 'O') ||
                (field.charAt(0) == 'O' && field.charAt(4) == 'O' && field.charAt(8) == 'O') ||
                (field.charAt(2) == 'O' && field.charAt(4) == 'O' && field.charAt(6) == 'O')) {
            System.out.println("O win");
        }else if (field.charAt(0) == '_' || field.charAt(1) == '_' || field.charAt(2) == '_' ||
                field.charAt(3) == '_' || field.charAt(4) == '_' || field.charAt(5) == '_' ||
                field.charAt(6) == '_' || field.charAt(7) == '_' || field.charAt(8) == '_'){
            System.out.println("Game not finished");
        }else{
            System.out.println("Draw");
        }
    }
}
