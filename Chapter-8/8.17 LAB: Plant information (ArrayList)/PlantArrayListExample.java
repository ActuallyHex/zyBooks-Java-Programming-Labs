import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList(ArrayList<Object> objList) {
      int i;

      for (i = 0; i < objList.size(); ++i) {

         System.out.println(objList.get(i));
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Object> myGarden = new ArrayList<>();

      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual\
      String plantName;
      String plantCost;
      String colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         if (input.contains("plant")) {
            Plant plant = new Plant();
            
            plantName = scnr.next();
            plantCost = scnr.next();
            
            plant.setPlantName(plantName);
            plant.setPlantCost(plantCost);
            
            //System.out.println(plantName);
            
                     
            myGarden.add("Plant Information: ");
            myGarden.add("   Plant name: " + plant.getPlantName());
            myGarden.add("   Cost: " + plant.getPlantCost());
            myGarden.add("");
            
         }
         else
         {
            Flower flower = new Flower();
            plantName = scnr.next();
            plantCost = scnr.next();
            
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            
            flower.setPlantName(plantName);
            flower.setPlantCost(plantCost);
            flower.setPlantType(isAnnual);
            flower.setColorOfFlowers(colorOfFlowers);
            
            myGarden.add("Plant Information: ");
            myGarden.add("   Plant name: " + flower.getPlantName());
            myGarden.add("   Cost: " + flower.getPlantCost());
            myGarden.add("   Annual: " + flower.getPlantType());
            myGarden.add("   Color of flowers: " + flower.getColorOfFlowers());
            myGarden.add("");
         }
      
         input = scnr.next();
      }
   
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
