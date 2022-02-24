package problemSolving;
import java.util.*;
public class Add_atPosition {
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
    
    public void Traversal(){
        Node n=head;
        while (n!=null) {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    
    public void insert(int position,int val)
    {
        if(head==null) {
        	return;
        }
        if(position==0)
        {
        	Node newNode=new Node(val);
        	newNode.next=head;
        	head=newNode;
        }
        else {
        	Node newNode=new Node(val);
        	Node n=head;
        	for(int i=0;i<position-1;i++)
        	{
        		n=n.next;
        	}
        	Node next=n.next;
        	n.next=newNode;
        	newNode.next=next;	
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Add_atPosition list=new Add_atPosition();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int value=sc.nextInt();
            list.pushlast(value);
        }
        int val=sc.nextInt();
        int position=sc.nextInt();
        list.insert(position,val);
        list.Traversal();
    

    }


}
