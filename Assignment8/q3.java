// package Assignment8;
// 3)	Input any number and reduce it to single digit by adding all its digits repeatedly.
import java.util.Scanner;
public class q3 {
    static int addDigit(int x) {
        int num, rem, sum = 0;
        num = x;
        if (num == 0) {
            return 0;
        } else {
            
            while (num > 0) {
                rem = num % 10;
                sum += rem;
                num /= 10;
            }
            return sum;
        }
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
                number = addDigit(number);
            }
        }
        
    }
}
