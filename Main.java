
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("101", "Toyota", 100.0, 5);
        Vehicle motorcycle = new Motorcycle("102", "Yamaha", 50.0, 150);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);

        System.out.println("=== Vehicle Rental Costs ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.printf(" -> Cost for 3 days: $%.2f%n", v.calculateRentalCost(3));
        }

        Customer alice = new Customer("Alice", "AB1234");
        alice.rentVehicle(car);

        System.out.println();
        System.out.println("=== Customer Rental Summary ===");
        alice.printRentalSummary(5);
    }
}
