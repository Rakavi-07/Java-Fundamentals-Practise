// Base class
class Vehicle {
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    void start() {
        System.out.println("Vehicle started 🚀");
    }

    void displayInfo() {
        System.out.println("Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Car subclass
class Car extends Vehicle {
    int doors;

    Car(int speed, int fuelCapacity, int doors) {
        super(speed, fuelCapacity);
        this.doors = doors;
    }

    void carFeature() {
        System.out.println("Car has " + doors + " doors 🚘");
    }
}

// Bike subclass
class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(int speed, int fuelCapacity, boolean hasCarrier) {
        super(speed, fuelCapacity);
        this.hasCarrier = hasCarrier;
    }

    void bikeFeature() {
        if (hasCarrier)
            System.out.println("Bike has a carrier 🏍️");
        else
            System.out.println("Bike without carrier 🏍️");
    }
}

// Truck subclass
class Truck extends Vehicle {
    int loadCapacity;

    Truck(int speed, int fuelCapacity, int loadCapacity) {
        super(speed, fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    void truckFeature() {
        System.out.println("Truck can carry " + loadCapacity + " tons 🚚");
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car(180, 50, 4);
        Bike bike = new Bike(120, 15, true);
        Truck truck = new Truck(100, 150, 10);

        car.start();
        car.displayInfo();
        car.carFeature();

        System.out.println();

        bike.start();
        bike.displayInfo();
        bike.bikeFeature();

        System.out.println();

        truck.start();
        truck.displayInfo();
        truck.truckFeature();
    }
}
