import java.util.Scanner;

class Vehicle {
    private String brand;
    private String countryOfOrigin;
    protected double basePrice;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter brand:");
        brand = scanner.nextLine();
        System.out.println("Enter country of origin:");
        countryOfOrigin = scanner.nextLine();
        System.out.println("Enter base price:");
        basePrice = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Base Price: $" + basePrice);
    }
}

class Car extends Vehicle {
    private String model;
    private double speed;
    private double marketPrice;

    public void read() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model:");
        model = scanner.nextLine();
        System.out.println("Enter speed (km/hr):");
        speed = scanner.nextDouble();
        calculateMarketPrice();
    }

    private void calculateMarketPrice() {
        if (speed > 80) {
            marketPrice = basePrice * 1.15; // 15% more than base price
        } else {
            marketPrice = basePrice * 0.95; // 5% less than base price
        }
    }

    public void show() {
        super.display();
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/hr");
        System.out.println("Market Price: $" + marketPrice);
    }
}

public class q1 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Enter car details:");
        car.read();
        System.out.println("Car Details:");
        car.show();
    }
}
