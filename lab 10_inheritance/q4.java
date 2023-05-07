class Shape {
    double area;
    void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;
    void calculateArea() {
        area = 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    void calculateArea() {
        area = length * width;
    }
}

public class q4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0;
        circle.calculateArea();
        circle.showArea();
        
        Rectangle rectangle = new Rectangle();
        rectangle.length = 4.0;
        rectangle.width = 6.0;
        rectangle.calculateArea();
        rectangle.showArea();
    }
}
