package src.src;
public class Activity {

    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void bookPassenger(Passenger passenger) {
        if (capacity > 0) {
            passenger.signUpForActivity(this);
            capacity--;
        } else {
            System.out.println("Sorry, activity is full.");
        }
    }

    public void printDetails() {
        System.out.println("Activity: " + name);
        System.out.println("Description: " + description);
        System.out.println("Cost: " + cost);
        System.out.println("Capacity: " + capacity);
    }
}