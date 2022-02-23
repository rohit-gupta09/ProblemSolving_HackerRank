package linked_list;
import java.util.Scanner;

public class Add_Last {
    
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
            System.out.println(n.data);
            n=n.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Add_Last list=new Add_Last();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int value=sc.nextInt();
            list.pushlast(value);
        }
        list.Traversal();
    

    }

}
