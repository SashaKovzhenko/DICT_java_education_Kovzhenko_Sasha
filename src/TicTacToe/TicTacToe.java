package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int correct = 0, correct2 = 0;
        boolean end = false;
        int[] coordinates = new int[2];
        String field;
        char[] field2 = new char[9];
        System.out.print("Enter cells: ");
        field = in.next();
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
                    field2[correct] = 'X';
                }
            }
        }while (true);
    }
}
