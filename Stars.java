import java.util.Scanner;

/**
 * Prints a diamond pattern using nested loops.
 *
 * @author Teo Weaver
 * @version v1.0
 * @since 2026-09-27
 */
public class Stars {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width;
        int line;
        int spaces;
        int stars;

        System.out.print("Enter max width for stars: ");
        width = keyboard.nextInt();

        if (width % 2 == 0) {
            width++;
        }

        int half = width / 2 + 1;

        for (line = 1, spaces = width / 2; line <= half; line++, spaces--) {
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (stars = 1; stars <= line * 2 - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (line = half - 1, spaces = 1; line > 0; line--, spaces++) {
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (stars = 1; stars <= line * 2 - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        keyboard.close();
    }
}
