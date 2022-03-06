package problemSolving;
import java.util.*;

public class DeleteDulpicates {
	
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
	
	public void Traversal()
	{
		Node a=head;
		while(a!=null)
		{
			System.out.print(a.data+" ");
			a=a.next;
		}
	}
	
	public void RemoveDuplicates()
	{
		Node current=head;
		while(current!=null)
		{
			Node temp=current;
			while(temp!=null && temp.data==current.data)
			{

			temp=temp.next;
			}
			 current.next=temp;
			 current=current.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		for(int i=0;i<testcases;i++)
		{
			int n=sc.nextInt();
			DeleteDulpicates list=new DeleteDulpicates();
			for(int j=0;j<n;j++)
			{
				int val=sc.nextInt();
				list.pushlast(val);
			}
			list.RemoveDuplicates();
			list.Traversal();
		}

	}

}
