/*
						ASSIGNMENT1(17/02/2023)
Q1. Write a Simple Java Program to print three characteristics of Object Oriented PRogramming like Java.
Q2. Write a Java program to print a message Welcome (Your name here) to Java Programming where your name is stored in a variable
Q3. Write a program to declare different variavles of different data types used in Java and also show the value that you haave assigned.
Q4. Declare two integer variables then apply +,-,*,/,% operations.Also declare suitable variable to store the result.
manassipu0000@gmail.com
Manas@123
*/
class Main {
    public static void main(String args[]) {
      int x = 30;
      int a = 20;
      int b = 10;
      float y = 2.5f;
      char char1 = 'a';
      String name = "Manoranjan";
  
      System.out.println("\nQuestion 1");
      System.out.println("Three Characteristics is \n1.Encapsulation\n2.Abstraction\n3.Classes and Objects");
  
      System.out.println("\nQuestion 2");
      System.out.println("Welcome " + name);
  
      System.out.println("\nQuestion 3");
      System.out.println(x);
      System.out.println(y);
      System.out.println(char1);
  
      System.out.println("\nQuestion 4");
      System.out.println(a + b);
      System.out.println(a - b);
      System.out.println(a * b);
      System.out.println(a / b);
  
    }
  }