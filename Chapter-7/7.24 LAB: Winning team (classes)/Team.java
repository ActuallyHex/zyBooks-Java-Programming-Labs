public class Team {
   // TODO: Declare private fields - name, wins, losses
   private String name;
   private int wins;
   private int losses;
   
   // TODO: Define mutator methods - 
   //       setName(), setWins(), setLosses()
   public void setName(String userName) {
      name = userName;
   }
   
   public void setWins(int userWins) {
      wins = userWins;
   }
   
   public void setLosses(int userLosses) {
      losses = userLosses;
   }
   // TODO: Define accessor methods - 
   //       getName(), getWins(), getLosses()
   public String getName() {
      return name;
   }
   
   public int getWins() {
      return wins;
   }
   
   public int getLosses() {
      return losses;
   }
   
   // TODO: Define getWinPercentage()
   public double getWinPercentage() {
      double percent = 0.0;
      percent = (double) wins / (wins + losses);
      return percent;
   }
   
   // TODO: Define printStanding()
   public void printStanding() {
      System.out.printf("Win percentage: %.2f %n", getWinPercentage(), " ");
      //System.out.print(" ");
      
      if (getWinPercentage() >= 0.5) {
         System.out.println("Congratulations, Team " + name + " has a winning average!");
      }
      else
      {
         System.out.println("Team " + name + " has a losing average!");
      }
   }
}
