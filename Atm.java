package Practice2;

import java.util.Scanner;
//Java Banking program 
public class Atm {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        boolean isRunning = true; //this is sorts of while condition i.e. will run till isRunning is true.  
        double balance=0;
        while (isRunning) {
            System.out.println("+++++++++++++++++++++");
            System.out.println("Welcome to ABC Bank");
            System.out.println("+++++++++++++++++++++");
            System.out.println("Press(1-4) \n1: Display Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.println("+++++++++++++++++++++");
            choice = scanner.nextInt();
        
            switch (choice) {
                case 1->showBalance(balance);
                case 2->balance += deposits();
                case 3->balance -=withdraw(balance); 
                case 4->isRunning = false;
                default ->System.out.println("Invalid choice");
                }
            
        }
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");
        scanner.close(); //it's outside the while loop because when second time it tries to run, its going to throw an exception of scanner not being able to read since it is closed.
    }
    static void showBalance(double balance){
        System.out.println("+++++++++++++++++++++");
        System.out.printf("$%.2f\n",balance);
    }   
    static double deposits(){
        double amount;
        System.out.println("Enter an amount to be deposited: ");
        // We can't use scanner here because we declared it in different method i.e. main method
        //Therefore we are going to create it global by declaring it static in main class
        amount = scanner.nextDouble();
        if (amount<0) {
            System.out.println("Amount can't be Negative, Please try again");
            return 0;
        }
        else{
            return amount;
        }
    } 
    static double withdraw(double balance){ //instead of making a static variable I chose to add arguments to this method so that we can call it from above method.
        double amount;
        System.out.println("Enter the amount you need to withdraw from your account: ");
        amount = scanner.nextDouble();
        if (amount>balance) {
            System.out.println("You do not have enough money to take out");
            return 0;
        }
        else if (amount<0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
     
}
