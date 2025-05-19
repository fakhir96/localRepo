// package LocalRepo;
import java.util.Random;
import java.util.Scanner;

public class RandNum {
    public static void main(String[] args) {
    
        Random random = new Random();
    
        int x = 10 + random.nextInt(11); // Generate random int from 10 to 20 (inclusive)
        // boolean z = random.nextBoolean(); 
    
        System.out.println(x);
        //System.out.println(z);


        // Validation for Input Integer only
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();


    }
    
}
