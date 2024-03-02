
import javax.print.attribute.standard.Destination;

public class App {
    public static void main(String[] args) throws Exception {
        TravelPackage package1 = new TravelPackage("Package 1", 10);

        Destination destination1 = new Destination("Destination 1");
        Destination destination2 = new Destination("Destination 2");

        Activity activity1 = new Activity("Activity 1", "Description 1", 50.0, 5);
        Activity activity2 = new Activity("Activity 2", "Description 2", 80.0, 3);

        destination1.addActivity(activity1);
        destination2.addActivity(activity2);

        package1.addDestination(destination1);
        package1.addDestination(destination2);

        Passenger passenger1 = new Passenger("Passenger 1", 1, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Passenger 2", 2, PassengerType.GOLD);

        activity1.bookPassenger(passenger1);
        activity2.bookPassenger(passenger2);

        package1.addPassenger(passenger1);
        package1.addPassenger(passenger2);

        package1.printItinerary();

        package1.printPassengerList();

        passenger1.printDetails();
        passenger2.printDetails();
    }
}
