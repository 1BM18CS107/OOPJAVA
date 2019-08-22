class variable
{
	int x,y;
	public void setdata(int a,int b)
	{
	  x=a;
	  y=b;
	}
	public void showdata()
	{
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	}
	void distance(variable p3)
{
	 double ans=Math.sqrt((p3.x-x)*(p3.x-x)+(p3.y-y)*(p3.y-y));
	 System.out.println("The distance is"+ ans);
}
	

}
class dist
{
	public static void main(String args[])
	{
	 variable v1=new variable();
	 v1.setdata(2,3);
	 v1.showdata();
	 variable v2=new variable();
	 v2.setdata(4,5);
	 v2.showdata();
	 v1.distance(v2);
	 }
}
