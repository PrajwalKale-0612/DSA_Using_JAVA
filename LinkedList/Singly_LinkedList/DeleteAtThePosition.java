import org.w3c.dom.Node;

public class DeleteAtThePosition 
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

    public void delAtSpecificPosition(int pos)
    {
        if (head==null) 
        {
            System.out.println("You can't delete element in the Linked List because it's Empty .");
            return;
        }

        if (pos==1) 
        {
            head=head.next;
            return;  
        }


        int i=1;
        Node temp=head;

        while (i<pos-1 && temp!=null) 
        {
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;
    }

    public static void main(String[] args) 
    {
        DeleteAtThePosition list=new DeleteAtThePosition();

        Node fNode=new Node(10);
        Node secNode=new Node(20);
        Node thNode=new Node(30);
        Node fourNode=new Node(40);
        Node fifthNode=new Node(50);
        Node sixNode=new Node(60);

        list.addAtFirst(fNode);
        list.addAtFirst(secNode);
        list.addAtFirst(thNode);
        list.addAtFirst(fourNode);
        list.addAtFirst(fifthNode);
        list.addAtFirst(sixNode);

        list.display();

        list.delAtSpecificPosition(3);
        list.display();

    }    
}
