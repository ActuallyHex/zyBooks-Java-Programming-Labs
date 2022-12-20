import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   
   public static String findID(String studentName, Scanner infoScnr) throws Exception {
      
      /* Type your code here. */
      
   }
   
   public static String findName(String studentID, Scanner infoScnr) throws Exception {
      
      /* Type your code here. */
      
   }
   
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      String studentID;
      String studentInfoFileName;
      FileInputStream studentInfoStream = null;
      Scanner studentInfoScanner = null;
      
      // Read the text file name from user
      studentInfoFileName = scnr.next();

      // Open the text file
      studentInfoStream = new FileInputStream(studentInfoFileName);
      studentInfoScanner = new Scanner(studentInfoStream);
      
      // Read search option from user. 0: findID(), 1: findName()
      int userChoice = scnr.nextInt();

      // FIXME: findID() and findName() may throw an Exception.
      //        Insert a try/catch statement to catch the exception and output the exception message.
      
      if (userChoice == 0) {
         studentName = scnr.next();
         studentID = findID(studentName, studentInfoScanner);
         System.out.println(studentID);
      }
      else {
         studentID = scnr.next();
         studentName = findName(studentID, studentInfoScanner);
         System.out.println(studentName);
      }
      
      studentInfoStream.close();
   }
}
