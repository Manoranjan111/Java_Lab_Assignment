/*		Date - 22/02/2023
Q1 The basic salary of an employee is 12000.WAP a java to compute Gross and net salary of that employee where HRA = 15% 
of basic salary and DA = 110% of basicsalary, pf=12% of salary

Q2 Write in java to define variables to store your name current age previous age and next perform following operations:
a> to set your name and current age
b> that can calculate and set your new age after the years that is equal to last digit of current age
c> That can calculate and set your new age before the years that is equal to first digit fo current age
d> to show your name along with current, previous and next age

Q3 Write separate programs to calculate area of all the shapes given below the geometric shapes are
a> circle  b> triangle   c>rectangle
define following operations for different figures.
a> set required data	b>calculate area of a shape	c>display the details of that shape.

*/
//Question1

class A1q2 {
    public static void main(String[] args) {
           
    double basicSalary = 12000;
    double hra = 0.15 * basicSalary;
    double da = 1.1 * basicSalary;
    double pf = 0.12 * basicSalary;
    
    double grossSalary = basicSalary + hra + da;
    
    double netSalary = grossSalary - pf;
    
    System.out.println("Gross Salary: " + grossSalary);
    System.out.println("Net Salary: " + netSalary);
    }
    }
    
    //Question2
    class A2q2{
    public static void main(String[] args) {
          
    int currentAge, previousAge, nextAge;
    String name = "Manoranjan";
    currentAge = 27;
    
    int lastDigit = currentAge / 10;
    nextAge = currentAge + lastDigit;
     
    int lastValue = currentAge % 10;
    previousAge = currentAge - lastValue;
    
    
    
    System.out.println("Name: " + name);
    System.out.println("Current Age: " + currentAge);
    System.out.println("Previous Age: " + previousAge);
    System.out.println("Next Age: " + nextAge);
    }
    }
    
    //Question 3.a
    class circle{
    public static void main(String[] args) {
    double area;
    int radius = 5;
    
    area = (3.14*radius*radius);
    System.out.println("Area of a Circle is "+area);
    }
    }
    
    //Question 3.b
    class triangle{
    public static void main(String[] args) {
    double area;
    int base,height;
    base =2;
    height = 5;
    
    area = (1.2*base*height);
    System.out.println("Area of a Triangle is "+area);
    }
    }
    
    //Question 3.c
    class rectangle{
    public static void main(String[] args) {
    double area;
    int width,height;
    width =2;
    height = 5;
    
    area = (width*height);
    System.out.println("Area of a Rectangle is "+area);
    }
    }
    
    
    
    
    