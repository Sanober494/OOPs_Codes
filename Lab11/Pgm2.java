/*Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns
void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw()
method to draw their respective shapes.*/
package Lab11;

interface Drawable{
void draw();
}
class Circle implements Drawable{

    public void draw(){
System.out.println("Drawing a circle");
System.out.println("O");
    }}

class Rectangle implements Drawable{

    public void draw(){
System.out.println("Drawing a rectangle");
System.out.println(" _");
System.out.println("| |");
System.out.println("| |");
System.out.println("--");
    }
}
class Triangle implements Drawable{

    public void draw(){
System.out.println("Drawing a Triangle");
System.out.println( " / \\ " );
System.out.println("  --");

    }

}
public class Pgm2 {
    public static void main(String Args[]){
        Drawable Circle = new Circle();
        Circle.draw();
        Drawable rectangle = new Rectangle();
        rectangle.draw();
        Drawable triangle = new Triangle();
        triangle.draw();
        
    }
}
