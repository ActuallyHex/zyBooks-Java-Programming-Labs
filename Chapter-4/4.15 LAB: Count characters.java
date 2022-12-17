import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      char findString;
      String wordString;
      
      findString = scnr.next().charAt(0);
      wordString = scnr.nextLine();
      
      int stringCounter = 0;
      int i;
      
      for (i = 0; i < wordString.length(); i++)
      {
         if (wordString.charAt(i) == findString)
         {
            stringCounter++;
         }
      }
      
      if (stringCounter == 1)
      {
         System.out.println(stringCounter + " " + findString);
      }
      else if (stringCounter > 1 || stringCounter < 1)
      {
         System.out.println(stringCounter + " " + findString + "'s");
      }


   }
}
