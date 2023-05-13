package Classes;

public class Restaurant extends Place{
    private String cuisineType;


    public Restaurant(String name, Address address, String description) {
        super(name, address, description);
        this.cuisineType = cuisineType;
    }

    @Override
    public void printOpeningHours() {

    }

    public String getCuisineType() {
        return cuisineType;
    }
}
