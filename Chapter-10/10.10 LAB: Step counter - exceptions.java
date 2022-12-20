import java.util.Scanner;

public class LabProgram {
   /* Define your method here */
   public static double stepsToMiles(int steps)
   {
	   if(steps < 0)
	   {
		   throw new IllegalArgumentException("Exception: Negative step count entered.");
	   }
	   else
	   {
			return steps / 2000.0;
	   }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

	   int numSteps = 0;
	   
      try
      {
    	  numSteps = scnr.nextInt();
    	  //stepsToMiles(numSteps);

       	  System.out.printf("%.2f", stepsToMiles(numSteps));
       	  System.out.println();

      }
      catch(IllegalArgumentException e)
      {
    	  System.out.println(e.getMessage());
      }
   }
}
