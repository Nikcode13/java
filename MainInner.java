class Outer
{
	private int num=40;
    class Inner       // Simple nested inner class
    {
        public void show()
        {
            System.out.println("In a nested class method");
            System.out.println("number = "+num);
        }
    }
}


class MainInner {


    public static void main(String[] args)
    {

         Outer.Inner in =new Outer().new Inner();

         in.show();
    }
}


