package problemSolving;
import java.util.*;
public class MergeTwoLinkedList {
	
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
			System.out.println(a.data);
			a=a.next;
		}
	}
	public static MergeTwoLinkedList merge(MergeTwoLinkedList l1,MergeTwoLinkedList l2)
	{
		Node one=l1.head;
		Node two=l2.head;
		
		MergeTwoLinkedList result=new MergeTwoLinkedList();
		while(one!=null && two!=null)
		{
			if(one.data<two.data) {
				result.pushlast(one.data);
				one=one.next;
			}
			else {
				result.pushlast(two.data);
				two=two.next;
			}
		}
		
		while(one!=null)
		{
			result.pushlast(one.data);
			one=one.next;
		}
		
		while(two!=null)
		{
			result.pushlast(two.data);
			two=two.next;
		}
		
		return result;
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			MergeTwoLinkedList list1=new MergeTwoLinkedList();
			for(int j=0;j<a;j++)
			{
				int val=sc.nextInt();
				list1.pushlast(val);
			}
			int b=sc.nextInt();
			MergeTwoLinkedList list2=new MergeTwoLinkedList();
			for(int k=0;k<b;k++)
			{
				int val=sc.nextInt();
				list2.pushlast(val);
			}
			
		    MergeTwoLinkedList list3=merge(list1,list2);
		    list3.Traversal();
		}
	}
}
