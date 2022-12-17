import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      
      int product;
      int average;
      double dblAverage;
      double dblProduct;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      product = num1 * num2 * num3 * num4;
      average =  (num1 + num2 + num3 + num4) / 4;
      
      dblAverage = (double)(num1 + num2 + num3 + num4) / 4;
      dblProduct = ((double) num1) * num2 * num3 * num4;
      
      System.out.println(product + " " + average);
      
      System.out.printf("%.3f", dblProduct);
      System.out.print(" ");
      System.out.printf("%.3f", dblAverage);
      System.out.println();

   }
}
