package Java_OOP_Basic;

public class ClassAndObject {
    static class Car {
        private int topSpeed;
        private int totalSeats;
        private int fuelCapacity;
        private String manufacturer; // Fixed typo in variable name

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTotalSeats(int totalSeats) {
            this.totalSeats = totalSeats;
        }

        public int getTotalSeats() {
            return totalSeats;
        }

        public void setFuelCapacity(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }
    public static void main(String[] args) {
        Car objCar = new Car();
        objCar.setTopSpeed(180);
        objCar.setManufacturer("Toyota");
        objCar.setTotalSeats(5);
        objCar.setFuelCapacity(50);

        System.out.println("Car Details:");
        System.out.println("Top Speed: " + objCar.getTopSpeed() + " km/h");
        System.out.println("Manufacturer: " + objCar.getManufacturer());
        System.out.println("Total Seats: " + objCar.getTotalSeats());
        System.out.println("Fuel Capacity: " + objCar.getFuelCapacity() + " liters");
    }
}
