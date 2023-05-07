
abstract class Student {
    int rollNo;
    int regNo;
    public abstract String course();
}


class Kiitian extends Student {

    public String course() {
        return "Computer Science";
    }
}

public class q1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.rollNo = 123;
        k.regNo = 456;
        System.out.println("Student Roll No: " + k.rollNo);
        System.out.println("Student Reg No: " + k.regNo);
        System.out.println("Student Course: " + k.course());
    }
}
