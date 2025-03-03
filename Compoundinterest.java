package Practice2;

import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal= scanner.nextDouble();
        System.out.println("Enter the interest rate(in %): ");
        double rate=scanner.nextDouble()/100;
        System.out.println("Enter the number of times compounded per year: ");
        int timesCompounded=scanner.nextInt();
        System.out.println("Enter the number of years: ");
        int years=scanner.nextInt();
        double amount =principal*Math.pow(1+rate/timesCompounded,timesCompounded*years);
        
        System.out.println("The compound interest on "+principal+ " is Rs." + amount);

        scanner.close();
    }
    
}
