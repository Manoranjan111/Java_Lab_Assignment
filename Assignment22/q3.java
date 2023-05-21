// Create a class Student with attributes roll no, name, age and course. Initialize
// values through parameterized constructor. If age of student is not between 15 and
// 21 then generate user-defined exception “InvalidAgeException”. If name
// contains numbers or special characters raise exception “InvalidNameException”.
// Define the two exception classes. 


class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("FewArgumentsException: age is not between 15 and 21.");
    }

}
class InvalidNameException extends Exception{
    public InvalidNameException(){
        super("InvalidNameException: Invalid Name.");
    }

}

class Student{
    int rollNo,age;
    String name,course;

    Student(){
        System.out.println("You are call default Constructor");
    }

    Student(String name,int rollno,int age,String course){
        this.name = name;
        this.rollNo = rollno;
        this.age = age;
        this.course = course;

    }
}

public class q3 {

    public static boolean isCorrectName(String name){
        
        if (name == null || name.isEmpty()) {
            return false;
        }
        
        // Check if the name contains only alphabetic characters
        for (char ch : name.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        
        return true;
    }


    public static boolean isCorrectAge(int age) {
        return (age >15 && age<21);

       
    }
    public static void main(String[] args) {
        Student s = new Student("kanan", 0001, 20, "MCA");

        try {
            String name = s.name;
            int age = s.age;
            
            if (!isCorrectName(name)) {
                throw new InvalidNameException();
            }
            if (!isCorrectAge(age)) {
                throw new InvalidAgeException();
            }

            else {
                System.out.println("Valid Name and Age");
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
