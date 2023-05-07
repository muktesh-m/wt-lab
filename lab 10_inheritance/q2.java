class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor is called");
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor is called");
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor is called");
    }
}

public class q2 {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(10.0, 20.0, 30.0, 5.0);
    }
}
