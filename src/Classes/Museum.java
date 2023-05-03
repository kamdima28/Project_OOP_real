package Classes;

public class Museum extends TouristAttraction{
    private String exhibit;

    public Museum(String name, String address, String description, int entryFee, String exhibit) {
        super(name, address, description, entryFee);
        this.exhibit = exhibit;
    }

    public String getExhibit() {
        return exhibit;
    }
    @Override
    public void printOpeningHours() {
        System.out.println("Museum is open from 9am to 5pm.");
    }
}
