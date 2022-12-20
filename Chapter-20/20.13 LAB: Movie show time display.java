import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashSet; 
import java.util.LinkedList; 
import java.io.File; 
import java.io.FileNotFoundException; 

public class LabProgram {
   public static void main(String[] args) throws IOException {
		LinkedList<String> movies = new LinkedList<>();
		LinkedHashSet<String> moviesTitle = new LinkedHashSet<>();
		Scanner input = new Scanner(System.in); 		
		String fileName = input.next();	
		try { 		
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()) {			
				String data = file.nextLine(); 				
				movies.add(data);		
				String[] dataArray = data.split(","); 				
				moviesTitle.add(dataArray[1]);		
				} 		
			} 
		catch (FileNotFoundException e) 
		{ 			
			e.printStackTrace(); 
		}  			
		for (String title : moviesTitle) 
		{ 	
			System.out.printf("%-44s |", title.substring(0, Math.min(title.length(), 44)));		
			String time = ""; 			
			String ratings = ""; 			
			for (String movie : movies) 
			{ 				
				String[] dataArray = movie.split(",");			
				if (title.equals(dataArray[1])) 
				{ 					
					time = time + dataArray[0] + " ";				
					ratings = dataArray[2]; 				
				}  			
			}
					System.out.printf(" %5s |", ratings.substring(0, ratings.length()));		
					System.out.printf(" %-1s", time.substring(0, time.length() - 1));			
					System.out.println(); 		
		}
   }
}
