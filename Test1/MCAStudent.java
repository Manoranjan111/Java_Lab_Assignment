
import java.util.Scanner;

class MCA {
    int rollNo;
    String name;
    double marks1, marks2, marks3;

    MCA(int rollNo, String name, double marks1, double marks2, double marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll NO: " + rollNo);
    }

    public double getTotalMarks() {
        return (marks1 + marks2 + marks3);
    }

}

public class MCAStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Student: ");
        int n = sc.nextInt();
        MCA[] arr = new MCA[n];

        for (int i = 0; i < arr.length; i++) {
            int rollNo;
            String name;
            double marks1, marks2, marks3;
            System.out.print("Enter" + i + "student Name: ");
            name = sc.next();
            System.out.print("Enter" + i + "student Roll No: ");
            rollNo = sc.nextInt();
            System.out.print("Enter" + i + "student Marks1: ");
            marks1 = sc.nextDouble();
            System.out.print("Enter" + i + "student Marks2: ");
            marks2 = sc.nextDouble();
            System.out.print("Enter" + i + "student Marks3: ");
            marks3 = sc.nextDouble();

            arr[i] = new MCA(rollNo, name, marks1, marks2, marks3);

        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getTotalMarks() < arr[j + 1].getTotalMarks()) {
                    MCA temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        System.out.println("Print Student Detaials");
        for (int i = 0; i < arr.length; i++) {
            arr[i].getDetails();
            double marks = arr[i].getTotalMarks();
            System.out.println(marks);
            System.out.println();

        }

    }
}
