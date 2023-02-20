public class Number {
    public int value;
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public boolean isEven() {
        return value % 2 == 0;
    }
    
    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isPerfect() {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                sum += i;
                if (i != value / i) {
                    sum += value / i;
                }
            }
        }
        return (value > 1 && sum == value);
    }
    
    public int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}

