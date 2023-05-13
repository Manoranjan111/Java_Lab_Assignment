
import java.util.Scanner;

// Create a class called Account having data members acct_no, acct_type,
// customer_name and acct_balance. Write a java program to input data for five
// customers and print the details of customer having maximum balance in the
// account

class Account {
    int acct_no;
    String acct_type;
    String customer_name;
    double acct_balance;

    Account(int no, String type, String name, double balance) {
        acct_no = no;
        acct_type = type;
        customer_name = name;
        acct_balance = balance;
    }

    void display() {
        System.out.printf("Account Number: %d\n", acct_no);
        System.out.printf("Account Type: %s\n", acct_type);
        System.out.printf("Customer Name: %s\n", customer_name);
        System.out.printf("Account Balance: %.2f\n", acct_balance);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[5];

        for (int i = 0; i < accounts.length; i++) {
            System.out.printf("Enter details for Account %d:\n", i + 1);
            System.out.print("Account Number: ");
            int acct_no = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Account Type: ");
            String acct_type = scanner.nextLine();

            System.out.print("Customer Name: ");
            String customer_name = scanner.nextLine();

            System.out.print("Account Balance: ");
            double acct_balance = scanner.nextDouble();

            accounts[i] = new Account(acct_no, acct_type, customer_name, acct_balance);
            System.out.println();
        }

        // find the account with the maximum balance
        Account max_balance_account = accounts[0];
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].acct_balance > max_balance_account.acct_balance) {
                max_balance_account = accounts[i];
            }
        }

        System.out.println("Details of Customer with Maximum Balance:");
        System.out.println("-----------------------------------------");
        max_balance_account.display();
    }
}