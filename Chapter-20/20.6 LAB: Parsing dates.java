import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      
	      Scanner scnr = new Scanner(System.in);
	      String date;
	      int index;
	      int monthInt;
	      String month;
	      String day;
	      String year;
	         
	      while(true)
	      {
		      date = scnr.nextLine();
		      
	         if(date.equals("-1")==true)
	         {
	            break;
	         }

	         index = date.indexOf(",");
	      
	         if (index == -1)
	         {
	            continue;
	         }
	         
	        String month_date= date.substring(0,index);
	      	month = month_date.split(" ")[0];
	      	day = month_date.split(" ")[1];
	      	year = date.substring(index+2);
	      
	      	monthInt = getMonthAsInt(month);
	      
	      	System.out.println(monthInt + "/" + day + "/" + year);
	      	
	      }
     
   }
}
