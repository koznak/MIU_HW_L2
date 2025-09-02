package Lesson1;

import java.util.Random;

public class QuickEmiQuote {
    public static void main(String[] args) {
        Random rd=new Random();
        int P = rd.nextInt(5000,25001);
        int n=rd.nextInt(6,37);
        double ARP=rd.nextDouble(3.5,11.6);
        double r=ARP / 12 / 100;
        double EMI=(P * r * Math.pow(1+r,n)) / (Math.pow(1+r,n)-1);

        double totalPayment = EMI * n;
        double totalInterest = totalPayment - P;

        int emiInInteger = (int) EMI;
        int emiInRounded =(int) Math.round(EMI);

        System.out.println("EMI Quote Summary");

        System.out.println("Loan Principal: " + P);
        System.out.println("Tenure: " + n);
        System.out.printf("Annual interest rate: %.2f%n", ARP);


        System.out.printf("EMI: %.2f%n", EMI);
        System.out.printf("Total Payment: %.2f%n" , totalPayment);
        System.out.printf("Total Interest: %.2f%n" , totalInterest);

        System.out.printf("EMI (truncated):  $%d%n", emiInInteger);
        System.out.printf("EMI (rounded):    $%d%n", emiInRounded);

    }
}



