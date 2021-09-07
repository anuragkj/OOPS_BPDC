import java.util.Random;
import java.util.Scanner;  
class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound;
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter the upper bound of the random number: ");  
      upperbound = sc.nextInt();     
      int int_random = rand.nextInt(upperbound); 
           
      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
      if (int_random % 2 == 0 )
        System.out.println("Random number is even");
     else
        System.out.println("Random number is odd");
    }
}