import java.util.Scanner;
public class AddTwoMatrix
{
    public static void main(String arg[])
    {
		int m,n,i,j;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number of row of matrix = ");
		m=sc.nextInt();
		System.out.println("enter number of columns of matrix = ");
		n=sc.nextInt();

		int array1[][]=new int[m][n];
		int array2[][]=new int[m][n];
		int sum[][]=new int[m][n];

		System.out.println("enter elements of first matrix = ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of second matrix = ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				sum[i][j]=array1[i][j]+array2[i][j];
			}
		}

		System.out.println("sum of the matrices = \n");

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}

	}
}