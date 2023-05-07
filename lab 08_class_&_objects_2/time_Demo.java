public class time_Demo
{
	public static void main(String args[])
	{
		Time t1 = new Time();
		t1.setTime(2,45);
		
		Time t2 = new Time();
		t2.setTime(3,30);
		
		Time t3 = new Time();
		t3 = t1.timeAdd(t2);
		
		System.out.println("t1 time: ");
		t1.show();
		System.out.println("t2 time: ");
		t2.show();
		System.out.println("Sum of t1 and t2 time: ");
		t3.show();
	}
}