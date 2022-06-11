// column wise sum
public class columnWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int sum, total = 0;
		for(int i = 0; i < A.length; i++)
		{
			sum = 0;
			for(int j = 0; j < A[i].length; j++) {
				sum = sum + A[i][j];
				total = total + sum;
			}
			System.out.println("Sum of Column no. "+(i+1)+" = "+sum);
		}
		System.out.println("The total sum of column = "+total);
	}

}
