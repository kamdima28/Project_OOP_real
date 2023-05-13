package Classes;

public class Park extends Place{
    private int area;

    public Park(String name, Address address, String description, int area) {
        super(name, address, description);
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
