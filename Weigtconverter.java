package Practice2;

import java.util.Scanner;

public class Weigtconverter {
    public static void main(String[] args) {
        //Weight converter Did it myself.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight that is to be converted: ");
        Double Weight = scanner.nextDouble();
        System.out.println("Press 1 for lbs to kgs otherwise press 2 for kgs to lbs conversion");
        int choice = scanner.nextInt();
        
        if(choice==1){
            Weight/=2.205;
            System.out.printf("Your converted value is %.2f \n",Weight);

        }
        else if(choice==2){
            Weight*=2.205;
            System.out.printf("Your converted value is %.2f \n",Weight);
        }
        else{

            System.out.println("Wrong option selected,Please try again");
            
        }
        scanner.close();
    }
    
}
