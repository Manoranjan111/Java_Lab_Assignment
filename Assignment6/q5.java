
// Q5. input 10 numbers and find out the largest and the smallest number without using array.
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}
