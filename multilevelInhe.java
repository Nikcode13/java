import java.util.Scanner;
class demo
{
	int a;
	Scanner sc=new Scanner(System.in);

	void read()
	{
		System.out.println("eneter value of a= ");
		a=sc.nextInt();
	}
}
class demo1 extends demo
{
	int b;
    void read_b()
 	{
 		System.out.println("eneter value of b= ");
 		b=sc.nextInt();
	}
}
class demo2 extends demo1
{
    int c=a+b;


    void show()
    {

		System.out.println("sum of a and b = " + c);
	}

}
class multilevelInhe
{
    public static void main(String arg[]){



         demo2 d2=new demo2();
         d2.read();
         d2.read_b();
         d2.show();
    }
}