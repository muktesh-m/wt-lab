public class triangle_demo{
    public static void main(String[] args){
        try{
            triangle t1 = new triangle(3,4,5);            
        }catch(NoTriangleFormException e){
            System.out.println(e);
        }
        t1.find_Area();
        t1.find_Perimeter();
    }
}