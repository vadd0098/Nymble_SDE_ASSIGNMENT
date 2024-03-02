import static org.junit.Assert.*;

import org.junit.Test;

public class TravelPackageTest {
    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Asia Tour", 10);

        Passenger passenger1 = new Passenger("Person 1", 101, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Person 2", 102, PassengerType.GOLD);

        travelPackage.addPassenger(passenger1);
        assertEquals(1, travelPackage.getPassengers().size());

        travelPackage.addPassenger(passenger2);
        assertEquals(2, travelPackage.getPassengers().size());
    }

    @Test
    public void testPrintItinerary() {
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 10);

        Destination destination1 = new Destination("Paris");
        Destination destination2 = new Destination("Rome");

        Activity activity1 = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 50.0, 100);
        Activity activity2 = new Activity("Colosseum Tour", "Tour of the ancient Colosseum", 40.0, 80);

        destination1.addActivity(activity1);
        destination2.addActivity(activity2);

        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        travelPackage.printItinerary();
    }

    @Test
    public void testPrintPassengerList() {

        TravelPackage travelPackage = new TravelPackage("Asia Tour", 10);

        Passenger passenger1 = new Passenger("Person 1", 101, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Person 2", 102, PassengerType.GOLD);

        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        travelPackage.printPassengerList();
    }

}
