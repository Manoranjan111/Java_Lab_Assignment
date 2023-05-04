// package Assignment8;
// d)	1+ 2^3+ 3^3+ ……n^3.
import java.util.Scanner;
public class q1d {
   public static void main(String args[]) {
    double number,sum = 1,temp = 1;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number");
       number = sc.nextInt();
       sc.close();
       System.out.print("1+ ");
       while (number > 0) {
           System.out.print((int) temp + "^3");
           if (number > 1) {
               System.out.print(" + ");
           }
           sum += (temp * temp * temp);
           number--;
           temp++;
       }
       System.out.println();
       System.out.println("Sum = " + sum);
   } 
}
