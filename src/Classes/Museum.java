package Classes;

public class Museum extends Place{
    private String exhibit;


    public Museum(String name, Address address, String description, int entryFee) {
        super(name, address, description);
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
