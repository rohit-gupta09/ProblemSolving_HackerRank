package problemSolving;
import java.util.*;
import java.io.*;
public class ClimbingTheLeaderBoard {
	
	public static int binarySearch(int arr[],int score)
	{
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==score)
			{
				return mid;
			}
			else if(arr[mid]<score && score<arr[mid-1])
			{
				return mid;
			}
			else if(arr[mid]>score && score>=arr[mid+1])
			{
				return mid+1;
			}
			else if(arr[mid]<score)
			{
				high=mid-1;
			}
			else  if(arr[mid]>score)
			{
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		// ranked array
		int[] ranked=new int[n];
		for(int i=0;i<n;i++) {
			ranked[i]=sc.nextInt();
			
		}
		
		int b=sc.nextInt();
		
		// player array
		int player[]=new int[b];
		for(int i=0;i<b;i++)
		{
			player[i]=sc.nextInt();		
		}
		
		// providing scores to the ranked array;
		int[] rank=new int[n];
		rank[0]=1;
		
		for(int i=1;i<n;i++)
		{
			if(ranked[i]==ranked[i-1])
			{
				rank[i]=rank[i-1];
			}
			else {
				rank[i]=rank[i-1]+1;
			}
		}
		
		// now we are checking for the player scores int he ranked array and provide them the ranked according to their numbers;
		int res[]=new int[b];
		for(int i=0;i<b;i++) {
			int playerScore=player[i];
			if(playerScore>=ranked[0])
			{
				res[i]=1;
			}else if(playerScore<ranked[n-1])
			{
				res[i]=rank[n-1]+1;
			}
			else {
				
				int index=binarySearch(ranked,playerScore);
				res[i]=rank[index];
		}
	}
		for(int i=0;i<b;i++)
		{
			System.out.println(res[i]);
		}
}
}

