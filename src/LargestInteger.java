import java.util.Scanner;
class LargestInteger
{
	public static void main(String dani[])
	{
	Scanner opo=new Scanner(System.in);
	System.out.print("Enter the 1st Integer: ");
	int a=opo.nextInt();
	System.out.print("Enter the 2nd Integer: ");
	int b=opo.nextInt();
	System.out.print("Enter the third Integer: ");
	int c=opo.nextInt();
	if(a>b && a>c)
	{
		System.out.println("The largest value is: "+a);
		if(b>c)
		System.out.println("2nd largest Integer: "+b);
		else 
		System.out.println("2nd largest Integer: "+c);
	}
	else if(b>a && b>c)
	{
		System.out.print("The largest value is: "+b);
		if(a>c)
		System.out.println("2nd largest Integer: "+a);
		else 
		System.out.println("2nd largest Integer: "+c);
	}
	else if(c>a && c>b)
	{
		System.out.println("The largest value is: "+c);
		if(a>b)
		System.out.println("2nd largest Integer: "+a);
		else 
		System.out.println("2nd largest Integer: "+b);
	}
	
	}//end main method
}//end class method
