package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String []args) {
        System.out.println("Hello! My name is Jora.\nI was created in 2021.\nPlease, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String response;
        response = scanner.nextLine();
        System.out.println("What a great name you have, "+response);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
        System.out.println("Your age is "+age+"; that's a good time to start programming!");
        System.out.println("Now a will prove to you that I can count to any number you want");
        int number = scanner.nextInt();
        int num = 0;
        while (num < number){
            num++;
            System.out.println(num+"!");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several.");
        System.out.println("3. To determinate the execution time of a program.");
        System.out.println("4. To interrupt the execution of the program.");
        String response_1;
        while (true) {
            response_1 = scanner.nextLine();
            if (response_1.equals("1") ) {
                System.out.println("Please, try again");
            }
            if (response_1.equals("3") ) {
                System.out.println("Please, try again");
            }
            if (response_1.equals("4") ) {
                System.out.println("Please, try again");
            }
            if (response_1.equals ("2")) {
                System.out.println("Great, you right!\nGoodbye, have a nice day!");
                break;
            }
        }
    }

}
