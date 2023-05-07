
interface Employee {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}
abstract class Manager implements Employee {
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }
    public double deductions(double basic) {
        return 0.12 * basic;
    }
}
class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}
public class q3 {
    public static void main(String[] args) {
        Substaff ss = new Substaff();
        double basic = 50000.0; // This can be replaced with user input
        System.out.println("Earnings: " + ss.earnings(basic));
        System.out.println("Deductions: " + ss.deductions(basic));
        System.out.println("Bonus: " + ss.bonus(basic));
    }
}
