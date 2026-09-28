import java.util.Random;

/**
 * Generates three random values and prints a bar chart based on hundreds.
 *
 * @author Teo Weaver
 * @version v1.0
 * @since 2026-09-27
 */
public class BarChartMethods {
    public static void main(String[] args) {
        int first;
        int second;
        int third;

        Random generator = new Random();
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println();

        System.out.println("NUMBER BAR CHART");

        System.out.print("Number 1: ");
        printStars(first);

        System.out.print("Number 2: ");
        printStars(second);

        System.out.print("Number 3: ");
        printStars(third);
    }

    /**
     * Accepts int input and prints one star for each hundred.
     *
     * @param input value used to determine number of stars
     */
    public static void printStars(int input) {
        if (input < 100) {
            System.out.print("<100 no stars");
        } else {
            for (int i = 0; i < input / 100; i++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
