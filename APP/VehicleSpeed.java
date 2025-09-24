class Vehicle {
    Vehicle() {
        // Default constructor
    }
    void speed() {
        System.out.println("Vehicle speed is not defined");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 100 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike runs at 80 km/h");
    }
}

public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();   // Car object
        v.speed();

        v = new Bike();  // Bike object
        v.speed();
    }
}


