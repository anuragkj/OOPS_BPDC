import java.util.Scanner;    

public class GradeCalc
{
   public static void main(String[] args)
   {
      char grade;   

      Scanner s = new Scanner(System.in);
      float total = 0F;
      for(int i = 1; i<=5; i++)
      {
            System.out.printf("Enter your test score for Subject %d: ",i);
            total += s.nextFloat();
      }
      System.out.println("Your total is " + total);
      System.out.println("Your average is " + total/5);
      System.out.println("Your percentage is " + total*100/500 +"%");
      total /= 5;
      if (total >= 90)
      {
         grade = 'A';
      }
      else if (total >= 80)
      {
         grade = 'B';
      }
      else if (total >= 70)
      {
         grade = 'C';
      }
      else if (total >= 60)
      {
         grade = 'D';
      }
      else
      {
         grade = 'F';
      }

      
      System.out.println("Your grade is " + grade);
      s.close();
   }
}
