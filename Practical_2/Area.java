import java.util.Scanner;11
public class Area {
 
    
    static void square(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the side: ");
        float side = sc.nextFloat();
        System.out.printf("Area is: %.2f", side*side);
    }

    static void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the base: ");
        float base = sc.nextFloat();
        System.out.println("Input the height: ");
        float height = sc.nextFloat();
        System.out.printf("Area is: %.2f", 0.5 * base * height);
    }

    static void circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius: ");
        float radius = sc.nextFloat();
        System.out.printf("Area is: %.2f", Math.PI * radius * radius);
    }

    static void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length: ");
        float l = sc.nextFloat();
        System.out.println("Input the breadth: ");
        float b = sc.nextFloat();
        System.out.printf("Area is: %.2f", l * b);
    }

    static void cylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius: ");
        float r = sc.nextFloat();
        System.out.println("Input the height: ");
        float h = sc.nextFloat();
        System.out.printf("Area is: %.2f", (2 * Math.PI * r *h) + (2 * Math.PI * r *r));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true){        
            System.out.println("Please select the shape you want to find area of: ");
            System.out.println("1: Square");
            System.out.println("2: Triangle");
            System.out.println("3: Circle");
            System.out.println("4: Rectangle");
            System.out.println("5: Cylinder");
            System.out.println("Input Your Choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                square();
                break;
            } 
            else if(choice == 2){
                triangle();
                break;
            }
            else if(choice == 3){
                circle();
                break;
            }
            else if(choice == 4){
                rectangle();
                break;
            }
            else if(choice == 5){
                cylinder();
                break;
            }
            else{
                System.out.println("Sorry! Invalid choice. Please choose again.");
            }
        }
    }
}
