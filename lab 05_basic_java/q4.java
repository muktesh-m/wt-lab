public class q4{
    
    public static void main(String[] args){
  
      double a = 1, b = -7, c = 10; 
      double dis = b*b - 4*a*c; 
      double r1 = (-b + Math.sqrt(dis))/(2*a); 
      double r2 = (-b - Math.sqrt(dis))/(2*a); 
      System.out.println("Root 1 = " + r1); 
      System.out.println("Root 2 = " + r2); 
    }
}