public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(); // default constructor
        Point p2 = new Point(1, 2, 3); // parameterized constructor
        Point p3 = new Point(p2); // copy constructor

        p1.show(); // output: (0, 0, 0)
        p2.show(); // output: (1, 2, 3)
        p3.show(); // output: (1, 2, 3)

        System.out.println("Distance from origin: " + p2.findDistance()); // output: 3.7416575
        System.out.println("Distance from (4, 5, 6): " + p2.findDistance(4, 5, 6)); // output: 5.196152
        System.out.println("Distance between p2 and p3: " + p2.findDistance(p3)); // output: 0.0
        System.out.println("p2 equals p3: " + p2.isEqual(p3)); // output: true
    }
}
