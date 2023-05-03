package Classes;

public class Route implements Transportation{
    private String name;

    public Route(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " has started.");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    @Override
    public void transportPassengers() {
        System.out.println(name + " is transporting passengers.");
    }
}
