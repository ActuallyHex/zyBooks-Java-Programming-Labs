import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);

     double age;
     double lbs;
     double bpm;
     double calories;
     double time;
     
     //System.out.println("Enter Age: ");
     age = scnr.nextDouble();
     
     //System.out.println("Enter Weight (lbs): ");
     lbs = scnr.nextDouble();
     
     //System.out.println("Enter BPM: ");
     bpm = scnr.nextDouble();
     
     //System.out.println("Enter Time(Minutes): ");
     time = scnr.nextDouble();
     
     calories = ((age * 0.2757) + (lbs * 0.03295) + (bpm * 1.0781) - 75.4991) * time / 8.368;
     
     System.out.print("Calories: ");
     System.out.printf("%.2f", calories);
     System.out.println(" calories");
   }
} 
