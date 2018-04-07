import java.util.Scanner;

public class AbstractExample {

public static void main(String[] args) {
    Shape shape = null; //can not create object for abstract class
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1 for circle 2. square");
    int option = input.nextInt();
    if(option == 1) {
        shape = new Circle(10,"Red");
    } else {
        shape = new Square(10);
    }
    System.out.println("Area of shape :"+shape.area());
    shape.display();
    
    input.close();
}
}
abstract class Shape { //can not create object for abstract class
	String color;
	
    Shape() {
    	this.color = "Black";
    }

    Shape(String color) {
    	this.color = color;
    }
    abstract double area(); // functionality - child classes

    void display() {
    	System.out.println("Color of shape :"+this.color);
    }
}

class Circle extends Shape {
	double radius;
    public Circle() {
    	super();
    }
    public Circle(double radius) {
    	super();
        this.radius = radius;
    }
    public Circle(double radius, String color) {
    	super(color);
        this.radius = radius;
    }

    @Override
    double area() {
    	return Math.PI * radius * radius;
    }
}

class Square extends Shape {
	double side;
    public Square() {
    	
   	}
   public Square(double side) {
	   this.side = side;
   }
   @Override
   double area() {
	   return side * side;
   }
}