import java.util.Scanner;  
public class GCD
{   
    public static void main(String[] args)   
    {   
        int a, b;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the First Number: ");  
        a = sc.nextInt();     
        System.out.print("Enter the Second Number: ");  
        b = sc.nextInt();     
        System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));   
    }  
      
    static int findGCD(int a, int b)   
    {   
        if (b == 0)   
            return a;     
        return findGCD(b, a % b);   
    }   
}    
