
public class Vehicle {
    protected String vehicleId;
    protected String brand;
    protected double dailyRate;

    public Vehicle(String vehicleId, String brand, double dailyRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.dailyRate = dailyRate;
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    public void displayInfo() {
        System.out.print("Vehicle [ID=" + vehicleId + ", Brand=" + brand + "]");
    }

    public String getBrand() {
        return brand;
    }
}
