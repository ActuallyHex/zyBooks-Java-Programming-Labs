import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int[] userValues = new int[9];  // Set of data specified by the user
      int i = 0;
      int n;
      
      n = scnr.nextInt();
      
      while(n >= 0 && i < 9)
      {
         userValues[i] = n;
         n = scnr.nextInt();
         i++;
      }

      if (n <= 0) 
      {
         System.out.println("Middle item: " + userValues[i/2]);
      }
      else 
      {
         System.out.println("Too many numbers");
      }
      
   }
}
