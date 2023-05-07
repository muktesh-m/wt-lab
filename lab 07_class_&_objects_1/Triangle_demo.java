import java.util.*;
public class Triangle_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Triangle t1 = new Triangle();
        t1.setDim(a,b,c);
        t1.show();
        
        
    }
}
