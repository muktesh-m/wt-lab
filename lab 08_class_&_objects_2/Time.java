/*Implement a class time having data members hrs and min.
 Include the following methods
 a. void setTime(int,int) is used to initialize the data members
 b. timeAdd(Time) is useed to add two time objects. 
 c. void Show() is used toi display time in hh:mm format
 
 Implement a class Time_demo where the functionality of time class is tested.*/
class Time
{
	int hrs, min;
	
	void setTime(int h,int m){
	
		hrs = h;
		min = m;
	}
	
	Time timeAdd(Time t)
	{
		Time tempt = new Time();
		tempt.hrs = this.hrs + t.hrs;
		tempt.min = this.min + t.min;
		
		if(tempt.min >= 60)
		{
			tempt.hrs = tempt.hrs + (tempt.min / 60);
			tempt.min = tempt.min % 60;
		}
		
		return tempt;
	}
	
	void show()
	{
		System.out.println(hrs+":"+min);
	}
}

