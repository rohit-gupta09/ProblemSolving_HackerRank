package problemSolving;
import java.util.*;
import java.math.*;
public class DiagonalDifference {
	
	public static void Difference(int arr[][],int n)
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum1=sum1+arr[i][j];
				}
				if(i+j==(n-1))
				{
					sum2=sum2+arr[i][j];
				}
			}
		}
		
		int ans=Math.abs(sum1-sum2);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		Difference(arr,n);

	}

}
