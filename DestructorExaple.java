class demo
{
   demo(int x)
   {
       System.out.println(x);
   }

   protected void finalize()
   {
       System.out.println("Object is destroyed by the Garbage collector");
   }
}

public class DestructorExaple
{
   public static void main(String args[])
   {
       demo de=new demo(23);
       de.finalize();
       de=null;
       System.gc();
       System.out.println("Inside the main() method");
   }
}