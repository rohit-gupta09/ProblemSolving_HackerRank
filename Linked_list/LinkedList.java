package problemSolving;
import java.util.*;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
		}
	}
	
	public void add(int val) {
		if(head==null)
		{
			head=new Node(val);
			head.next=null;
		}
		else {
			Node newNode=new Node(val);
			newNode.next=null;
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
	}
	
	public void Traversal(){
		Node n=head;
		while (n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			list.add(val);
		}
		list.Traversal();
	}

}
