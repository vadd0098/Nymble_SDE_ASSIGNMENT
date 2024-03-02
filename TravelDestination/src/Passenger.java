import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private String name;
    private int number;
    private PassengerType type;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int number, PassengerType type) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PassengerType getType() {
        return type;
    }

    public void setType(PassengerType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public void signUpForActivity(Activity activity) {
        double cost = activity.getCost();
        if (type == PassengerType.STANDARD) {
            if (balance >= cost) {
                balance -= cost;
                activities.add(activity);
            } else {
                System.out.println("Insufficient balance to book activity.");
            }
        } else if (type == PassengerType.GOLD) {
            double discountedCost = cost * type.getDiscount();
            if (balance >= discountedCost) {
                balance -= discountedCost;
                activities.add(activity);
            } else {
                System.out.println("Insufficient balance to book activity.");
            }
        } else {
            activities.add(activity);
        }
    }

    public void printDetails() {
        System.out.println("Passenger: " + name);
        System.out.println("Passenger Number: " + number);
        if (type == PassengerType.STANDARD || type == PassengerType.GOLD) {
            System.out.println("Balance: " + balance);
        }
        System.out.println("Activities:");
        for (Activity activity : activities) {
            System.out.println(activity.getName() + " at " + activity.getDestination().getName() + ", Cost: "
                    + activity.getCost());
        }
    }
}
