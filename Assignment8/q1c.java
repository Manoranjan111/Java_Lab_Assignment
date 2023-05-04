// package Assignment8;
   // Q1 c) 1+1/2! +1/3! +…...+ 1/n! find the sum.
import java.util.Scanner;
public class q1c {
    static double factorial(double x) {
        if (x == 1) {
            return 1;
        } else {
            return factorial(x - 1);
        }
    }

    public static void main(String args[]) {
        double number, sum = 0, temp = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextDouble();
        sc.close();
        while (number > 0) {
            System.out.print(1 + "/" + (int)temp + "!");
            if (number > 1) {
                System.out.print(" + ");
            }
            sum = sum + (1 / (factorial(temp)));
            temp++;
            number--;
        }
        System.out.println();
        System.out.print("Sum = "+sum);
    }
}
