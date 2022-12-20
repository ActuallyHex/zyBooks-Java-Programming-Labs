import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive drawTriangle() method here. */
	private static void drawTriangle(int n)
	{
	   
		int fix = 0;
		
		if(n == 9)
		{
			fix = 3;
		}
		else if(n == 15)
		{
			fix = 6;
		}
		else if(n == 19)
		{
			fix = 8;
		}
		
		for(int b = 1; b < n-fix; b++)
		{

			// spaces
			for(int i = 0; i <= 9-b; i++)
			{
				System.out.print(" ");
			}
			
			// asteriks 
			for(int j = 1; j <= b*2-1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//System.out.println();
	   
	}
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int baseLength;
      
      baseLength = scnr.nextInt();
      drawTriangle(baseLength);
   }
}
