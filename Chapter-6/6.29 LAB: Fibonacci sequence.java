import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      
      int num1 = 0;
      int num2 = 1;
      int num3 = 0;
      
      if(n < 0)
      {
         return -1;
      }
      else if (n == 0)
      {
         return 0;
      }
      else
      {
         for(int i = 2; i <= n; i++) 
         {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
         
         }
      }
      
      return num2;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
