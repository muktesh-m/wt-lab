interface Area{
    double findarea();
}
interface Volume{
    double  find_volume();
}
class square implements Area{
    int a;
    square(int a){
        a=this.a;
    }
    public double findarea(){
        return a*a;
    }
}
class cube implements Area,Volume{
    int s;
    cube(int s){
        this.s=s;
    }
    public double find_volume(){
        return s*s*s;
    }
    public double findarea(){
        return 6*s;
    }
}
public class Main{
    public static void main(String[] args)
{
    square s = new square(3);
    cube c = new cube(4);
    System.out.println("Area of Square: "+s.findarea());
    System.out.println("Area of Cube: "+c.findarea());
    System.out.println("Volume of Square: "+c.find_volume());
}

}