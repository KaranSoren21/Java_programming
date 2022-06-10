//Subtraction of two matrices using user input 
import java.util.Scanner;

public class MatrixSubtraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row for Matrix Addition");
		int row = obj.nextInt();
		System.out.println("Enter the size of column for Matrix Addition");
		int col = obj.nextInt();
		
		int [][] A= new int[row][col];
		int [][] B= new int[row][col];
		System.out.println("Enter matrix A: ");
		for(int i = 0; i < row; i++)
		{
			
			System.out.println("row no. "+(i+1)+":");
			for(int j = 0; j < col; j ++)
			{
				System.out.print("column no. "+(j+1)+": ");
				A[i][j] = obj.nextInt();
			}
			System.out.print("\n");
		
		}
		System.out.println("Enter matrix B: ");
		for(int i = 0; i < row; i++)
		{
			
			System.out.println("row no. "+(i+1)+":");
			for(int j = 0; j < col; j ++)
			{
				System.out.print("column no. "+(j+1)+": ");
				B[i][j] = obj.nextInt();
			}
			System.out.print("\n");
		
		}
		System.out.println("Result");
		for(int i = 0; i < A.length; i++)
		{
			
			for(int j = 0; j < B.length; j++) {
				System.out.print(A[i][j]-B[i][j]+" ");
			}
			System.out.println();
		}
		
		obj.close();
	}

}
