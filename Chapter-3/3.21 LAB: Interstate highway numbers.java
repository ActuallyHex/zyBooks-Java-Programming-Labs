import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      
      if (highwayNumber >= 1 && highwayNumber <= 999)
      {
         if (highwayNumber <= 99)
         {
            if (highwayNumber % 2 == 0 )
            {
               System.out.println("I-" + highwayNumber + " is a primary, going east/west");
            }
            else
            {
               System.out.println("I-" + highwayNumber + " is auxiliary, serving I-90, going east/west.");
            }
         }
         else
         {
            
         }
      }
      else
      {
         
         
      }
      
   }
}
