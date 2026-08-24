
public class ReverseLinkedList 
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

    public void reverse()
    {
        // Node prevNode=null;
        // Node currNode=head;

        // while (currNode!=null) 
        // {
        //     Node nextNode=currNode.next;

        //     currNode.next=prevNode;
        //     prevNode=currNode;   
        //     currNode=nextNode;

        // }
        // head=prevNode;


        Node prevNode=null;
        Node currNode=head;

        while (currNode!=null) 
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;    
        }
        head=prevNode;
    }

    
    public static void main(String[] args) {
        
        ReverseLinkedList list=new ReverseLinkedList();

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

        System.out.println("Before Reverse Print Linked List : ");
        list.display();

        list.reverse();

        System.out.println("After Reverse Print Linked List : ");
        list.display();
        
    }  
}
