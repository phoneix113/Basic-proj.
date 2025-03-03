package Practice2;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        //Temperature converter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature you would like to convert");
        double temp= scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        String unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        double newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s\n", newTemp, unit);

        scanner.close();
    }
    
}
