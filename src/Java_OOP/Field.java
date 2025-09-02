package Java_OOP;

public class Field {
    public static void main(String[] args) {
        // None static field
        Car bmw = new Car();
        bmw.topSpeed = 10;
        bmw.totalSeats = 10;
        bmw.fuelCapacity = 10;
        // static field
        Car.maxSpeed = 120;
        // final field
        System.out.println("Top Speed  : " + bmw.topSpeed);
        System.out.println("Total Seats: " + bmw.totalSeats);
        System.out.println("FuelCapaity: " + bmw.fuelCapacity);
        System.out.println("Unchangable: "+Car.unchagableField); //This is the final field we can not change value
        System.out.println("Max Speed  : "+  Car.maxSpeed);
    }
}

class Car{
    // non static field
    int topSpeed;
    int totalSeats;
    int fuelCapacity;

    // static field
    static int maxSpeed;

    // final field
    static final int unchagableField = 10;
}
