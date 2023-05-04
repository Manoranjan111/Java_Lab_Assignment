// Input two numbers and one operator(+, -, *, /) then calculate the result
// according to the operator selected.

import java.util.Scanner;
public class q5_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        input.close();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator selected");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

