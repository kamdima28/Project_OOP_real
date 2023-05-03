package Classes;

public abstract class TouristAttraction extends Place{
    private int entryFee;

    public TouristAttraction(String name, String address, String description, int entryFee) {
        super(name, address, description);
        this.entryFee = entryFee;
    }

    public int getEntryFee() {
        return entryFee;
    }

    public abstract void printOpeningHours();
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Description: " + getDescription());
        System.out.println("Entry Fee: " + getEntryFee());
    }
}
