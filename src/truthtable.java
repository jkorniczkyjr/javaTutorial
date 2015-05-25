/**
 * Created by Joe on 5/22/2015.
 */
public class truthtable {
    public static void main(String[] args)
        throws  java.io.IOException {

        outerloop:
        for(int i=1; i<10; i++) {
            System.out.print("\nOuter Loop Pass " + i + ", Inner Loop: ");

            for(int j=1; j<10; j++) {
                if(j==5) continue outerloop;
                System.out.print(j);
            }
        }
    }
}
