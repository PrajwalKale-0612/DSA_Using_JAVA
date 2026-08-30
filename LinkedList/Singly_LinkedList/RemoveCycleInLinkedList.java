public class RemoveCycleInLinkedList 
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



    public void addAtTheEnd(Node newNode)
    {
        if (head==null) 
        {
            head=newNode;
            head.next=null;
        }

        Node temp=head;

        while (temp.next!=null) 
        {
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.next=null;
    }

    public void display()
    {
        Node temp=head;

        while (temp!=null) 
        {
            System.out.print(temp.data+"->");
            temp=temp.next;    
        }

        System.out.println("NULL");
    }

    public static void removeCycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while (fast!=null && fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next; 
            if (slow==fast) 
            {
                cycle=true;
                break;    
            }   
        }

        if (cycle==false) 
        {
            return;
        }

        slow=head;
        Node prevNode=null;

        while (slow!=fast) 
        {
            slow=slow.next;
            prevNode=fast;
            fast=fast.next;    
        }

        prevNode.next=null;

    }


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


    public static void main(String[] args) 
    {
        RemoveCycleInLinkedList list=new RemoveCycleInLinkedList();

        // list.head=new Node(1);
        // list.head.next=new Node(2);
        // Node temp=new Node(3);
        // list.head.next.next=temp;
        // list.head.next.next.next=new Node(5);
        // list.head.next.next.next.next=temp;

        Node fNode=new Node(1);
        Node sNode=new Node(2);
        Node tNode=new Node(3);
        Node frNode=new Node(4);
        Node ftNode=new Node(5);
        
        list.head=fNode;
        fNode.next=sNode;
        sNode.next=tNode;
        tNode.next=frNode;
        frNode.next=ftNode;
        ftNode.next=sNode;
        

        System.out.println(list.isCycle(fNode));
        list.removeCycle(fNode);
        System.out.println(list.isCycle(fNode));

        

        
    }    
}
