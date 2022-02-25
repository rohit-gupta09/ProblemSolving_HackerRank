package linked_list;
import java.util.*;
public class Delete {

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
	// 1 2 3 4
	public void delete(int position)
	{
		Node temp=head;
		if(head==null)
		{
			return;
		}
		
		if(position==0)
		{
			head=temp.next;
		}
		else {
			for(int i=0;temp!=null&&i<position-1;i++)
			{
				temp=temp.next;
			}
			Node next=temp.next.next;
			temp.next=next;
		}
	}
	
	
	public void Traversal()
	{
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	
	public static void main(String[] args) {
		Delete list=new Delete();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			list.pushlast(val);
		}
		int position=sc.nextInt();
		list.delete(position);
		
		list.Traversal();

	}

}
