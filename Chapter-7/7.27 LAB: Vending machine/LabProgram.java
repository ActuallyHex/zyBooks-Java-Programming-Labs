import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      VendingMachine vendingMachine = new VendingMachine();
   
      int userNum1 = scnr.nextInt();
      int userNum2 = scnr.nextInt();
      
      vendingMachine.purchase(userNum1);
      vendingMachine.restock(userNum2);
      
      vendingMachine.report();
   }
}
