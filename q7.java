// Q7. print a Fibonacci series up to nth term
import java.util.Scanner;

public class q7 {
    public static void main(String args[]) {
        int firstNumber = 0,secondNumber = 1,nextNumber,term;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci series up to: ");
        term = sc.nextInt();
        sc.close();
        System.out.println("Enter the Fibonacci series up to: "+term +"is");
        System.out.print("0 1 ");
        for (int i = 3; i <= term; i++) {
            
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            
            System.out.print(nextNumber + " ");
        }
    }
    
}
