package problemSolving;
import java.util.*;
public class Triplets_Compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[3];
		for(int i=0;i<3;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int count[]=new int[2];
		
		for(int i=0;i<3;i++)
		{
			if(a[i]>b[i])
			{
				count[0]=count[0]+1;
			}
			else if(b[i]>a[i]){
				count[1]=count[1]+1;
			}
			else {
				count[0]=count[0]+0;
				count[1]=count[1]+0;
			}
		}
		for(int i=0;i<2;i++)
		{
			System.out.print(count[i]+" ");
		}
	}

}
