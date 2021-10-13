package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String []args) {
        System.out.println("Hello! My name is Jora.\nI was created in 2021.\nPlease, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String response;
        response = scanner.nextLine();
        System.out.println("What a great name you have, "+response);
    }

}
