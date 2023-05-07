class Shape {
    int width;
    int height;

    public Shape(int w, int h) {
        width = w;
        height = h;
    }
}

class Rectangle extends Shape {
    int area;

    public Rectangle(int w, int h) {
        super(w, h); // call the base class constructor using super
        area = width * height;
    }

    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }
}

public class q6 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        rect.display();
    }
}
