import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      String firstName;
      String middleName;
      String lastName;
      String name;
      
      name = scnr.nextLine();
      
      int firstSpace = name.indexOf(" ");
      firstName = name.substring(0, firstSpace);
      
      int secondSpace = name.indexOf(" ", firstSpace + 1);
      
      if (secondSpace < 0)
      {
         lastName = name.substring(firstSpace + 1);
         
         System.out.println(lastName + ", " + firstName.charAt(0) + ".");
      }
      else
      {
         middleName = name.substring(firstSpace, secondSpace);
         
         lastName = name.substring(secondSpace + 1);
         
         System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(1) + ".");
      }
      
      
      if (secondSpace < 0)
         Systsem.out.println("bruh");
   }
}
