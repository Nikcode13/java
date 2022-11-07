//program that demonstrates exception(divide by 0)

import java.io.*;

class ExceptionZero
{
    public static void main(String args[])
    {
         int a=6;
         int b=0;

         try
         {
              System.out.println(a/b); //throw Exception
         }

         catch(ArithmeticException e)
         {
             System.out.println("Divided by zero operation cannot posible");
         }
    }
}