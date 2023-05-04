// package Assignment8;
// Q1 b) 1 + 1/x + 1/x^2 + 1/x^3 + …...+1/x^n find the sum of this series
import java.lang.Math;
import java.util.Scanner;

public class q1b {
    public static double sumOfSeries(double n) {
        double sum = 0.0;
        System.out.print("1 + ");
        for (int i = 0; i < n; i++) {
            System.out.print(1 + "/" + 2 + "^" + (i + 1));
            if (i < n + 1) {
                System.out.print(" + ");
            }
            sum += 1 / Math.pow(2, i);
        }
        return sum;
    }
    
    public static void main(String args[]) {
        double number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextDouble();
        sc.close(); 
        
        System.out.println("Sum = "+ sumOfSeries(number));
    }
}
