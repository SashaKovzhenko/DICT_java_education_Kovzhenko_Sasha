package Hangman;
import java.util.Scanner;
import static java.lang.Math.*;

public class hangman {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int min = 1, max = 5;
        System.out.println("HANGMAN\nThe game will be available soon.");
        String word = "", b, word2;
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
        for (int i = 0; i <word.length(); i++){
            if (i < 2){
                System.out.print(word.charAt(i));
            }
            else{
                System.out.print("-");
            }
        }
        System.out.println();


        System.out.print("Enter your word:  ");
        word2 = in.next();
        if (word.equals(word2)){
            System.out.println("You survived!");
        }
        else {
            System.out.println("You Lost!");
        }

    }

}
