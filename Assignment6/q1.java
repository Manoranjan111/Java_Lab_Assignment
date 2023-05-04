// Q1. Input a number and find the sum of all the digit
import java.util.Scanner;
class q1{
    public static void main(String args[]){
    int sum = 0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Number: ");
     int number = sc.nextInt();
     sc.close();
     int temp = number;
     while(number>0){
        int reminder = number%10;
        number = number/10;
        sum+=reminder;
     } 

     System.out.println("Sum of the "+ temp +" is " + sum);  
    }
}