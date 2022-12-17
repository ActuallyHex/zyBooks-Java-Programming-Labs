import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      int first;
      int second;
      
      first = scnr.nextInt();
      second = scnr.nextInt();
      
      if(first > second)
      {
         System.out.println("Second integer can't be less than the first.");
      }
      else  
      {
         while(first <= second)
         {
            System.out.print(first + " ");
            first += 5;
         }
         System.out.println();
      }
      
      
   }
}
