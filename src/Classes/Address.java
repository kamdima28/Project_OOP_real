package Classes;

public class Address <T>{
    private String street;
    T city;


    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return (String) city;
    }


}