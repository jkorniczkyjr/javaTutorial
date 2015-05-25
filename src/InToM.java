/**
 * Created by Joe on 3/1/2015.
 */
public class InToM {
    public static void main(String[] args) {
        double inch, meter;
        int counter  = 0;

        for(inch = 1; inch <= 144; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " inches is " +
                                meter + " meters.");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
