package Classes;

public class Park extends TouristAttraction{
    private int area;

    public Park(String name, String address, String description, int entryFee, int area) {
        super(name, address, description, entryFee);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    @Override
    public void printOpeningHours() {
        System.out.println("Park is open 24/7.");
    }
}
