// Define Exceptions VowelException, BlankException, ExitException to restrict
// the input of vowel, space and ‘X’. Write another class TestException which reads
// a character from command line. If it is a vowel, throw VowelException, if it is a
// blank space throw BlankException and for a character ‘X’ throw an
// ExitException and terminate the program. For any other character, display “Valid
// character”.
import java.util.Scanner;

class VowelException extends Exception {
    public VowelException() {
        super("VowelException: Vowel not allowed.");
    }
}

class BlankException extends Exception {
    public BlankException() {
        super("BlankException: Blank space not allowed.");
    }
}

class ExitException extends Exception {
    public ExitException() {
        super("ExitException: Program terminated.");
    }
}

class q1 {

    public static char readCharacter() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            return scanner.nextLine().charAt(0);
        }  
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static boolean isBlank(char ch) {
        return Character.isWhitespace(ch);
    }
    public static void main(String[] args) {
        try {
            char ch = readCharacter();
            
            if (isVowel(ch)) {
                throw new VowelException();
            } else if (isBlank(ch)) {
                throw new BlankException();
            } else if (ch == 'X') {
                throw new ExitException();
            } else {
                System.out.println("Valid character");
            }
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        } catch (BlankException e) {
            System.out.println(e.getMessage());
        } catch (ExitException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    
    
}

