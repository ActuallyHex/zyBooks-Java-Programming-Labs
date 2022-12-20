import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      double triArea1 = 0.0;
      double triArea2 = 0.0;
      
      double base = 0.0;
      double height = 0.0;
      
      base = scnr.nextDouble();
      height = scnr.nextDouble();
      
      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      triangle1.setBase(base);
      triangle1.setHeight(height);
      
      base = scnr.nextDouble();
      height = scnr.nextDouble();
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      triangle2.setBase(base);
      triangle2.setHeight(height);
      
      System.out.println("Triangle with smaller area:");
      
      // TODO: Determine smaller triangle (use getArea())
      //       and output smaller triangle's info (use printInfo())
      triArea1 = triangle1.getArea();
      triArea2 = triangle2.getArea();
      
      if(triArea1 < triArea2) {
         triangle1.printInfo();
      }
      else
      {
         triangle2.printInfo();
      }
   }
}
