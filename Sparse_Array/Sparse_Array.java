package problemSolving;
import java.util.*;
public class Sparse_Array {
	
	public static void Sparse(String[] strings,String[] query)
	{
		
		for(int i=0;i<query.length;i++)
		{
			int count=0;
			for(int j=0;j<strings.length;j++)
			{
				if(query[i].equals(strings[j])) {
					count=count+1;
				}
				else {
//					return;
				}
				
			}
			System.out.println(count+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] strings=new String[n];
		for(int i=0;i<n;i++)
		{
			strings[i]=sc.next();
		}
		
		
		
		int m=sc.nextInt();
		String[] query=new String[m];
		for(int i=0;i<m;i++)
		{
			query[i]=sc.next();
		}
		
		Sparse(strings,query);
	}

}
