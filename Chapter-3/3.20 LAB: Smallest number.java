import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();
      int smallestNum = num3;
      
      if ((num1 < num2) && (num1 < num3))
      {
         smallestNum = num1;
      }
      else if ((num2 < num1) && (num2 < num3))
      {
         smallestNum = num2;
      }

      System.out.println(smallestNum);
   }
   
}
