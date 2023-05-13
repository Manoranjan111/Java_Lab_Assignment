// package Assignment22;
// Define Exceptions VowelException, BlankException, ExitException to restrict
// the input of vowel, space and ‘X’. Write another class TestException which reads
// a character from command line. If it is a vowel, throw VowelException, if it is a
// blank space throw BlankException and for a character ‘X’ throw an
// ExitException and terminate the program. For any other character, display “Valid
// character”.
import java.util.Scanner;

public class q1 {

    class VowelException extends Exception {
        public VowelException() {
            super("Invalid input: Vowels not allowed!");
        }

        public VowelException(String message) {
            super(message);
        }
    }

    public class Main {
        public static void checkInput(String input) throws VowelException {
            if (input.matches(".*[AEIOUaeiou].*")) {
                throw new VowelException();
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            try {
                checkInput(input);
                System.out.println("Valid input!");
            } catch (VowelException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

}
