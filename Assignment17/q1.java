import java.util.Scanner;

class Number {
  protected int[] numbers;

  public Number(int n) {
    numbers = new int[n];
    inputNumbers();
  }

  private void inputNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter " + numbers.length + " numbers:");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }
  }

  public void displayNumbers() {
    System.out.println("Numbers:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
}

class OddNum extends Number {
  protected int[] oddNumbers;

  public OddNum(Number number) {
    super(number.numbers.length);
    countOddNumbers(number.numbers);
    allocateMemoryForOddNumbers();
    copyOddNumbers(number.numbers);
  }

  private void countOddNumbers(int[] numbers) {
    int count = 0;
    for (int number : numbers) {
      if (number % 2 != 0) {
        count++;
      }
    }
    System.out.println("Count of Odd Numbers: " + count);
  }

  private void allocateMemoryForOddNumbers() {
    oddNumbers = new int[numbers.length];
  }

  private void copyOddNumbers(int[] numbers) {
    int index = 0;
    for (int number : numbers) {
      if (number % 2 != 0) {
        oddNumbers[index] = number;
        index++;
      }
    }
  }

  public void displayOddNumbers() {
    System.out.println("Odd Numbers:");
    for (int number : oddNumbers) {
      if (number != 0) {
        System.out.print(number + " ");
      }
    }
    System.out.println();
  }
}

class PrimeNum extends OddNum {
  private int[] primeNumbers;

  public PrimeNum(OddNum oddNum) {
    super(oddNum);
    countPrimeNumbers(oddNum.oddNumbers);
    allocateMemoryForPrimeNumbers();
    copyPrimeNumbers(oddNum.oddNumbers);
  }

  private void countPrimeNumbers(int[] numbers) {
    int count = 0;
    for (int number : numbers) {
      if (isPrime(number)) {
        count++;
      }
    }
    System.out.println("Count of Prime Numbers: " + count);
  }

  private boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  private void allocateMemoryForPrimeNumbers() {
    primeNumbers = new int[oddNumbers.length];
  }

  private void copyPrimeNumbers(int[] numbers) {
    int index = 0;
    for (int number : numbers) {
      if (isPrime(number)) {
        primeNumbers[index] = number;
        index++;
      }
    }
  }

  public void displayPrimeNumbers() {
    System.out.println("Prime Numbers:");
    for (int number : primeNumbers) {
      if (number != 0) {
        System.out.print(number + " ");
      }
    }
    System.out.println();
  }
}

public class q1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    Number number = new Number(size);

    OddNum oddNum = new OddNum(number);
    System.out.println("\nOdd Numbers Report:");
    oddNum.displayNumbers();
    oddNum.displayOddNumbers();

    PrimeNum primeNum = new PrimeNum(oddNum);
    System.out.println("\nPrime Numbers Report:");
    primeNum.displayNumbers();
    primeNum.displayOddNumbers();
    primeNum.displayPrimeNumbers();
  }
}
