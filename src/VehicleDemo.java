/**
 * A program that uses the Vehicle class
 *
 * Call this file VehicleDemo.java
 */
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Displays range
    int range() {
        return fuelcap * mpg;
    }
}
// This class declares an object of type Vehicle
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

       // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Compute the range assuming a full tank of gas
        System.out.print("Minivan can carry " + minivan.passengers + " and have a range of " + minivan.range() + " miles.\n");
        System.out.print("Sportscar can carry " + sportscar.passengers + " and have a range of " + sportscar.range() + " miles.");
    }
}
