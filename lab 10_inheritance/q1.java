import java.util.Scanner;

class Plastic {
    protected double area; // in square feet
    protected double volume; // in cubic feet
    
    public Plastic(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double getCost() {
        return 0; // To be overridden in subclasses
    }
}

class Sheet extends Plastic {
    private static final double COST_PER_SQUARE_FT = 40.0;
    
    public Sheet(double area) {
        super(area, 0);
    }
    
    @Override
    public double getCost() {
        return area * COST_PER_SQUARE_FT;
    }
}

class Box extends Plastic {
    private static final double COST_PER_CUBIC_FT = 60.0;
    
    public Box(double area, double height) {
        super(area, area * height);
    }
    
    @Override
    public double getCost() {
        return volume * COST_PER_CUBIC_FT;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape (sheet or box):");
        String shape = scanner.nextLine();
        if (shape.equalsIgnoreCase("sheet")) {
            System.out.println("Enter the area of the sheet in square feet:");
            double area = scanner.nextDouble();
            Sheet sheet = new Sheet(area);
            System.out.println("The cost of the sheet is Rs " + sheet.getCost());
        } else if (shape.equalsIgnoreCase("box")) {
            System.out.println("Enter the area of the base of the box in square feet:");
            double area = scanner.nextDouble();
            System.out.println("Enter the height of the box in feet:");
            double height = scanner.nextDouble();
            Box box = new Box(area, height);
            System.out.println("The cost of the box is Rs " + box.getCost());
        } else {
            System.out.println("Invalid shape entered.");
        }
    }
}
