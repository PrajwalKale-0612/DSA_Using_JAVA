import org.w3c.dom.Node;

public class LinkedListCount 
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

    public void addAtFirst(Node newNode) 
    {
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void display() 
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int count()
    {
        Node temp=head;
        int nodeCount=0;

        while (temp!=null) 
        {
            temp=temp.next;
            nodeCount++;
        }

        return nodeCount;
    }

    
    public static void main(String[] args) {
        
        LinkedListCount list=new LinkedListCount();

        Node fNode = new Node(10);
        Node secNode = new Node(20);
        Node thNode = new Node(30);
        Node fourNode = new Node(40);
        Node fifthNode = new Node(50);
        Node sixNode = new Node(60);

        list.addAtFirst(fNode);
        list.addAtFirst(secNode);
        list.addAtFirst(thNode);
        list.addAtFirst(fourNode);
        list.addAtFirst(fifthNode);
        list.addAtFirst(sixNode);

        list.display();

        int nodeCount=list.count();
        System.out.println("This Linked List Size is : "+nodeCount);

    }   
}
