package problemSolving;
import java.util.*;

public class LeftRotation {
	
	public static void leftrotation(int[] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			int index=(i+n)%arr.length;
			System.out.print(arr[index]+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();// taking the size of the array
		int n=sc.nextInt();// taking the no of time you want left rotation
		int[] arr=new int[m];
		
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		leftrotation(arr,n);

	}

}