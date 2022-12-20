public class Encyclopedia extends Book {
   // TODO: Declare private fields: edition, numVolumes
   private String edition;
   private int numVolumes;
  
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumVolumes()
   public void setEdition(String theEdition) {
      edition = theEdition;
   }
   
   public void setNumVolumes(int volume) {
      numVolumes = volume;
   }
   
  
   // TODO: Define accessor methods -
   //       getEdition(), getNumVolumes()
   public String getEdition() {
      return edition;
   }
   
   public int getNumVolumes() {
      return numVolumes;
   }
   
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   @Override
   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
      System.out.println("   Edition: " + getEdition());
      System.out.println("   Number of Volumes: " + getNumVolumes());
   }
}
