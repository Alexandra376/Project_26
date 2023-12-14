public class Vehicle {
    public String brand;
    public int year;
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
    }
    public static class Car extends Vehicle {
        public String model;
        public Car(String model, String brand, int year) {
            super(brand, year);
            this.model = model;
        }
        public String toString() {
            return "Brand: " + brand + "\nModel: " + model + "\nYear: " + year;
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 2022);
        vehicle.displayInfo();
        System.out.println(vehicle.brand);
        System.out.println(vehicle.year);

        Car car = new Car("X5", "BMW", 2022);
        System.out.println(car.toString());
        car.displayInfo();
    }
}
