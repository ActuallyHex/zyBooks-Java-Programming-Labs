public class Instrument {

    protected String instrumentName;
    protected String instrumentManufacturer;
    protected int yearBuilt, cost;

    public void setName(String userName) {
        instrumentName = userName;
    }

    public String getName() {
        return instrumentName;
    }

    public void setManufacturer(String userManufacturer) {
        instrumentManufacturer = userManufacturer;
    }

    public String getManufacturer(){
        return instrumentManufacturer;
    }

    public void setYearBuilt(int userYearBuilt) {
        yearBuilt = userYearBuilt;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setCost(int userCost) {
        cost = userCost;
    }

    public int getCost() {
        return cost;
    }

    public void printInfo() {
        System.out.println("Instrument Information: ");
        System.out.println("   Name: " + instrumentName);
        System.out.println("   Manufacturer: " + instrumentManufacturer);
        System.out.println("   Year built: " + yearBuilt);
        System.out.println("   Cost: " + cost);
    }

}
