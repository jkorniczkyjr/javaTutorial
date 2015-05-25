import java.net.SocketPermission;

/**
 * Created by Joe on 2/27/2015.
 */

// import scanner
import java.util.Scanner;
import java.util.stream.StreamSupport;

// Create Class
class apples {

    // Create Main
    public static void main(String[] args) {
        int x;
        boolean isprime;

        isprime = true;

        for(x=2; x <= 1000/x; x++){
            System.out.println(isprime + "\t" + x + "\t");
            if((97%x) == 0 ) isprime = false;
        }
    }
}
