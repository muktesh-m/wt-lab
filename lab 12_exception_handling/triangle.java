class NoTriangleFormException{
    public NoTriangleFormException(){
    System.out.println("Triangle Cannot be formed");
    }

}
public class triangle{
   public int p,q,r;
   public triangle(int p,int q,int r)throws(NoTriangleFormException e){
    if(((p+q)>r)&&((q+r)>p)&&((p+r)>q)){
        this.p = p;
        this.q = q;
        this.r = r;
    }
    else{
        throw NoTriangleFormException();
        }
   }
   int find_Area(){}
   int find_Perimeter(){}


}