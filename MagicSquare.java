package problemSolving;
import java.util.*;
import java.math.*;
public class MagicSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[9];
		for(int i=0;i<9;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int[][] set= {{4,9,2,3,5,7,8,1,6},
				{2,7,6,9,5,1,4,3,8},
                {6,1,8,7,5,3,2,9,4},
                {8,3,4,1,5,9,6,7,2},
                {2,9,4,7,5,3,6,1,8},
                {6,7,2,1,5,9,8,3,4},
                {8,1,6,3,5,7,4,9,2},
                {4,3,8,9,5,1,2,7,6}};
		
		int min=99;
		for(int i=0;i<8;i++)
		{
			int part=0;
			for(int j=0;j<9;j++)
			{
				if(a[j]!=set[i][j])
				{
					part=part+Math.abs(a[j]-set[i][j]);
				}
			}
			if(part<min) {
				min=part;
			}
		}
		
		System.out.println(min);
		

	}

}
