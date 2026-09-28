import java.util.Scanner;

/**
 * Converts temperatures between Fahrenheit and Celsius.
 *
 * @author Teo Weaver
 * @version v1.0
 * @since 2026-09-27
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double inputTemp;
        double outputTemp;
        char inputUnit;
        String again;

        do {
            System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            inputTemp = keyboard.nextDouble();
            inputUnit = keyboard.next().toUpperCase().charAt(0);

            while (inputUnit != 'C' && inputUnit != 'F') {
                System.out.print("Enter C to convert to F or vice versa: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }

            String inputDisplay;
            if (inputTemp == Math.rint(inputTemp)) {
                inputDisplay = String.format("%.0f", inputTemp);
            } else {
                inputDisplay = String.valueOf(inputTemp);
            }

            if (inputUnit == 'F') {
                outputTemp = (inputTemp - 32) * 5.0 / 9.0;
                System.out.printf("%sF converted is: %.1fC%n", inputDisplay, outputTemp);
            } else {
                outputTemp = inputTemp * 9.0 / 5.0 + 32;
                System.out.printf("%sC converted is: %.1fF%n", inputDisplay, outputTemp);
            }

            System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
            again = keyboard.next();
        } while (again.equalsIgnoreCase("yes"));

        keyboard.close();
    }
}
