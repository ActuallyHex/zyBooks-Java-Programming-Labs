import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      int binaryNum;
      int userNum;
      
      userNum = scnr.nextInt();
      
      while(userNum > 0)
      {
         System.out.print(userNum % 2);
         userNum = userNum / 2;
      }
      System.out.println();
   }
}
