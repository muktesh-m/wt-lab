import java.util.*;
public class Number_demo {
    public static void main(String[] args) {
        Number n1 = new Number();
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        n1.setValue(n);
        System.out.println("n1 = " + n1.value);
        System.out.println("Is n1 even? " + n1.isEven());
        System.out.println("Is n1 prime? " + n1.isPrime());
        System.out.println("Is n1 perfect? " + n1.isPerfect());
        System.out.println("Factorial of n1: " + n1.findFactorial(n1.value));

       
    }
}
