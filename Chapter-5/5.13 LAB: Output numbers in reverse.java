import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements;
      int i;
      numElements = scnr.nextInt();
      int[] userList = new int[numElements];
      
      for(i = 0; i < numElements; i++)
      {
         userList[i] = scnr.nextInt();
      }
      
      for(i = userList.length - 1; i >= 0; i--)
      {
         System.out.print(userList[i] + ",");
      }
      
      System.out.println();
      
   }
}
