class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    
    public Vehicle() {
        this.brand = "Honda";
        this.model = "C12";
        this.year = 2024;
    }
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
    
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    protected int numberOfDoors;
    protected String fuelType;
    
    public Car() {
        super();
        this.numberOfDoors = 4;
        this.fuelType = "Petrol";
    }
    
    public Car(String brand, String model, int year, int numberOfDoors, String fuelType) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + this.numberOfDoors);
        System.out.println("Fuel Type: " + this.fuelType);
    }
    
    public void start() {
        System.out.println("Car engine is starting...");
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;
    
    public ElectricCar() {
        super();
        this.batteryCapacity = 50;
        this.range = 300;
        this.fuelType = "Electric";
    }
    
    public ElectricCar(String brand, String model, int year, int numberOfDoors, int batteryCapacity, int range) {
        super(brand, model, year, numberOfDoors, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + this.batteryCapacity + " kWh");
        System.out.println("Range: " + this.range + " km");
    }
    
    public void start() {
        System.out.println("Electric car is silently powering on...");
    }
    
    public void charge() {
        System.out.println("Charging battery...");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        System.out.println("=== Vehicle 1 ===");
        Vehicle v1 = new Vehicle("Generic", "Model-X", 2020);
        v1.displayInfo();
        v1.start();
        
        System.out.println("\n=== Vehicle 2 (Car) ===");
        Car c1 = new Car("Toyota", "Camry", 2023, 4, "Petrol");
        c1.displayInfo();
        c1.start();
        
        System.out.println("\n=== Vehicle 3 (Electric Car) ===");
        ElectricCar ec1 = new ElectricCar("Tesla", "Model 3", 2024, 4, 75, 500);
        ec1.displayInfo();
        ec1.start();
        ec1.charge();
        
        System.out.println("\n=== Polymorphism Demo ===");
        Vehicle v2 = new Car("Honda", "Civic", 2022, 4, "Diesel");
        v2.start();
        
        Vehicle v3 = new ElectricCar("Nissan", "Leaf", 2023, 4, 60, 400);
        v3.start();
    }
}
