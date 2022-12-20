import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      
      Scanner scnr = new Scanner(System.in);
		String fileName = scnr.nextLine();
		
		String[] line;
        char grade;
        double totalM1 = 0, totalM2 = 0, totalFinal = 0, count = 0;
        try {
            PrintWriter output = new PrintWriter("report.txt");
            
            Scanner sc = new Scanner(new FileInputStream(fileName));
            
            while (sc.hasNextLine()) {
                line = sc.nextLine().split("\\s+");
                // calculate the avg for Midsterm1 score, Midsterm2 score, and the Final score
                double avg = (Integer.parseInt(line[2]) +
                        Integer.parseInt(line[3]) +
                        Integer.parseInt(line[4])) /
                        3.0;
                totalM1 += Integer.parseInt(line[2]);
                totalM2 += Integer.parseInt(line[3]);
                totalFinal += Integer.parseInt(line[4]);
                grade = getGrade(avg);
                output.write(
                        "" +
                                line[0] +
                                "\t" +
                                line[1] +
                                "\t" +
                                line[2] +
                                "\t" +
                                line[3] +
                                "\t" +
                                line[4] +
                                "\t" +
                                grade +
                                "\n");
                count++;
            }
            // round off to two decimal places
            output.format(
                    "\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", (totalM1 / count), (totalM2 / count),
                    (totalFinal / count));
            sc.close();
            output.close();
            //System.out.println("Done");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
      
   }
   
       public static char getGrade(double avg) {
        if (avg >= 90 && avg <= 100)
            return 'A';
        else if (avg >= 80 && avg <= 89)
            return 'B';
        else if (avg >= 70 && avg <= 79)
            return 'C';
        else if (avg >= 60 && avg <= 69)
            return 'D';
        else if (avg <= 60)
            return 'F';
        return '-';
		}
		
}
