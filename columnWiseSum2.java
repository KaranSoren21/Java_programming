// Column wise sum using user input
import java.util.Scanner;
public class columnWiseSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row for Matrix 'A'");
		int row = obj.nextInt();
		System.out.println("Enter the size of column for Matrix 'A'");
		int col = obj.nextInt();
		
		int [][] A= new int[row][col];
		int sum, total = 0;
    
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
    
		System.out.println("Result");
		for(int i = 0; i < A.length; i++)
		{
			sum = 0;
			for(int j = 0; j < A[i].length; j++) {
				sum = sum + A[i][j];
			}
			total = total + sum;
			System.out.println("Sum of Column no. "+(i+1)+" = "+sum);
		}
		System.out.println("The total sum of columns = "+total);
		
		obj.close();
	}
}
