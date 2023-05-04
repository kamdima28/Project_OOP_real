package Classes;

public class Place {
    private String name;
    private Address address;
    private String description;

    public Place(String name, Address address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity());
        System.out.println("Description: " + description);
    }
}

