// package Assignment8;
// Q1 a) 1+1/2+1/3+1/4+1/5+…+1/n find the sum of this series
import java.util.Scanner;
public class q1a{
    public static void main(String args[]) {
        double number,temp = 1,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextDouble();
        while (temp <= number) {
            System.out.print(1 + "/" + temp);
            if(temp<number){System.out.print("+");}
            sum += (1/temp);
            temp += 1;

        }
        System.out.println("\n");
        System.out.println("Sum = " + sum);
    }
}
