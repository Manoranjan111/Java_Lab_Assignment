// package Assignment19;
// Define an interface “StackOperations” which declares methods for a static stack.
// Define a class “MyStack” which contains an array and top as data members and
// implements the above interface. Initialize the stack using a constructor. Write a
// menu driven program to perform all operations(Push, POP, Peak) on a MyStack
// object.

import java.util.Scanner;

interface StackOperations {
    void push(int element);
    int pop();
    int peek();
}

class MyStack implements StackOperations {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;
        } else {
            int peekedElement = stackArray[top];
            System.out.println("Peeked element: " + peekedElement);
            return peekedElement;
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        MyStack myStack = new MyStack(size);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Peek element");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    myStack.push(element);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.peek();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}

