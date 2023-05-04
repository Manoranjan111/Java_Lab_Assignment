// Q3. input a number and check whether it is palindrome or not.
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        int number, reverse = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        temp = number;
        sc.close();

        while (number > 0) {
            int reminder = number % 10;
            reverse = (reverse * 10) + reminder;
            number /= 10;
        }
        
        if (temp == reverse) {
            System.out.println(temp+" is palindrome Number");
        } else {
            System.out.println(temp + " is not a palindrome Number");
        }
        
    
        
    }
}
