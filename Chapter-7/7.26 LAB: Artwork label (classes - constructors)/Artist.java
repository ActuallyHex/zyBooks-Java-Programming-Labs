public class Artist {
   // TODO: Declare private fields - artistName, birthYear, deathYear
   private String artistName;
   private int birthYear;
   private int deathYear;
   
   public Artist(){
      artistName = "None";
      birthYear = 0;
      deathYear = 0;
   }

   // TODO: Define default constructor
   public Artist(String artistName, int birthYear, int deathYear){
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
      }
   

   // TODO: Define second constructor to initialize 
   //       private fields (artistName, birthYear, deathYear)
   
   // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
   public String getName(){
      return artistName;
      }
      
      public int getBirthYear(){
         return birthYear;
         }
         
      public int getDeathYear(){
         return deathYear;
         }
   
   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
   public void printInfo() {
      
      if (deathYear == -1 && birthYear == -1) {
         System.out.println("Artist: " + artistName + " (unknown)");
      }
      else if (deathYear == -1) 
      {
         System.out.println("Artist: " + artistName + " (" + birthYear + " to present)");
      }
      else 
      {
         System.out.println("Artist: " + artistName + " (" + birthYear + " to " + deathYear + ")");
      }

      
   }

}
