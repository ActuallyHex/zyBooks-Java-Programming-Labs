import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
   public static String coinFlip(Random rand) {
      // 1 rep heads
      // 0 rep tails
      
      boolean randBool = rand.nextBoolean();
      
      String coinSide = "";
      
      if(randBool)
      {
         coinSide = "Heads";
      }
      else
      {
         coinSide = "Tails";
      }
      
      return coinSide;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(System.currentTimeMillis()); // Seed used in develop mode
      int numCoinFlips = 0;
      
      numCoinFlips = scnr.nextInt();

      for(int i = 0; i < numCoinFlips; i++)
      {
         System.out.println(coinFlip(rand));
      }
   }
}
