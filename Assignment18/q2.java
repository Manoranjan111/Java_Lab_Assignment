abstract class Fruit {
    protected String color;
    protected String taste;

    public abstract void display();
}

class Apple extends Fruit {
    public Apple(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public void display() {
        System.out.println("Apple:");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

class Banana extends Fruit {
    public Banana(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public void display() {
        System.out.println("Banana:");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public void display() {
        System.out.println("Orange:");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

class Strawberry extends Fruit {
    public Strawberry(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public void display() {
        System.out.println("Strawberry:");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

public class q2 {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet");
        apple.display();

        Banana banana = new Banana("Yellow", "Sweet");
        banana.display();

        Orange orange = new Orange("Orange", "Tangy");
        orange.display();

        Strawberry strawberry = new Strawberry("Red", "Sweet and Tart");
        strawberry.display();
    }
}
