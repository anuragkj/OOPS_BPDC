import java.util.Scanner;
class Reverse {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = s.nextInt();
    int reversed = 0;
    while(num != 0) 
    {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    s.close();
    System.out.println("Reversed Number: " + reversed);
  }
}
