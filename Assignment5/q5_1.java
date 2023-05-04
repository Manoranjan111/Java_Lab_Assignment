/*Input Roll No, Name, and marks in five subjects. Calculate total and
percentage of marks. Calculate grade as follows without using If statement:
>= 90% Grade O
>=80% Grade E
>=70% Grade A
>=60% Grade B
>=50% Grade C
>=40% Grade D
<40% Fail
Generate a Mark Sheet. */

package Assignment5;
import java.util.Scanner;
class q5_1{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        String rollNo = input.nextLine();

        System.out.print("Enter Name: "); 
        String name = input.nextLine();

        System.out.print("Enter marks in subject 1: ");
        double subject1 = input.nextDouble();

        System.out.print("Enter marks in subject 2: ");
        double subject2 = input.nextDouble();

        System.out.print("Enter marks in subject 3: ");
        double subject3 = input.nextDouble();

        System.out.print("Enter marks in subject 4: ");
        double subject4 = input.nextDouble();

        System.out.print("Enter marks in subject 5: ");
        double subject5 = input.nextDouble();
        input.close();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100;
        String grade;

        switch ((int) percentage / 10) {
            case 9:
                grade = "O";
                break;
            case 8:
                grade = "E";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            case 4:
                grade = "D";
                break;
            default:
                grade = "Fail";
        }

        System.out.println("\nMark Sheet");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Subject 4: " + subject4);
        System.out.println("Subject 5: " + subject5);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
