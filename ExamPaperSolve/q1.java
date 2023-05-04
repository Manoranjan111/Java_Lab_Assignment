import java.util.Scanner;

class Employee {
    String Name, Designation;
    double Salary;

    public Employee(String n, String p, double r) {
        Name = n;
        Designation = p;
        Salary = r;
    }

    void display() {
        System.out.println("Name :" + Name);
        System.out.println("Designation :" + Designation);
        System.out.println("Salary:" + Salary);
    }

}

class Manager extends Employee {
    public Manager(String n, String d, double s) {
        super(n, d, s);

    }
}

class Clerk extends Employee {
    public Clerk(String n, String d, double s) {
        super(n, d, s);

    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of managers:");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of clerks:");
        int n2 = sc.nextInt();

        Employee[] emp = new Employee[n1 + n2];
        // CREATING MANAGER OBJECT
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter the details of " + (i + 1) + "th employee in manager class");
            String s = sc.next();
            String d = sc.next();
            double t = sc.nextDouble();
            emp[i] = new Manager(s, d, t);
        }
        // CREATING CLERK OBJECT
        for (int i = n1; i < n1 + n2; i++) {
            System.out.println("Enter the details of " + (i - n1 + 1) + "th employee in clerk class");
            String s = sc.next();
            String d = sc.next();
            double t = sc.nextDouble();
            emp[i] = new Clerk(s, d, t);
        }

        double sumMgr = 0;
        double sumClerk = 0;
        // CALCULATING AVERAGE SALARY OF MANAGER AND CLERK
        for (int i = 0; i < n1 + n2; i++) {
            if (emp[i] instanceof Manager) {
                sumMgr += emp[i].Salary;
            } else {
                sumClerk += emp[i].Salary;
            }
        }

        double avgMgr = sumMgr / n1;
        double avgClerk = sumClerk / n2;

        System.out.println("Average of manager class: " + avgMgr);
        System.out.println("Average of clerk class: " + avgClerk);
    }
}