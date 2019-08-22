class variable
{
	private int x,y;
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
}
class hello
{
	public static void main(String args[])
	{
	 variable v1=new variable();
	 v1.setdata(2,3);
	 v1.showdata();
	 variable v2=new variable();
	 v2.setdata(4,5);
	 v2.showdata();
	}
}
