package Classes;

public class Restaurant extends Place{
    private String cuisineType;

    public Restaurant(String name, String address, String description) {
        super(name, address, description);
        this.cuisineType = cuisineType;
    }
    public String getCuisineType() {
        return cuisineType;
    }
}
