import java.util.Scanner;

public class ArtworkLabel {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String userTitle, userArtistName;
      int yearCreated, userBirthYear, userDeathYear;

      userArtistName = scnr.nextLine();
      userBirthYear = scnr.nextInt();
      scnr.nextLine();
      userDeathYear = scnr.nextInt();
      scnr.nextLine();
      userTitle = scnr.nextLine();
      yearCreated = scnr.nextInt();

      Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);

      Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);

      newArtwork.printInfo();
   }
}
