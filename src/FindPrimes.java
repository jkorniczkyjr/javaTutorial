/**
 * Created by Joe on 3/1/2015.
 *
 * This is a program that finds all prime numbers
 * between 2 and 1000
 */

public class FindPrimes {
    public static void main(String[] args) {
        int divisor, number, counter = 0;
        boolean isprime;

        for(number = 2; number < 1000; number++) {
            isprime = true;

            for(divisor = 2; divisor <= number / divisor; divisor++)
                if((number % divisor) == 0) isprime = false;

            if(isprime) {
                System.out.print(number + ", ");
            }

            if(number%100 == 0)
                System.out.println();
       }
    }
}
/**
class prime {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for(i=2; i < 100; i++) {
            isprime = true;

            // see if the number is evenly divisible
            for(j=2; j <= i/j; j++)
                // if it is, then it is not prime
                if((i%j) == 0) isprime = false;

            if(isprime)
                System.out.println(i + " is prime.");
        }
    }
}
 */

