package Practice2;

import java.util.Scanner;

public class Javaquiz {
    public static void main(String[] args) {
        //Java Quiz Using 2D arrays
        System.out.println("***********************");
        System.out.println("Welcome to JAVA QUIZ");
        System.out.println("***********************");
        Scanner scanner = new Scanner(System.in);
//This is one way to do so , but it's going to be alot of LOC so done in different way
    //     System.out.println("Question 1:What is the default value of an int variable in Java? ");
    //     String[][] opt1 = {{"1.","0"},{"2.","null"},{"3.","1"},{"4.","Undefined"}};
    //     for(String[] options : opt1){
    //         for(String answer : options){
    //             System.out.print(answer);
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("***********************");
    //     System.out.print("Your Guess:");
    //     int answer1 = scanner.nextInt();
    //     if (answer1 == 1) {
    //         System.out.println("Correct!");  
    //     }
    //     else if (answer1<=4) {
    //         System.out.println("Incorrect!");
    //     }
    //     else{
    //         System.out.println("Invalid option");
    //     }
    // 
    
    String[] questions = {"What is the main function of a router?",
    "Which part of the computer is considered the brain?",
    "What year was Facebook launched?",
    "Who is known as the father of computers?",
    "What was the first programming language?"};

    String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
    {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
    {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
    {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
    {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

    int [] answers = {3, 1, 2, 4, 3};
    int score = 0;
    int guess;
    for(int i = 0; i < questions.length; i++){
        System.out.println(questions[i]);

        for(String option : options[i]){ //enhanced for loop so that after every question we get options
            System.out.println(option);
        }

        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();

        if(guess == answers[i]){
            System.out.println("********");
            System.out.println("CORRECT!");
            System.out.println("********");
            score++;
        }
        else{
            System.out.println("********");
            System.out.println(" WRONG! ");
            System.out.println("********");
        }
    }

    System.out.println("Your final score is: " + score + " out of " + questions.length);
    scanner.close();
    }
    
}
