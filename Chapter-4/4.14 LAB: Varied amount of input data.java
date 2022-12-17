import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int userNum;
      int counter = 0;
      int max = 0;
      int total = 0;
      double average = 0.0;
      
      userNum = scnr.nextInt();
      
      while(userNum >= 0)
      {
         counter++;
         total += userNum;
         max = Math.max(max, userNum);
         userNum = scnr.nextInt();
      }
      
      average = (double)total / counter;
      
      System.out.print(max + " ");
      System.out.printf("%.2f\n", average);

   }
}
