import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      String dataTitle;
	      String columnOneHeader;
	      String columnTwoHeader;
	      String entry = null;
	      ArrayList<String> column1 = new ArrayList<String>();
	      ArrayList<String> column2 = new ArrayList<String>();
	      int counter;
	      
	      
	      System.out.println("Enter a title for the data:");
	      dataTitle = scnr.nextLine();
	      System.out.print("You entered: " + dataTitle);
	      
	      System.out.println();
	      System.out.println();
	      
	      System.out.println("Enter the column 1 header:");
	      columnOneHeader = scnr.nextLine();
	      System.out.print("You entered: " + columnOneHeader);
	      
	      System.out.println();
	      System.out.println();
	      
	      System.out.println("Enter the column 2 header:");
	      columnTwoHeader = scnr.nextLine();
	      System.out.println("You entered: " + columnTwoHeader);
	      
	      System.out.println();
	      
	      System.out.println("Enter a data point (-1 to stop input):");
	      entry = scnr.nextLine();
	      
	      while(!entry.equals("-1"))
	      {
		      entry = entry.replaceAll("\\s+", " ");
		      String entries[] = entry.split(",");
		      
		      if(entries.length == 1)
		      {
		    	  System.out.println("Error: No comma in string.");
		      }
		      else
		      {
		            System.out.println("Data string: " + entries[0]);
		            System.out.println("Data integer: " + entries[1]);
		            
				    column1.add(entries[0]);
				    column2.add(entries[1]);
		      }

		      System.out.println();
		      System.out.println("Enter a data point (-1 to stop input):");
		      entry = scnr.nextLine();
		      
	      }
	      
	      System.out.printf("%33s%n", dataTitle);
    	  System.out.printf("%-20s|%23s%n", columnOneHeader, columnTwoHeader);
    	  System.out.println("--------------------------------------------");
    	  
    	  for(int i = 0; i < column1.size(); i++)
    	  {
    		  System.out.printf("%-20s|%23s\n", column1.get(i), column2.get(i));
    	  }
    	  
    	  System.out.println();
    	  
    	  for(int i = 0; i < column1.size(); i++)
    	  {
    		  System.out.printf("%20s ",column1.get(i));
    		  
    		  int stars = Integer.parseInt(column2.get(i));
    		  
    		  for(int j = 0; j < stars; j++)
    		  {
    			  System.out.print("*");
    		  }
    		  
    		  System.out.println();

    	  }
   }
}
