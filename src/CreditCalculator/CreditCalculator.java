package CreditCalculator;

public class CreditCalculator {
    public static void main(String[] args){
        double sum_of_credit, payment, n, i, i_nominal, D, overpay = 0;
        int months, years;
        char want;
        String want1 = System.getProperty("want");
        String sum_of_credit1 = System.getProperty("sum_of_credit");
        String payment1 = System.getProperty("payment");
        String i1 = System.getProperty("i");
        String months1 = System.getProperty("months");
        if (want1 != null){
            want = want1.charAt(0);
            if (want == 'a'){
                if (sum_of_credit1 != null && payment1 != null && i1 != null) {
                    sum_of_credit = Double.parseDouble(sum_of_credit1);
                    payment = Double.parseDouble(payment1);
                    i = Integer.parseInt(i1);
                    i_nominal = i / (12 * 100);
                    n = Math.log(payment / (payment - (i_nominal * sum_of_credit))) / Math.log(1 + i_nominal);
                    n = Math.ceil(n);
                    months = (int) n;
                    if (n % 12 > 0) {
                        years = months / 12;
                        months = months - years * 12;
                        System.out.println("It will take " + years + " years and " + months + " months to repay this credit!");
                    } else {
                        years = months / 12;
                        System.out.println("It will take " + years + " years to repay this credit!");
                    }
                } else if (sum_of_credit1 != null && months1 != null && i1 != null) {
                    months = Integer.parseInt(months1);
                    sum_of_credit = Double.parseDouble(sum_of_credit1);
                    i = Integer.parseInt(i1);
                    i_nominal = i / (12 * 100);
                    payment = sum_of_credit * ((i_nominal * Math.pow((1 + i_nominal), months)) / (Math.pow((1 + i_nominal), months) - 1));
                    payment = Math.ceil(payment);
                    System.out.println("Your monthly payment = " + (int)payment + "!");
                } else if (months1 != null && payment1 != null && i1 != null) {
                    months = Integer.parseInt(months1);
                    i = Integer.parseInt(i1);
                    payment = Double.parseDouble(payment1);
                    i_nominal = i / (12 * 100);
                    sum_of_credit = payment / ((i_nominal * Math.pow((1 + i_nominal), months)) / (Math.pow((1 + i_nominal), months) - 1));
                    sum_of_credit = Math.ceil(sum_of_credit);
                    System.out.println("Your sum of credit = " + (int)sum_of_credit + "!");
                } else {
                    System.out.println("Incorrect parameters.");
                    System.exit(0);
                }
            }else if (want == 'd'){
                if (sum_of_credit1 == null || months1 == null || i1 == null) {
                    System.out.println("Incorrect parameters.");
                    System.exit(0);
                }
                months = Integer.parseInt(months1);
                sum_of_credit = Double.parseDouble(sum_of_credit1);
                i = Integer.parseInt(i1);
                i_nominal = i / (12 * 100);
                for (int m = 1; m <= months; m ++) {
                    D = sum_of_credit / months + i_nominal * (sum_of_credit - ((sum_of_credit * (m - 1)) / (months)));
                    D = Math.ceil(D);
                    overpay = overpay + (D - (sum_of_credit / months));
                    System.out.println("Month " + m + ": payment is " + (int)D);
                }
                System.out.println("Overpayment = " + (int)overpay);
            }else{
                System.out.println("Incorrect parameters.");
                System.exit(0);
            }
        }else {
            System.out.println("Incorrect parameters.");
            System.exit(0);
        }
    }
}
