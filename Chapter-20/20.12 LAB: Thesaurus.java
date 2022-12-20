import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int NUM_CHARACTERS = 26;      // Maximum number of letters
      int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

      String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
      String[] words = new String[MAX_WORDS]; // The words of each input line

      //System.out.println("The input for the program is: ");
      String inputStr = scnr.nextLine();
      
      String inputStrSplit[] = inputStr.split(" ");
      String fileName = inputStrSplit[0];
      String charFind = inputStrSplit[1];
      int findIndex = (int)(charFind.charAt(0)) - 97;
      
      FileInputStream fis = new FileInputStream(fileName + ".txt");
      
      scnr = new Scanner(fis);
      
      String line = "";
      int index = 0;
      
      while(scnr.hasNextLine())
      {
         line = scnr.nextLine();
         words = line.split(" ", 10);
         index = (int)(words[0].charAt(0)) - 97;
         
         for(int i = 0; i < words.length; i++)
         {
            synonyms[index][i] = words[i]; // updates the list of synonyms
         }
      }
      scnr.close();
      
      //System.out.println("The program output: ");
      
      for(int i = 0; i < synonyms[findIndex].length; i++)
      {
         if(synonyms[findIndex][i] != null)
         {
            System.out.println(synonyms[findIndex][i]);
         }
         else
         {
            if(i == 0)
            {
               System.out.println("No synonyms for " + fileName + " begin with " + charFind + ".");
               break;
            }
         }
      }
   }
}
