package Module03;

import java.util.Scanner;

public class MatrixTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][]mat = new int[3][3];
		System.out.println("Enter the elements of a matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j] = s.nextInt();
			}
		}
		int [][]trans = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				trans[i][j] = mat[j][i];
			}
		}
		System.out.println("Transpose of a given matrix is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
