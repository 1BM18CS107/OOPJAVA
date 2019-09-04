import java.util.*;
class table
{
static int i=0;
public static void main(String args[])
{	
	System.out.println("Enter the number");
	Scanner s1= new Scanner(System.in);
	int x=s1.nextInt();
	for(i=1;i<11;i++)
	{
		System.out.println(x+ "*" +i+"="+(x*i));
	}
}
}	