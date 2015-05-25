/**
 * This program changes the case of letters
 */
public class caseSwap {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice;
        int changes = 0;

        System.out.println("Choose a letter and press <Enter>.");
        System.out.print("Enter a period to stop: ");

        do {
            choice = (char) System.in.read();
            if (choice >= 'a' & choice <= 'z') {
                choice -= 32;
                changes++;
                System.out.print(choice);
            } else if (choice >= 'A' & choice <= 'Z') {
                choice += 32;
                changes++;
                System.out.print(choice);
            }
            System.out.print("\n");
        } while(choice != '.');
        System.out.println(changes + " changes made");
    }
}
