/*
Implement a class pointer having data members x and y. 
Include the following constructors:
point() 
point(int, int) 
point(point) 
findDistance()-> distance from origin(0,0) 
findDistance(int x1,y1)-> distance from origin(x1,y1)
findDistance(point p1)-> distance from p1 
void show()-> display the data members x and y. 
Also implement a class pointdemo where the functionality is tested.
*/
public class Point {
    private int x,y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
   
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public double findDistance() {
        return Math.sqrt(x*x + y*y);
    }
    
    public double findDistance(int x1, int y1) {
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
    
    public double findDistance(Point p1) {
        return Math.sqrt((x-p1.x)*(x-p1.x) + (y-p1.y)*(y-p1.y));
    }
    
    public void show() {
        System.out.println("x = " + x + ", y = " + y);
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(p2);
        System.out.println("Distance of p1 from origin: " + p1.findDistance());
        System.out.println("Distance of p2 from origin: " + p2.findDistance());
        System.out.println("Distance of p3 from origin: " + p3.findDistance());
        System.out.println("Distance of p2 from point (1, 1): " + p2.findDistance(1, 1));
        System.out.println("Distance of p2 from p1: " + p2.findDistance(p1));
        p1.show();
        p2.show();
        p3.show();
    }
}
