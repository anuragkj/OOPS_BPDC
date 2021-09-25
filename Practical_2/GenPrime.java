import java.util.Scanner;
public class GenPrime {
 
    
    static boolean check(int n){
     a   bv
     if(n<2){
            return false;
        }
        else if (n == 2){
            return true;
        } 
        else if (n % 2 == 0){
            return false;
        }
        for (int i =3; i<= Math.sqrt(n); i+=2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag;
 
        
        System.out.println("Enter lower bound of the interval: ");
        a = sc.nextInt(); 
 
        
        System.out.println("Enter upper bound of the interval: ");
        b = sc.nextInt(); 
 
        
        System.out.println("Prime numbers between %d and %d are: ", a, b);
 
        
        for (i = a; i <= b; i++) {
            if(check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
