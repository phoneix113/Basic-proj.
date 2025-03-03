package Practice2;

import java.util.Scanner;

public class Calc { //faster but readbility is ass
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double b =scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        char op = scanner.next().charAt(0); // we did method chaining here so that we don't have to take whole string

        switch (op) {
            case '+'-> System.out.println(a+b);
            case '-'->System.out.println(a-b);
            case '*'->System.out.println(a*b);
            case '/'->{
                if (b==0){ 
                System.out.println("Cannot divide by 0!");    
                }
                else{System.out.println(a/b);}
                }
            case '^'->System.out.println(Math.pow(a, b));
            default->System.out.println("Invalid operator");
            //Use valid operation and set it true so that if invalid operator comes in, it doesn't cause an issue
        }
        scanner.close();
    }
    
}
