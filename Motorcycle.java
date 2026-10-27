public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleId, String brand, double dailyRate, int engineCapacity) {
        super(vehicleId, brand, dailyRate);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.calculateRentalCost(days) * 0.95; // 5% discount
    }

    @Override
    public void displayInfo() {
        System.out.print("Motorcycle [ID=" + vehicleId + ", Brand=" + brand + ", CC=" + engineCapacity + "]");
    }
}
