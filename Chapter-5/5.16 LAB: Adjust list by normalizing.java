import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] userValues = new double[20];   // List of integers from input
      int i = 0;
      double maxVal = 0;
      
      int numValues;
      numValues = scnr.nextInt();
      
      for(i = 0; i < numValues; i++)
      {
         userValues[i] = scnr.nextDouble();
         //System.out.print(userValues[i] + "");
      }
      
      for(i = 0; i < userValues.length; i++)
      {
         if (userValues[i] > maxVal)
         {
            maxVal = userValues[i];
            //System.out.print(userValues[i] + " ");
         }
         
      }
      
      for(i = 0; i < numValues; i++)
      {
         //userValues[i] = userValues[i] / maxVal;
         System.out.printf("%.2f", Double.valueOf(userValues[i] / maxVal) );
         System.out.print(" ");
      }
      
      System.out.println();
   }
}
