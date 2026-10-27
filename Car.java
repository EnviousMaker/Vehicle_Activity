
public class Car extends Vehicle {
    private int numSeats;

    public Car(String vehicleId, String brand, double dailyRate, int numSeats) {
        super(vehicleId, brand, dailyRate);
        this.numSeats = numSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.calculateRentalCost(days) * 1.10; // 10% surcharge
    }

    @Override
    public void displayInfo() {
        System.out.print("Car [ID=" + vehicleId + ", Brand=" + brand + ", Seats=" + numSeats + "]");
    }
}
