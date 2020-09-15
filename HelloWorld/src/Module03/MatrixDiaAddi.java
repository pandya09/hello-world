package Module03;

import java.util.Scanner;

public class MatrixDiaAddi {

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
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
					sum += mat[i][j];
			}
		}
		System.out.println("The addition of diagonal elements of a given matrix is: "+sum);
	}

}
