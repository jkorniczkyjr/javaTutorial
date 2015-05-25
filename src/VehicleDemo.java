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

    // Calculates gallons required for a given trip
    double fuelNeeded(int miles) {
        return (double) miles / mpg; // Need (double) because both are int
    }
}
// This class declares an object of type Vehicle
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

       // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Compute the range assuming a full tank of gas
        System.out.println("Minivan can carry " + minivan.passengers + " and have a range of " + minivan.range() + " miles.");
        gallons = minivan.fuelNeeded(dist);
        System.out.println("It will need " + gallons + " gallons to go " + dist + " miles.");
        System.out.println();
        System.out.println("Sportscar can carry " + sportscar.passengers + " and have a range of " + sportscar.range() + " miles.");
        gallons = sportscar.fuelNeeded(dist);
        System.out.println("It will need " + gallons + " gallons to go " + dist + " miles.");
    }
}
