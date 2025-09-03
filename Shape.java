// 1. Create an abstract class named Shape
public abstract class Shape {
    // 2. Instance variable for area
    protected double area;

    // 3. Abstract method to calculate area
    public abstract void calculateArea();

    // Method to get the area
    public double getArea() {
        return area;
    }
}

// 4. Create the Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 5. Implement the calculateArea() method for Circle
    @Override
    public void calculateArea() {
        // Area of a circle is π * r^2
        this.area = Math.PI * radius * radius;
    }
}

// 4. Create the Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 5. Implement the calculateArea() method for Rectangle
    @Override
    public void calculateArea() {
        // Area of a rectangle is length * width
        this.area = length * width;
    }
}

class Main {
    public static void main(String[] args) {
        // 6. Create a Circle object and a Rectangle object
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);

        // 7. Call the calculateArea() method on each object
        circle.calculateArea();
        rectangle.calculateArea();

        // Print the calculated areas
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}