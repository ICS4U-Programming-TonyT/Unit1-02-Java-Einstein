import java.util.Scanner;

/**
* Using Einstein famous equation  E = mc2
* Enter the mass of an object.
* Calculates how much energy could be released from that object.
*
* @author  Tony Tran
* @version 1.0
* @since   2025-02-18
*/
final class Einstein {
    /**
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }


    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Getting User Object Mass */
        System.out.println("Enter Mass(kg) of the object:");
        String stringMass = scanner.nextLine();
        try {
            /* Getting User Object Mass */
            final float floatMass = Float.parseFloat(stringMass);
            if (floatMass > 0) {
                /* Calculate Speed of Light */
                final double SPEED = Math.pow(2.998f, 10f);
                /* Calculate Energy Released*/
                final double ENERGY = floatMass * Math.pow(SPEED, 2f);
                System.out.printf("The amount of energy released "
                 + "(Joules) is %.3f \n", ENERGY);
            } else {
                /* Prints if Mass is negative */
                System.out.println("Please enter a positive integer.");
            }
        } catch (NumberFormatException error) {
            /* Prints of Mass is non-integer */
            System.out.println("Enter a number. " + error.getMessage());
        }
    }
}
