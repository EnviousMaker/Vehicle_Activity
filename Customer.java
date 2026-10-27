
public class Customer {
    private String name;
    private String licenseNumber;
    private Vehicle rentedVehicle; 

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rentedVehicle = null;
    }

    public void rentVehicle(Vehicle vehicle) {
        this.rentedVehicle = vehicle;
    }

    public void returnVehicle() {
        this.rentedVehicle = null;
    }

    public void printRentalSummary(int days) {
        if (rentedVehicle == null) {
            System.out.println("No vehicle currently rented.");
            return;
        }
        System.out.println("Customer: " + name + " (License: " + licenseNumber + ")");
        System.out.print("Rented: " + rentedVehicle.getBrand() + " ");
        if (rentedVehicle instanceof Car) {
            System.out.println("Car");
        } else if (rentedVehicle instanceof Motorcycle) {
            System.out.println("Motorcycle");
        } else {
            System.out.println("Vehicle");
        }
        double totalCost = rentedVehicle.calculateRentalCost(days); 
        System.out.printf("Total Cost for %d days: $%.2f%n", days, totalCost);
    }
}
