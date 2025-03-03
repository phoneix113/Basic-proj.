package Practice2;
import java.util.*;
public class Rando {
    public static void main(String[] args) {
        Random random = new Random(); //here we created a random object of Random class
        int num;
        num = random.nextInt(1,100); //brackets are here to set parameter that between which numbers answer will come
        System.out.println(+num+" is the times you are going to get rich this year");
    }// we can use boolean, if statements. to use random 

}
