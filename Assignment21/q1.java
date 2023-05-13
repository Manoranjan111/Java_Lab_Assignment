// package Assignment21;
// Input two numbers as numerator and denominator for division. Write a program
// to show an ArithmeticException if the division is not possible when denominator
// is 0.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            int division = numerator/denominator;
            System.out.println(division);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }  
        catch (Exception e) {
            System.out.println(e);
        }


        sc.close();
    }
}
