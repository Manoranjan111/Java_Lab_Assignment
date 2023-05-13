import java.util.Scanner;

class Person {
    protected String name;
    protected int id;
    protected int yearOfJoin;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        System.out.print("Enter year of joining: ");
        yearOfJoin = scanner.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Year of Joining: " + yearOfJoin);
    }
}

class Teacher extends Person {
    private String subjectTaught;
    private double basicSalary;
    private double da;
    private double hra;
    private double epf;

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject taught: ");
        subjectTaught = scanner.nextLine();
        System.out.print("Enter basic salary per month: ");
        basicSalary = scanner.nextDouble();
        calculateAllowances();
        calculateEpf();
    }

    private void calculateAllowances() {
        da = basicSalary * 1.10; // 110% of basic salary
        hra = basicSalary * 0.15; // 15% of basic salary
    }

    private void calculateEpf() {
        epf = basicSalary * 0.12; // 12% of basic salary
    }

    public void display() {
        super.display();
        System.out.println("Subject Taught: " + subjectTaught);
        System.out.println("Basic Salary per Month: $" + basicSalary);
        System.out.println("Total Net Salary per Year: $" + calculateNetSalary());
        System.out.println("Total EPF Deposited per Year: $" + epf);
    }

    private double calculateNetSalary() {
        double annualBasicSalary = basicSalary * 12;
        double annualAllowances = (da + hra) * 12;
        return annualBasicSalary + annualAllowances;
    }
}

class Student extends Person {
    private String course;
    private int duration;
    private double feesPerSemester;

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course offered: ");
        course = scanner.nextLine();
        System.out.print("Enter duration of the course (in years): ");
        duration = scanner.nextInt();
        System.out.print("Enter fees per semester: ");
        feesPerSemester = scanner.nextDouble();
    }

    public void display() {
        super.display();
        System.out.println("Course Offered: " + course);
        System.out.println("Total Fees to be Paid: $" + calculateTotalFees());
    }

    private double calculateTotalFees() {
        int totalSemesters = duration * 2; // Assuming 2 semesters per year
        return feesPerSemester * totalSemesters;
    }
}

public class q2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("Enter teacher details:");
        teacher.input();
        System.out.println("\nAnnual Report for Teacher:");
        teacher.display();

        System.out.println("-----------------------------");

        Student student = new Student();
        System.out.println("Enter student details:");
        student.input();
        System.out.println("\nStudent Details:");
        student.display();
    }
}

