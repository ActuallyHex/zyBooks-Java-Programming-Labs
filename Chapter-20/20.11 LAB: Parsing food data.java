import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      		String filename = scnr.nextLine();

		// open the file in read mode

		Scanner reader = new Scanner(new FileInputStream(filename));

		// create 4 arrays that are initialized to null

		String[] category = null, name = null, description = null, availability = null;

		// loop over the file line by line until the end

		while(reader.hasNextLine())

		{

		String line = reader.nextLine(); // read a line from file

		String[] fields = line.split("\t"); // split the line using tab(\t) as the delimiter to get array of Strings

		// expand the arrays by 1 more than original size

		if(category == null) // arrays are not allocated memory

		{

		// create arrays of size 1

		category = new String[1];

		name = new String[1];

		description = new String[1];

		availability = new String[1];

		}

		else // else expand the arrays by 1 more than the original size

		{

		// create a temporary array for category with size 1 more than size of category

		String[] temp = new String[category.length+1];

		// loop to copy records from category to temp

		for(int i=0;i<category.length;i++)

		temp[i] = category[i];

		category = temp; // update category to point to new array

		// create a temporary array for name with size 1 more than size of name

		temp = new String[name.length+1];

		// loop to copy records from name to temp

		for(int i=0;i<name.length;i++)

		temp[i] = name[i];

		name = temp; // update name to point to new array

		// create a temporary array for description with size 1 more than size of description

		temp = new String[description.length+1];

		// loop to copy records from description to temp

		for(int i=0;i<description.length;i++)

		temp[i] = description[i];

		description = temp; // update description to point to new array

		// create a temporary array for availability with size 1 more than size of availability

		temp = new String[availability.length+1];

		// loop to copy records from availability to temp

		for(int i=0;i<availability.length;i++)

		temp[i] = availability[i];

		availability = temp; // update availability to point to new array

		}

		// extract the fields from array and insert it into at the end of corresponding arrays

		category[category.length-1] = fields[0].trim();

		name[name.length-1] = fields[1].trim();

		description[description.length-1] = fields[2].trim();

		availability[availability.length-1] = fields[3].trim();

		}

		reader.close(); // close the file

		// loop over the arrays, displaying the name, category and description of food items that are "Available"

		for(int i=0;i<category.length;i++)

		{

		if(availability[i].equalsIgnoreCase("Available"))

		System.out.println(name[i] + " (" + category[i] + ") -- " + description[i]);

		}    

   }
}
