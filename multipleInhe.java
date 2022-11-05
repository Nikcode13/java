import java.util.Scanner;
interface demo
{
    void show();
}
class demo1
{
     int a,b;
     void read()
     {
		 a=10;
		 b=20;
	 }
}
class demo2 extends demo1 implements demo
{
	public void show()
	{
		System.out.println("a+b = "+(a+b));
	}
}
class multipleInhe
{
    public static void main(String arg[])
    {
        demo2 d2=new demo2();
        d2.read();
        d2.show();
    }
}