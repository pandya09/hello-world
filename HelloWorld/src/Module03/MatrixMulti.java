package Module03;

import java.util.*;

public class MatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		System.out.println("Enter the elements of 1st matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr2[i][j] = s.nextInt();
			}
		}
		int mul_arr[][] = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mul_arr[i][j]=0;
				for(int k=0;k<3;k++)
				{
					mul_arr[i][j] += arr1[i][k]*arr2[k][i];
				}
			}
		}
		System.out.println("Multiplied matrix is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mul_arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
