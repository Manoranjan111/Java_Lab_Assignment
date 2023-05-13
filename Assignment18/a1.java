
// package Assignment18;
// Create a class Shape having data members length, breadth, height and
// abstract methods such as volume and surfaceArea. Inherit this class into cube,
// cylinder and cuboid classes. Redefine the required methods to calculate and
// display the volume and surface area of each shape.
import java.util.Scanner;

abstract class Shape {
    protected double length;
    protected double breadth;
    protected double height;

    public abstract double volume();

    public abstract double surfaceArea();

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions:");
        System.out.print("Length: ");
        length = scanner.nextDouble();
        System.out.print("Breadth: ");
        breadth = scanner.nextDouble();
        System.out.print("Height: ");
        height = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Dimensions:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }
}

class Cube extends Shape {
    @Override
    public double volume() {
        return length * length * length;
    }

    @Override
    public double surfaceArea() {
        return 6 * length * length;
    }
}

class Cylinder extends Shape {
    @Override
    public double volume() {
        return Math.PI * length * length * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
}

class Cuboid extends Shape {
    @Override
    public double volume() {
        return length * breadth * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * breadth + length * height + breadth * height);
    }
}

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cube");
        Cube cube = new Cube();
        cube.accept();
        System.out.println("\nCube Details:");
        cube.display();
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface Area: " + cube.surfaceArea());

        System.out.println("\nCylinder");
        Cylinder cylinder = new Cylinder();
        cylinder.accept();
        System.out.println("\nCylinder Details:");
        cylinder.display();
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());

        System.out.println("\nCuboid");
        Cuboid cuboid = new Cuboid();
        cuboid.accept();
        System.out.println("\nCuboid Details:");
        cuboid.display();
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface Area: " + cuboid.surfaceArea());
    }
}
