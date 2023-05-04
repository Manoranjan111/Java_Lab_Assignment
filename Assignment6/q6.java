// Q6.input a number and find all the prime factors of that number.
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        int number,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        number = sc.nextInt();
        sc.close();
        System.out.print("Prime factor of "+number+" are: ");
        for (i = 2; i <= (number / 2); i++) {
            if ((number % i) == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
