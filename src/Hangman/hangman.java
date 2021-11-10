package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        System.out.println("HANGMAN\nThe game will be available soon.");
        String a = "python", b;
        Scanner in = new Scanner(System.in);
        b = in.nextLine();
        if (a.equals(b)){
            System.out.println("You survived!");
        }
        else {
            System.out.println("You Lost!");
        }

    }

}
