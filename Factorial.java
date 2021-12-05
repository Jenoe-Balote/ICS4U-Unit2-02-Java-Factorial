/*
* This is a program that calculates factorials via recursion.
*
* @author  Jenoe Balote
* @version 1.0
* @since   2021-12-03
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This is the Factorial program.
*/
final class Factorial {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The factorial() function.
    *
    * @param input is the user-inputted int.
    * @return the factorial
    */
    public static int factorial(final int input) {

        final int returnValue;

        if (input == 0) {
            returnValue = 1;
        } else {
            returnValue = input * factorial(input - 1);
        }

        return returnValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final int input;
        final String inputString;
        final int factorial;

        try {

            System.out.println("This program calculates factorials.");
            System.out.print("Enter an integer: ");

            inputString = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();

            input = Integer.valueOf(inputString);

            factorial = factorial(input);
            System.out.println(input + "! = " + factorial);

        } catch (IOException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }

        System.out.println("\nDone.");
    }
}
