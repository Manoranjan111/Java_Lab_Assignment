// Q2. in the above program count and print those digits from the result number which are also present in the original number;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        System.out.println("The sum of digits is: " + sum);

        int count = 0;
        int tempSum = sum;

        while (tempSum > 0) {
            int digit = tempSum % 10;
            tempSum /= 10;

            if (String.valueOf(number).contains(String.valueOf(digit))) {
                count++;
                System.out.println("Digit " + digit + " is present in the original number");
            }
        }

        System.out.println("The count of digits present in the original number is: " + count);
    }
}


