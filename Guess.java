package Practice2;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int randonum = random.nextInt(1,11); // one is inclusive 11 here is exclusive.
        int guess;
        int attempts=0;
        System.out.println("Guessing Game!!");
        do{
            System.out.println("Enter a number");
            guess=scanner.nextInt();
            attempts++;
            if (guess<randonum) {
                System.out.println("The number is higher than this");
                
            }
            else if (guess>randonum) {
                System.out.println("The number is lower than this");
                
            }
            else{
                System.out.println("Correct!!");
                System.out.println("It took you "+attempts+" attempts to win this!");
            }
        }while (guess!=randonum);
        System.out.println("Yay! you won!");
        scanner.close();

    }
    
}
