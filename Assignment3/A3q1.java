/*24/02/2023
Q1 Convert the temperature reading given in degree fahernheit to degree celsius using
the given formula:c=(5/9)*(F-32)
Test these values in degree fahernheit using command line argument 68,150,212,0,-22,-200
Q2. Calculate the volume and surface are3a of a shpere using the following formula:
v = 4/3πrrr	A = 4πrr
Test the program using command line argument for the given radius:1,6,12,0.2
Q3. WAP to java to find the smaller and greater number among two numbers read from command line
argument using ternary operator.

Q4. Write a program to show the use of ++,-- and different assignment operators.

Q5. WAP to observe the difference between - and ~ operator	

*/
class A3q1{
    public static void main(String args[]){
    int faherenheit = Integer.parseInt(args[0]);
    int celsius = (5/9)*(faherenheit - 32);
    System.out.println("Temprature in Faherenheit = "+faherenheit);
    System.out.println("Temprature in Celsius= "+celsius);
    }
    }
    
    class A3q2{
    public static void main(String args[]){
    double radius = Double.parseDouble(args[0]);
    double volume = (4/3)*(3.14*radius*radius*radius);
    double area = 4*3.14*radius*radius;
    System.out.println("Volume = "+volume);
    System.out.println("Area = "+area);
    }
    }
    
    class A3q3{
    public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int x = a>b?100:200;
    System.out.println("a= " +a+ "\tB= " +b+ "\tX= "+x);
    }
    }
    
    
    class A3q4{
    public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    System.out.println("Value of A= "+a);
    System.out.println("Value of A after pre increment= "+(++a));
    System.out.println("Value of A After Post increment= "+(a++));
    
    System.out.println("Value of B= "+a);
    System.out.println("Value of B after pre decrement = "+(++a));
    System.out.println("Value of B After Post decrement = "+(a++));
    }
    }
    
    class A3q5{
    public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    
    System.out.println("Orignal value of a= "+a);
    System.out.println("using operator - = "+(-a));
    System.out.println("Using Operator ~ = "+(~a));
    
    }
    }
    
    
    