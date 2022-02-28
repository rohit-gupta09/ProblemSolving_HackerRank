package problemSolving;
import java.util.*;

public class GetNodeValue {
Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
		}	
	}
	
	public void pushlast(int data) {
        if(head==null)
        {
            head=new Node(data);
             head.next=null;
        }
        else {
            Node newNode=new Node(data);
            newNode.next=null;
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
    }
	
	public void getnode(int position,int count)
	{
		int result=count-1-position;
		Node a=head;
		if(head==null)
		{
			return;
		}
		else {
			for(int i=0;i<result;i++)
			{
				a=a.next;
			}
			System.out.println(a.data);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			GetNodeValue list=new GetNodeValue();
			for(int j=0;j<a;j++)
			{
				int val=sc.nextInt();
				list.pushlast(val);
			}
			int pos=sc.nextInt();
			list.getnode(pos,a);
			
		}
	}
}
