import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      String inputString;
      int i;
      inputString = scnr.nextLine();
      
      //System.out.println(inputString);
      
      for (i = 0; i < inputString.length(); i++)
      {
         if (inputString.charAt(i) < 'A' || inputString.charAt(i) > 'Z' && inputString.charAt(i) < 'a' || inputString.charAt(i) > 'z')
         {
            inputString = inputString.substring(0, i) + inputString.substring(i + 1);
            i--;
         }
      }
      System.out.println(inputString);
      
      
   }
}
