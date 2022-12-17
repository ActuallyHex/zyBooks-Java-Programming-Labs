import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int divNum;
      
      int div1;
      int div2;
      int div3;
      
      userNum = scnr.nextInt();
      divNum = scnr.nextInt();
      
      div1 = userNum / divNum;
      div2 = div1 / divNum;
      div3 = div2 / divNum;
      
      System.out.println(div1 + " " + div2 + " " + div3);
      
   }
}
