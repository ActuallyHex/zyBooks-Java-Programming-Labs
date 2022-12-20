import java.util.Scanner;

public class LabProgram {
   
   public static int digitCount(int n)
   {
      if(n < 10)
      {
         return 1;
      }
      
      return 1 + (digitCount(n/10));
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);
   }
}
