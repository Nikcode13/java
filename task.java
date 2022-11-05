import java.util.Scanner;
class demo
{
	int i;
	void fact(int n)
	{
		int fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fcat*i;
		}
		System.out.println("fact of number =" +fact);
	}

	void prime(int x)
	{
		int num=x/2;
		int count=0;
		for(i=2;i<=num;i++)
		{
			if(x%i==0)
			{
			   count++;
		    }
		}
		if(count==0)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
	}

	void even()
	{
		if(no%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is not even number");
		}
	}
}
class check
{
   public static void main(String arg[])
   {
	  System.out.println("Enter number = ");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();

      System.out.println("1.fact");
      System.out.println("2.prime");
      System.out.println("3.even");

      System.out.println("enter your choise = ");
      int ch=sc.nextInt();

       demo b=new demo();

      switch(ch)
      {
		  case 1:
		         b.fact(num);
		  case 2:
		         b.prime(num);
		  case 3:
		         b.even(num);

	  }
}