package Classes;

public interface Transportation {
    default void start() {
        System.out.println("Starting transportation");
    }

    default void stop(){
        System.out.println("Stopping transportation");
    }
    public void transportPassengers();
}
