package CreditCalculator;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum_of_credit, payment, n, i, i_nominal;
        int months, years;
        char want;
        System.out.println("What do you want to calculate?");
        System.out.println("type \"n\" – for number of monthly payments,");
        System.out.println("type \"a\" – for annuity monthly payment amount,");
        System.out.println("type \"p\" – for sum of credit");
        want = in.next().charAt(0);

        if (want == 'n'){
            System.out.println("Enter the sum of credit: ");
            sum_of_credit = in.nextDouble();
            System.out.print("Enter the monthly payment: ");
            payment = in.nextDouble();
            System.out.print("Enter the loan interest: ");
            i = in.nextInt();
            i_nominal = i / (12 * 100);
            n = Math.log(payment / (payment - (i_nominal * sum_of_credit))) / Math.log(1 + i_nominal);
            n = Math.ceil(n);
            months = (int) n;
            if (n % 12 > 0){
                years = months / 12;
                months = months - years * 12;
                System.out.println("It will take " + years + " years and " + months + " months to repay this credit!");
            }else{
                years = months / 12;
                System.out.println("It will take " + years + " years to repay this credit!");
            }
        }else if (want == 'a'){
            System.out.print("Enter the sum of credit: ");
            sum_of_credit = in.nextDouble();
            System.out.print("Enter the number of periods: ");
            months = in.nextInt();
            System.out.print("Enter the loan interest: ");
            i = in.nextInt();
            i_nominal = i / (12 * 100);
            payment = sum_of_credit * ((i_nominal * Math.pow((1 + i_nominal), months)) / (Math.pow((1 + i_nominal), months)-1));
            payment = Math.ceil(payment);
            System.out.println("Your monthly payment = " + (int)payment + "!");
        }else if (want == 'p'){
            System.out.print("Enter the payment: ");
            payment = in.nextDouble();
            System.out.print("Enter the number of periods: ");
            months = in.nextInt();
            System.out.print("Enter the loan interest: ");
            i = in.nextDouble();
            i_nominal = i / (12 * 100);
            sum_of_credit = payment / ((i_nominal * Math.pow((1 + i_nominal), months)) / (Math.pow((1 + i_nominal), months)-1));
            sum_of_credit = Math.ceil(sum_of_credit);
            System.out.println("Your sum of credit = " + (int)sum_of_credit + "!");
        }
    }
}
