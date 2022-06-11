// equality of two matrices using user input
import java.util.Scanner;
public class twoMatricesEquality2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row for Matrix A");
		int Arow = obj.nextInt();
		System.out.println("Enter the size of column for Matrix A");
		int Acol = obj.nextInt();
		
		System.out.println("Enter the size of row for Matrix B");
		int Brow = obj.nextInt();
		System.out.println("Enter the size of column for Matrix B");
		int Bcol = obj.nextInt();
		
		int [][] A= new int[Arow][Acol];
		int [][] B= new int[Brow][Bcol];
		System.out.println("Enter matrix A: ");
		for(int i = 0; i < Arow; i++)
		{	
			System.out.println("row no. "+(i+1)+":");
			for(int j = 0; j < Acol; j ++)
			{
				System.out.print("column no. "+(j+1)+": ");
				A[i][j] = obj.nextInt();
			}
			System.out.print("\n");
		
		}
		System.out.println("Enter matrix B: ");
		for(int i = 0; i < Brow; i++)
		{
			
			System.out.println("row no. "+(i+1)+":");
			for(int j = 0; j < Bcol; j ++)
			{
				System.out.print("column no. "+(j+1)+": ");
				B[i][j] = obj.nextInt();
			}
			System.out.print("\n");	
		}
		int flag = 1;
		if(A.length != B.length || A[0].length != B[0].length)
		{
			flag = 0;
			System.out.println("Order of two Matrices are not same");
			System.out.println("Hence, two matrices cannot be equal to each other.");
			
		}
		if(flag == 1)
		{
			System.out.println("Order of matrices are same.");
			for(int i = 0; i < Arow; i++)
			{
				for(int j = 0; j < Acol; j++)
				{
					if(A[i][j] != B[i][j])
					{	
						flag = 0;
						break;
					}
				}
			}
		}
		if(flag == 1)
		{
			System.out.println("elements are same.\nHence, two matrices are equal to each other.");
		}
		else
		{
			System.out.println("differ in elements.\nHence, two matrices cannot be equal to each other.");
		}
		obj.close();
	}
}
