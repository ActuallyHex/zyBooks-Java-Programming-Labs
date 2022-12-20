import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max;
      int counter;
      
      val1 = 0;
      val2 = 0;
      val3 = 0;
      
      /* Type your code here. */
      max = 0;
      counter = 0;
      
      try
      {
         val1 = scnr.nextInt();
         counter++;
         val2 = scnr.nextInt();
         counter++;
         val3 = scnr.nextInt();
         counter++;
         
         max =  Math.max(Math.max(val1,val2),val3);
          
         System.out.println(max);
      }
      catch(NoSuchElementException e)
      {
         
          max = Math.max(Math.max(val1,val2),val3);
          
    	  if (counter == 0)
    	  {
              System.out.println(counter + " input(s) read:");
        	  System.out.println("No max");
    	  }
    	  else
    	  {
              System.out.println(counter + " input(s) read:");
        	  System.out.println("Max is " + max);
    	  }

      }
      
      

   }
}
