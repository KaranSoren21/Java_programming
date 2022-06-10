// addition of two matrix
public class MatrixAddition {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A = |1 2 3|
		 * 	   |2 3 4|
		 * 	   |1 1 1|
		 * 
		 * B = |4 5 6|
		 * 	   |7 8 9|
		 *     |4 5 7|
		 * */		
		int [][] A = {{1,2,3},{2,3,4},{1,1,1}};
		int [][] B = {{4,5,6},{7,8,9},{4,5,7}};

		int row = A.length;// To find row size take any of the matrix (A or B).
		int col = A[0].length;// To find column size take any of the matrix (A or B).

		System.out.println("The sum of two matrix: ");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j ++)
			{
				System.out.print(A[i][j]+B[i][j]+" ");
			}
			System.out.println();
		}
	}
}
