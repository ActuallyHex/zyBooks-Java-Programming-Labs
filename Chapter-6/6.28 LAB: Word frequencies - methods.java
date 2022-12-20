import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String currWord)
   {
      int num = 0;
      String[] otherWordList = new String[listSize];

      for (int i = 0; i < listSize; i++)
      {
         otherWordList[i] = wordsList[i];
         otherWordList[i] = otherWordList[i].toLowerCase();

         if(otherWordList[i].equals(currWord.toLowerCase()))
         {
            num++;
         }
      }
      
      return num;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] words = new String[20];
      int i;
      int n;
      int count = 0;
      
      n = scnr.nextInt();
      
      for (i = 0; i < n; i++)
      {
         words[i] = scnr.next();
      }
      
      
      for(i = 0; i < n; i++)
      {
         //String filter = words[i].toLowerCase();
         //System.out.print(filter);
         System.out.println(words[i] + " " + getWordFrequency(words, n, words[i]));
      }
      
   }
}
