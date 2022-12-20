public class Triangle {
   private double base;
   private double height;
   
   public void setBase(double userBase){
      base = userBase;
   }
   public void setHeight(double userHeight) {
      height = userHeight;
   }
   
   public double getArea() {
      double area = 0.5 * base * height;
      return area;
   }
   
   public void printInfo() {
      System.out.printf("Base: %.2f\n", base);
      System.out.printf("Height: %.2f\n", height);
      System.out.printf("Area: %.2f\n", getArea());
   }
}
