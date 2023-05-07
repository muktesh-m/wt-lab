class money
{
	int rps, pai;
	
	void setMoney(int r,int p){
	
		rps= r;
		pai = p;
	}
	
	money addMoney(money m)
	{
		money temp = new money();
		temp.rps = this.rps + m.rps;
		temp.pai = this.pai + m.pai;
		
		if(temp.rps >= 100)
		{
			temp.rps = temp.rps + (temp.pai / 100);
			temp.pai = temp.pai % 100;
		}
		
		return temp;
	}
	
	void show()
	{
		System.out.println(rps+"."+pai);
	}
}

