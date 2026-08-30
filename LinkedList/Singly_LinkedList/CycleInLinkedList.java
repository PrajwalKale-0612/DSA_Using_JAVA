public class CycleInLinkedList 
{
    public static class Node 
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }

    Node head=null;

    public boolean isCycle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if (slow==fast) 
            {
                return true;    
            }
        }

        return false;
    }


     public void addAtTheEnd(Node newNode)
    {
        if (head==null) 
        {
            head=newNode;
            head.next=null; 
            return;   
        }

        Node temp=head;
        while (temp.next!=null) 
        {
           temp=temp.next;
        }

        temp.next=newNode;
    }

    


    public static void main(String[] args) 
    {

        CycleInLinkedList list=new CycleInLinkedList();

        Node fNode=new Node(10);
        Node secNode=new Node(20);
        Node tNode=new Node(30);

        list.addAtTheEnd(fNode);
        list.addAtTheEnd(secNode);
        list.addAtTheEnd(tNode);

        tNode.next=list.head;

        // Node head=new Node(1);

        // head.next=new Node(2);

        // head.next.next=new Node(3);

        // head.next.next.next=head;


        System.out.println(list.isCycle(list.head));


        
    }    
}
