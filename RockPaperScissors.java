package Practice2;

import java.util.*;

public class RockPaperScissors {
    //Rock Paper Scissors- Get variables, choice from user and random choice from computer, check conditions, ask to play again. if not then goodbye message

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        
        String[] choices={"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain ="yes";
        do{
        System.out.print("Enter your move(rock,paper,scissors): ");
        playerChoice =scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock")&&!playerChoice.equals("paper")&&!playerChoice.equals("scissors")) {
            System.out.println("Invalid choice");
            continue; //we used this so that if invalid choice is picked the loop doesnt' continue further.an
        }
    

        computerChoice=choices[random.nextInt(3)]; //here we assigned that computer choice will be from array choices and all the items are assigned an index which will be randomly selected by random object
        System.out.println("Computer choice : "+computerChoice);

        if (playerChoice.equals(computerChoice)) { //both are reference data type so we used equals() method . == are use to compare memory addresses for these reference datatype 
            System.out.println("It's a Tie!!");
        }
        else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
        (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You Won!");
        }
        else{
            System.out.println("You Lost!");
        }
        System.out.print("Play again? Yes/no: " );
        playAgain=scanner.nextLine().toLowerCase();

    }while(playAgain.equals("yes"));
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
