// equality of two matrices
public class twoMatricesEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A = |1 2 3|
		 *     |2 3 4|
		 *     |1 1 1|
		 * 
		 * B = |4 5 6|
		 *     |7 8 9|
		 *     |4 5 7|
		 * */		
		int [][] A = {{1,2,3},{2,3,4},{1,1,1}};
		int [][] B = {{4,5,6},{7,8,9},{4,5,7}};
		int flag = 1;
		if(A.length != B.length || A[0].length != B[0].length)
		{
			flag = 0;
			System.out.println("Order of two Matrices are not same");
			System.out.println("Hence, two matrices cannot be equal to each other.");	
		}
		if(flag == 1)
		{
			int row = A.length;// To find row size take any of the matrix (A or B).
			int col = A[0].length;// To find column size take any of the matrix (A or B).
			System.out.println("Order of matrices are same.");
			for(int i = 0; i < row; i++)
			{
				for(int j = 0; j < col; j++)
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
			System.out.println("Hence, two matrices are equal to each other.");
		}
		else
		{
			System.out.println("differ in elements.\nHence, two matrices cannot be equal to each other.");
		}
	}
}
