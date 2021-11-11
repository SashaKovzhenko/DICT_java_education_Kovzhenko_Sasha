package Hangman;
import java.util.Scanner;
import static java.lang.Math.*;

public class hangman {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int min = 1, max = 4, test = 0;
        System.out.println("HANGMAN\nThe game will be available soon.");
        String word = "";
        char word2;
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
        int size = word.length();
        char[] w = new char[size];
        char[] w1 = new char[size];
        for (int i = 0; i <word.length(); i++){
            w[i] = '-';
            w1[i] = '-';
        }
        System.out.println(w);
        for (int i1 = 0; i1 < 8;i1++ ){
            test = 0;
            System.out.print("Enter your char:");
            word2 = in.next().charAt(0);
            for (int i2 = 0; i2 <word.length(); i2++) {
                if (word2 == word.charAt(i2)){
                    w[i2] = word2;
                    test = 1;
                    if (w[i2] == w1[i2]) {
                        test = 2;
                    }
                    w1[i2] = w[i2];

                }
                System.out.print(w[i2]);
            }
            System.out.println();
            if (test == 1) {
                i1--;
            }
            else if (test == 0) {
                System.out.println("That letter doesn`t appear in the word.");
            }
            else if (test == 2) {
                System.out.println("No improvements.");
            }
        }
        System.out.println(word);
    }
}
