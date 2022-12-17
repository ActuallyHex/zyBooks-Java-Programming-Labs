import java.util.Scanner; 

public class LabProgram {
   
   public static int getFreqOfWord(String[] wordList, int listSize, String currWord)
   {
      int num = 0;
      
      for (int i = 0; i < listSize; i++)
      {
         if(wordList[i].equals(currWord))
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
         System.out.println(words[i] + " - " + getFreqOfWord(words, n, words[i]));
      }
      
   }
}
