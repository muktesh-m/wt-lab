class Rational{
 int num, denum;

void setRational(int x,int y){
	num=x;
	denum=y;
}
boolean equal(Rational r){
	if (r.num==num && r.denum==denum)
		return true;
	else 
	if(num/denum==r.num/r.denum)
	return true;
	else
		return false;
}
void show(){
 System.out.println("The rational number is: "+num+ "/" +denum);
}
}
