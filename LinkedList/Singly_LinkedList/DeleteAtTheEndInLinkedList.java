public class DeleteAtTheEndInLinkedList 
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
        if (head==null) 
        {
            head=newNode;
            head.next=null;
            return;
        }

        newNode.next=head;
        head=newNode;
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


    public void delAtEnd()
    {
        if (head==null) 
        {
            System.out.println("You can't delete data from linked list because it's empty");
            return;
        }

        if (head.next==null) 
        {
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) 
        {
            temp=temp.next;
        }

        temp.next=null;

    }



    public static void main(String[] args) 
    {
        DeleteAtTheEndInLinkedList list=new DeleteAtTheEndInLinkedList();

        Node fNode=new Node(10);
        Node secNode=new Node(20);
        Node thNode=new Node(30);

        list.addAtFirst(fNode);
        list.addAtFirst(secNode);
        list.addAtFirst(thNode);

        list.display();

        list.delAtEnd();

        list.display();
        list.delAtEnd();

        list.display();
        list.delAtEnd();

        list.display();
        list.delAtEnd();

        list.display();
        
        
    }    
}
