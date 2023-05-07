public class Triangle {
    private double a, b, c;
    
    public void setDim(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean isTriangle() {
        return (a + b > c && b + c > a && a + c > b);
    }
    
    public double findArea() {
        if (!isTriangle()) {
            System.out.println("Error: The given sides cannot form a triangle.");
            return 0;
        }
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double findPerimeter() {
        if (!isTriangle()) {
            System.out.println("Error: The given sides cannot form a triangle.");
            return 0;
        }
        return a + b + c;
    }
    
    public void show() {
        if (!isTriangle()) {
            System.out.println("Error: The given sides cannot form a triangle.");
            return;
        }
        System.out.println("Sides: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Area: " + findArea());
        System.out.println("Perimeter: " + findPerimeter());
    }
}
