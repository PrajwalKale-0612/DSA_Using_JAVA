public class AddAtTheEndLinkedList 
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
            return;   
        }

        Node temp=head;
        while (temp.next!=null) 
        {
           temp=temp.next;
        }

        temp.next=newNode;
        // System.out.println(newNode.data+" is Add At the end in Linked List");
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

    public static void main(String[] args) 
    {
        AddAtTheEndLinkedList list=new AddAtTheEndLinkedList();

        Node fNode=new Node(10);
        Node secNode=new Node(20);
        Node tNode=new Node(30);

        list.addAtTheEnd(fNode);
        list.addAtTheEnd(secNode);
        list.addAtTheEnd(tNode);
        
        Node forthNode=new Node(50);
        list.addAtTheEnd(forthNode);


        list.display();

    }
}
