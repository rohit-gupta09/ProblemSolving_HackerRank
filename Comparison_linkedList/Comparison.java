package problemSolving;
import java.util.Scanner;

public class Comparison {
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
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public static void comparison(Node head1,Node head2)
	{
		if(head1!=null && head2!=null)
		{
			if(head1.data==head2.data)
			{
				comparison(head1.next,head2.next);
			}
			else {
				System.out.println("0");
			}
		}
		else if(head1==null && head2==null)
		{
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			Comparison list1=new Comparison();
			int a=sc.nextInt();
			for(int j=0;j<a;j++)
			{
				int val=sc.nextInt();
				list1.pushlast(val);
			}
			
			Comparison list2=new Comparison();
			int b=sc.nextInt();
			for(int j=0;j<b;j++)
			{
				int val=sc.nextInt();
				list2.pushlast(val);
			}
			
			comparison(list1.head,list2.head);

		}


	}


}
