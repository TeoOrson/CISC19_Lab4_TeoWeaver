import java.util.Scanner;

/**
 * Tests whether words have the required reverse-word property.
 *
 * @author Teo Weaver
 * @version v1.0
 * @since 2026-09-27
 */
public class ReverseWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter words separated by a space ending with the word quit: ");
            String word = keyboard.next().toLowerCase();

            while (!word.equals("quit")) {
                String combined = "";
                String flipped = "";

                char firstLetter = word.charAt(0);
                String remaining = word.substring(1);
                combined = remaining + firstLetter;

                for (int i = combined.length() - 1; i >= 0; i--) {
                    flipped += combined.charAt(i);
                }

                if (flipped.equals(word)) {
                    System.out.println(word + " works");
                } else {
                    System.out.println(word + " does not work");
                }

                word = keyboard.next().toLowerCase();
            }

            System.out.print("Enter yes to process another line? ");
            again = keyboard.next();
        } while (again.equalsIgnoreCase("yes"));

        keyboard.close();
    }
}
