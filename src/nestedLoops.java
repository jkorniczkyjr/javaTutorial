/**
 * Nested Loop Example
 * Uses nested loops to find all
 * prime numbers between 2 and 100
 */
public class nestedLoops {
    public static void main(String[] args)
    throws java.io.IOException {
        for(int i=2; i<=100; i++) {
            System.out.print("Factors of " + i + ": ");
            for(int j=2; j<i; j++)
                if((i%j) == 0) System.out.print(j + " x " + (i/j) + ", ");
            System.out.println();
        }
    }
}
