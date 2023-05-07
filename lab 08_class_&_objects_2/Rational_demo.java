public class Rational_demo{
	public static void main(String[] args){
	Rational ob1=new Rational();
	ob1.setRational(1,2);
	Rational ob2=new Rational();
	ob2.setRational(50,100);
	boolean ans=ob1.equal(ob2);
	if (ans== true){
		System.out.println("The numbers are equal");
  		ob1.show();
	}
	else
	{
	    ob1.show();
		ob2.show();
	}
}
}