// package Assignment8;
// 4)	Multiply all digits of a number till a single digit is found. Zeros should be ignored from the numbers, E.g., if the number is 406, then result should be 8. (4*6),(2*4=8).
import java.util.Scanner;
public class q4 {
    static int multiplyDigit(int x) {
        int number, rem, multiply = 1;
        number = x;
        while (number > 0) {
            rem = number % 10;
            number /= 10;
            if (rem != 0) {

                multiply = (multiply * rem);
                
            }
        }
        return multiply;
    }

    public static void main(String args[]) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        while (true) {
            if (number <=9) {
                System.out.println(number);
                break;
            } else {
                number = multiplyDigit(number);
            }
        }
            
    }
}
