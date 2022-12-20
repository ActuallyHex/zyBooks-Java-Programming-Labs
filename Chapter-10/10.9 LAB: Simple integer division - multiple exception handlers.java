import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int userNum;
	   int divNum;
	     
	   try
	   {
	      userNum = scnr.nextInt();
	      divNum = scnr.nextInt();
	      
	      try
	      {
	         System.out.println(userNum / divNum);
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println("Arithmetic Exception: " + e.getMessage());
	      }
	   }
	   catch(InputMismatchException e)
	   {
	      System.out.println("Input Mismatch Exception: " + e.toString());
	   }
   }
}
