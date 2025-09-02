package Lesson1;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        char customerType;
        double amount=0.0;
        int unit=0;
        char flag;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter user type (R/C/I): ");
            customerType=sc.next().charAt(0);
            System.out.print("Enter units consumed: ");
            unit=sc.nextInt();

            amount =switch (customerType)
            {
                case 'R' -> unit * 0.12;
                case 'C' -> unit * 0.20;
                case 'I' -> unit * 0.35;

                default -> 0.0;

            };


            System.out.println("=== Electricity Bill === ");
            System.out.printf("User Type: %s\n",customerType);
            System.out.printf("Units: %d\n",unit);
            System.out.printf("Bill Amount: $%.2f\n",amount);
            System.out.print("Do you want to calculate another bill? (y/n):");
            flag=sc.next().charAt(0);
        }
        while (flag=='y');
        sc.close();
        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");

    }
}

