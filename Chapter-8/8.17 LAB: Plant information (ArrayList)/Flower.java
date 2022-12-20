public class Flower extends Plant {

   private boolean isAnnual;
   private String colorOfFlowers;

   public void setPlantType(boolean userIsAnnual) {
      isAnnual = userIsAnnual;
   }

   public boolean getPlantType(){
      return isAnnual;
   }

   public void setColorOfFlowers(String userColorOfFlowers) {
      colorOfFlowers = userColorOfFlowers;
   }

   public String getColorOfFlowers(){
      return colorOfFlowers;
   }
   
   @Override
   public void printInfo(){
      System.out.println("Plant Information: ");
      System.out.println("   Plant name: " + plantName);
      System.out.println("   Cost: " + plantCost);
      System.out.println("   Annual: " + isAnnual);
      System.out.println("   Color of flowers: " + colorOfFlowers);
   }
}
