import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String name;

      System.out.println("Enter input string:");
      name = scnr.nextLine();
      
      while(!name.equals("q"))
      {
         name = name.replaceAll("\\s", "");
         String names[] = name.split(",");
         
         if(names.length == 1)
         {
            System.out.println("Error: No comma in string.");
         }
         else
         {
            System.out.println("First word: " + names[0]);
            System.out.println("Second word: " + names[1]);
         }
         
         System.out.println();
         
         System.out.println("Enter input string:");
         name = scnr.nextLine();
      }
      
   }
}
