/**
 * Here is a sample queue program
 */
class Queue {
    char q[]; // This array holds the queue
    int putloc, getloc; // The put and get indices

    Queue(int size) {
        q = new char[size]; // Allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Get a character from the queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue class
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        //  Put some numbers into bigQ
        for(i=0; i<26; i++)
            bigQ.put((char) ('A' + i));

        // Retrieve and display elements from bigQ
        System.out.print("Contents of bigQ");
        for(i=0; i<26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i<5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' -i));
            System.out.println();
        }
        System.out.println();

        // More errors on smallQ
        System.out.println("Contents of smallQ");
        for(i=0; i<5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
