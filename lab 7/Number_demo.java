public class Number_demo {
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.setValue(10);
        System.out.println("n1 = " + n1.value);
        System.out.println("Is n1 even? " + n1.isEven());
        System.out.println("Is n1 prime? " + n1.isPrime());
        System.out.println("Is n1 perfect? " + n1.isPerfect());
        System.out.println("Factorial of n1: " + n1.findFactorial(n1.value));

        Number n2 = new Number();
        n2.setValue(7);
        System.out.println("n2 = " + n2.value);
        System.out.println("Is n2 even? " + n2.isEven());
        System.out.println("Is n2 prime? " + n2.isPrime());
        System.out.println("Is n2 perfect? " + n2.isPerfect());
        System.out.println("Factorial of n2: " + n2.findFactorial(n2.value));
    }
}
