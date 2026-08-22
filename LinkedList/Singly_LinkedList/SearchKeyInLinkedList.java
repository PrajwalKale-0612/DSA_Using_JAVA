import org.w3c.dom.Node;

public class SearchKeyInLinkedList {

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

    public void searchKey(int key)
    {
        Node temp=head;
        int nodeIdx=1;
        while (temp!=null) 
        {
            if (temp.data==key) 
            {
               System.out.println(key+" is found in the Linked List at Node Index "+nodeIdx);
               return;    
            }
            nodeIdx++;  
            temp=temp.next;  
        }

        if (temp==null) 
        {
            System.out.println(key+" is not found in the Linked List");  
        }

    }

    public static void main(String[] args) {
        
        SearchKeyInLinkedList list=new SearchKeyInLinkedList();

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
        list.searchKey(40);
        list.searchKey(89);
    }
}
