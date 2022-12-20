public class Book {

   protected String title;
   protected String author;
   protected String publisher;
   protected String publicationDate;

   public void setTitle(String userTitle) {
      title = userTitle;
   }

   public String getTitle() {
      return title;
   }

   public void setAuthor(String userAuthor) {
      author = userAuthor;
   }

   public String getAuthor(){
      return author;
   }

   public void setPublisher(String userPublisher) {
      publisher = userPublisher;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublicationDate(String userPublicationDate) {
      publicationDate = userPublicationDate;
   }

   public String getPublicationDate() {
      return publicationDate;
   }

   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
   }
}
