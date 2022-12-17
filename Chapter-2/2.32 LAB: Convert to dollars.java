import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      int totalCents;
      
      double dollars;
      
      quarters = scnr.nextInt();
      dimes = scnr.nextInt();
      nickels = scnr.nextInt();
      pennies = scnr.nextInt();
      
      totalCents = 25*quarters + 10*dimes + 5*nickels + pennies;
      dollars = totalCents / 100.0;
      
      System.out.print("Amount: $");
      System.out.printf("%1.2f", dollars);
      System.out.println();
      
      
   }
}
