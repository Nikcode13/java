import java.util.Scanner;
class PerfectSquarNumber
{
	public static void main(String arg[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number = ");
    	int num=sc.nextInt();

   	    boolean flag=isPerfectSquare(num);
    	if(flag)
   	    {
			System.out.println(num +" is perfect square number");
	    }
		else
		{
			System.out.println(num +" is not perfect square number");
		}
	}
	static boolean isPerfectSquare(int num)
	{
		double root=Math.sqrt(num);
		if((Math.floor(root)-root)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
    }
}
