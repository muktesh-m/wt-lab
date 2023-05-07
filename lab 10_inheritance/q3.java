class Vehicle {
    void start() {
        System.out.println("Starting the vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Starting the car");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Starting the bike");
    }
}

public class q3 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Bike();

        vehicle1.start();
        vehicle2.start();
        vehicle3.start();
    }
}
