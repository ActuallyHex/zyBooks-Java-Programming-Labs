import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      String fileName = scnr.next();
      Scanner scanFile = new Scanner(new File(fileName));
      String line;
      
       while(scanFile.hasNextLine())
       {
          line = scanFile.nextLine();
          
          if(line.contains("_photo.jpg"))
          {
              line = line.replace("_photo.jpg", "_info.txt");
              System.out.println(line);
          }
      }
         scanFile.close();
   }
}
