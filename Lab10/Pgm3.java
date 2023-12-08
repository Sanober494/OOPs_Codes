package Lab10;
class Shape{
    private String color="red";
    private boolean filled=true;
    public Shape(){
        color="green";
        filled=true;
    }

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
    return color;
}
public void setColor(String color){
    this.color=color;
}
public boolean isFilled(){
    return filled;
}
public void setFilled(boolean filled){
    this.filled=filled;
}
public String toString(){
    if (filled==true){
    return "A shape with Color: "+color+ " is filled";
}
else{
     return "A shape with Color: "+color+ " is not filled";

}
}}

class Circle extends Shape{
    private double radius=1.0;

    public Circle(){
radius =1.0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
     public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
 public double getArea(){
    return 3.14*radius*radius;
 }
 public double getPerimeter(){
    return 2*3.14*radius;
 }
 public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double length;

    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and setters for width and length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Methods
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}

// Square class
class Square extends Rectangle {
    // Constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    // New methods for Square class
    public double getSide() {
        return getWidth(); // Since width and length are the same for a square
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override methods from Rectangle to ensure that width and length are always the same
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}




public class Pgm3 {
    public static void main(String[] args) {
        // Create a Shape
        Shape shape = new Shape("blue", false);
        System.out.println("Shape: " + shape.toString());

        // Create a Circle
        Circle circle = new Circle(5.0,"red", true);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());

        // Create a Rectangle
        Rectangle rectangle = new Rectangle("yellow", true, 4.0, 6.0);
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());

        // Create a Square
        Square square = new Square("green", false, 3.0);
        System.out.println("Square: " + square.toString());
        System.out.println("Area of the square: " + square.getArea());
        System.out.println("Perimeter of the square: " + square.getPerimeter());

        // Test Square-specific methods
        square.setSide(4.0);
        System.out.println("After setting side to 4.0, Square: " + square.toString());
    }
}
