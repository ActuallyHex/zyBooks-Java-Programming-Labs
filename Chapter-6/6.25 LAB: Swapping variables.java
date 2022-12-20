import java.util.Scanner;

public class LabProgram {
   
   public static void swapValues(int[] values) {
      
      int temp;
      
      temp = values[0];
      values[0] = values[1];
      values[1] = temp;
      temp = values[2];
      values[2] = values[3];
      values[3] = temp;

      return;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int array[] = new int[4];
      
      for(int i = 0; i < 4; i++) 
      {
         array[i] = scnr.nextInt();
      }
      
      swapValues(array);
      
      for(int i = 0; i < 4; i++)
      {
         if(i == 3)
         {
            System.out.print(array[i]);
         }
         else
         {
            System.out.print(array[i] + " ");
         }
      }
      System.out.println();
   }
}
