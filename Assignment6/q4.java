// Q4. input a number and check whether it is an Armstrong number or not
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        int number, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        temp = number;
        sc.close();

        while (number > 0) {
            int reminder = number % 10;
            sum += (reminder*reminder*reminder);
            number /= 10;
        }
        
        if (temp == sum) {
            System.out.println(temp+" is Armstrong Number");
        } else {
            System.out.println(temp + " is not a Armstrong Number");
        }
     }
}
