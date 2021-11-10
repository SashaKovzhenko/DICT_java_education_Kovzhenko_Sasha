package Hangman;
import java.util.Scanner;
import static java.lang.Math.*;

public class hangman {
    public static void main(String[] args){
        int min = 1, max = 4;
        System.out.println("HANGMAN\nThe game will be available soon.");
        String a = "python", b, word;
        Scanner in = new Scanner(System.in);
        int rand_num = min +(int) (random() * (max - min + 1));
        switch (rand_num){
            case 1:
                word = "python";
                break;
            case 2:
                word = "java";
                break;
            case 3:
                word = "javascript";
                break;
            case 4:
                word = "kotlin";
                break;
        }
        b = in.nextLine();
        if (a.equals(b)){
            System.out.println("You survived!");
        }
        else {
            System.out.println("You Lost!");
        }

    }

}
