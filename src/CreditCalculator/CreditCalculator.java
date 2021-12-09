package CreditCalculator;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum_of_credit;
        int payment, last_payment;
        int months;
        char want;
        System.out.println("Enter the sum of credit: ");
        sum_of_credit = in.nextInt();
        System.out.println("What do you want to calculate?");
        System.out.println("type \"m\" – for number of monthly payments,");
        System.out.println("type \"p\" – for the monthly payment:");
        want = in.next().charAt(0);
        if (want == 'm'){
            System.out.print("Enter the monthly payment: ");
            payment = in.nextInt();
            if (sum_of_credit % payment > 0){
                months = sum_of_credit / payment + 1;
            }else{
                months = sum_of_credit / payment;
            }System.out.println("It will take " + months + " months to repay the credit");
        }else if (want == 'p'){
            System.out.print("Enter the number of months: ");
            months = in.nextInt();
            if (sum_of_credit / months > 0){
                payment = sum_of_credit / months + 1;
                last_payment = sum_of_credit - (months - 1) * payment;
                System.out.println("Your monthly payment = " + payment + " and the last payment = " + last_payment);
            }else{
                payment = sum_of_credit / months;
                System.out.println("Your monthly payment = " + payment);
            }
        }
    }
}
