package Module03;

import java.util.Scanner;

public class MatrixAddi {

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
		int add_arr[][] = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add_arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Addition of 2 matrices is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(add_arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
