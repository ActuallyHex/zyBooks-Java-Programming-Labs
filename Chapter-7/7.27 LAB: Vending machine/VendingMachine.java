// simulates a simple vending machine with operations to purchase drinks and check inventory.
public class VendingMachine {
   
   // number of bottle in stock
   private int bottles;
   
   // initial inventory is 20
   public VendingMachine(){
      bottles = 20;
   }

   public void purchase(int amount){
      bottles = bottles - amount;
   }
  
   public int getInventory(){
      return bottles;
   }

   public void restock(int amount){
      bottles = bottles + amount;
   }
 
   public void report(){
      System.out.println("Inventory: " + bottles + " bottles");
   }
   
}
