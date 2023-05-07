public class Distance_demo
{
    
    public static void main (String[] args) 
    {
        Distance ob1= new Distance();
        ob1.setDistance(2,57);
        Distance ob2=new Distance();
        ob2.setDistance(3,79);
        ob1.add(ob2);
        ob1.show();
    }
}