import java.util.*;
public class GenPrimecommand {
 
    
    static boolean check(int n){
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
        int i;
        if(args.length > 0)
           {
                try{
                    int a = Integer.parseInt(args[0]);
                    int b = Integer.parseInt(args[1]);
                      

                    System.out.printf("Prime numbers between %d and %d are: ", a, b);
 
        
                    for (i = a; i <= b; i++){
                        if(check(i)){
                            System.out.print(i + " ");
                        }
                    }
                }
               catch(NumberFormatException nfe)
                 {
                     System.out.println("Argument/s must be the integer value");
                 }
           }
        
                
    }
}
