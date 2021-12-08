package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int turn = 0;
        int correct = 0, correct2 = 0;
        boolean end = false;
        int[] coordinates = new int[2];
        String field;
        char[] field2 = new char[9];
        field = "_________";
        for (int i5 = 0; i5 < 9; i5 ++){
            field2[i5] = field.charAt(i5);
        }do{
            num = 0;
            correct2 = 0;
            end = false;
            System.out.println("-----");
            for (int i = 0; i < 3; i ++){
                System.out.print("|");
                for (int i1 = 0; i1 < 3; i1 ++){
                    System.out.print(field2[num]);
                    num ++;
                }System.out.println("|");
            }System.out.println("-----");
            System.out.print("Enter coordinates: ");
            for (int i2 = 0; i2 < 2; i2 ++){
                coordinates[i2] = in.nextInt();
            }for (int i3 = 1; i3 < 4; i3 ++){
                for (int i4 = 1; i4 < 4; i4 ++){
                    if (coordinates[0] == i3 && coordinates[1] == i4){
                        correct = correct2;
                        end = true;
                    }correct2 ++;
                }
            }if (end == false){
                System.out.println("Coordinates should be from 1 to 3");
            }if (end == true){
                if (field2[correct] == 'X' || field2[correct] == 'O'){
                    System.out.println("This cell is occupied! Choose another one!");
                }else{
                    if (turn == 0){
                        field2[correct] = 'X';
                        turn ++;
                    }else if (turn == 1){
                        field2[correct] = 'O';
                        turn --;
                    }
                }
            }if ((field2[0] == 'X' && field2[1] == 'X' && field2[2] == 'X') ||
                    (field2[3] == 'X' && field2[4] == 'X' && field2[5] == 'X') ||
                    (field2[6] == 'X' && field2[7] == 'X' && field2[8] == 'X') ||
                    (field2[0] == 'X' && field2[3] == 'X' && field2[6] == 'X') ||
                    (field2[1] == 'X' && field2[4] == 'X' && field2[7] == 'X') ||
                    (field2[2] == 'X' && field2[5] == 'X' && field2[8] == 'X') ||
                    (field2[0] == 'X' && field2[4] == 'X' && field2[8] == 'X') ||
                    (field2[2] == 'X' && field2[4] == 'X' && field2[6] == 'X')){
                System.out.println("X win");
                System.exit(0);
            } else if ((field2[0] == 'O'&& field2[1] == 'O' && field2[2] == 'O')||
                    (field2[3] == 'O' && field2[4] == 'O' && field2[5] == 'O') ||
                    (field2[6] == 'O' && field2[7] == 'O' && field2[8] == 'O') ||
                    (field2[0] == 'O' && field2[3] == 'O' && field2[6] == 'O') ||
                    (field2[1] == 'O' && field2[4] == 'O' && field2[7] == 'O') ||
                    (field2[2] == 'O' && field2[5] == 'O' && field2[8] == 'O') ||
                    (field2[0] == 'O' && field2[4] == 'O' && field2[8] == 'O') ||
                    (field2[2] == 'O' && field2[4] == 'O' && field2[6] == 'O')){
                System.out.println("O win");
                System.exit(0);
            }else if (field2[0] == '_' || field2[1] == '_' || field2[2] == '_' ||
                    field2[3] == '_' || field2[4] == '_' || field2[5] == '_' ||
                    field2[6] == '_' || field2[7] == '_' || field2[8] == '_'){
                System.out.println("Game not finished");
            }else {
                System.out.println("Draw");
                System.exit(0);
            }
        }while (true);
    }
}
