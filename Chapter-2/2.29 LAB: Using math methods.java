import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      double exNum;
      double exNum2;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      exNum = Math.pow(y, z);
      exNum2 = Math.pow((x * y), z);
      
      
      System.out.println(Math.pow(x, z) + " " + Math.pow(x, exNum) + " " + Math.abs(y) + " " + Math.sqrt(exNum2));
   }
}
