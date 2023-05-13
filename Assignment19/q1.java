import java.util.Scanner;

interface IntOperations {
    boolean isPositive();

    boolean isNegative();

    boolean isEven();

    boolean isOdd();

    boolean isPrime();

    boolean isPalindrome();

    int factorial();

    int sumOfDigits();
}

class MyNumber implements IntOperations {
    private int number;

    public MyNumber() {
        this.number = 0;
    }

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isPrime() {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public boolean isPalindrome() {
        int original = number;
        int reverse = 0;

        while (original != 0) {
            int remainder = original % 10;
            reverse = reverse * 10 + remainder;
            original /= 10;
        }

        return reverse == number;
    }

    public int factorial() {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public int sumOfDigits() {
        int sum = 0;
        int num = Math.abs(number);

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        MyNumber myNumber = new MyNumber(number);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check if the number is positive");
            System.out.println("2. Check if the number is negative");
            System.out.println("3. Check if the number is even");
            System.out.println("4. Check if the number is odd");
            System.out.println("5. Check if the number is prime");
            System.out.println("6. Check if the number is a palindrome");
            System.out.println("7. Calculate the factorial of the number");
            System.out.println("8. Calculate the sum of digits");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Is positive: " + myNumber.isPositive());
                    break;
                case 2:
                    System.out.println("Is negative: " + myNumber.isNegative());
                    break;
                case 3:
                    System.out.println("Is even: " + myNumber.isEven());
                    break;
                case 4:
                    System.out.println("Is odd: " + myNumber.isOdd());
                    break;
                case 5:
                    System.out.println("Is prime: " + myNumber.isPrime());
                    break;
                case 6:
                    System.out.println("Is palindrome: " + myNumber.isPalindrome());
                    break;
                case 7:
                    System.out.println("Factorial: " + myNumber.factorial());
                    break;
                case 8:
                    System.out.println("Sum of digits: " + myNumber.sumOfDigits());
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}
