// Input a number and display it in words. Ex- 5012(Five Zero One Two). in java
import java.util.Scanner;

public class q5_3 {
    
    static int rev(int num) {
        int a = num, rev = 0, rem;
        while (a > 0) {
            rem = a % 10;
            rev = (rev * 10) + rem;
            a /= 10;

        }
        return rev;

    }
    public static void main(String args[]) {
        
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = rev(number);
        while (reverse > 0) {
            int lastDigit = (reverse % 10);
            reverse /= 10;

            switch (lastDigit) {
                case 9:
                    System.out.print("Nine ");
                    break;
                case 8:
                System.out.print("Eight ");
                    break;
                case 7:
                System.out.print("Seven ");
                    break;
                case 6:
                System.out.print("Six ");
                    break;
                case 5:
                System.out.print("Five ");
                    break;
                case 4:
                System.out.print("Four ");
                    break;
                case 3:
                System.out.print("Three ");
                    break;
                case 2:
                System.out.print("Two ");
                    break;
                case 1:
                System.out.print("One ");
                    break;
                case 0:
                System.out.print("Zero ");
                    break;
                default:
                System.out.print("Something Went Wrong");
            }
        }
    }
} 
