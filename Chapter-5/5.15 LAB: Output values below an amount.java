import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      int i = 0;
      int j = 0;
      int numValues;
      
      numValues = scnr.nextInt();
      
      for(i = 0; i < numValues; i++)
      {
         userValues[i] = scnr.nextInt();
      }
      
      
      int threshold = scnr.nextInt();
      
      for(j = 0; j < numValues; j++)
      {
         if(userValues[j] <= threshold)
         {
            System.out.print(userValues[j] + ",");
         }
      }

      System.out.println();
   }
}
