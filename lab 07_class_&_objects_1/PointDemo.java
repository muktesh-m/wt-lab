import java.util.*;
public class PointDemo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Point p1 = new Point(); 
        Point p2 = new Point(a,b,c); 
        Point p3 = new Point(p2); 
        p1.show(); 
        p2.show(); 
        p3.show(); 

        System.out.println("Distance from origin: " + p2.findDistance());
        System.out.println("Distance from point: " + p2.findDistance(2,3,4)); 
        System.out.println("Distance between p2 and p3: " + p2.findDistance(p1)); 
        System.out.println("p2 equals p3: " + p2.isEqual(p3)); 
    }
}
