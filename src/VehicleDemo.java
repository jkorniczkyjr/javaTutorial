/**
 * A program that uses the Vehicle class
 *
 * Call this file VehicleDemo.java
 */
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // This is a constructor for Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

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
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

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
