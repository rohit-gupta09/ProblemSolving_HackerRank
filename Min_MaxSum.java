package problemSolving;
import java.util.*;

public class Min_MaxSum {
	
	public static void sort(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(isSmaller(arr,j+1,j))
				{
					swap(arr,j+1,j);
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static boolean isSmaller(int[] arr,int i,int j)
	{
		if(arr[i]<arr[j])
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static void max_min(int arr[])
	{
		// for minimum
		int sum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		
		// for maximum
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			max=max+arr[i];
		}
		
		System.out.print(sum+" "+max);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sort(arr);
		max_min(arr);
	}

}
