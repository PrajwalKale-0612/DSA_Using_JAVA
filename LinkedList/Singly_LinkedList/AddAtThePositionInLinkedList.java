public class AddAtThePositionInLinkedList 
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

    public void addAtParticularPostion(Node newNode,int pos)
    {
        if (pos==1) 
        {
            head=newNode;
            head.next=null;
            return;    
        }

        Node temp=head;

        int i=1;

        while (i<pos-1 && temp!=null)   //1 2 3 5 6 
        {
            temp=temp.next;
            i++;
        }

        if (temp==null) 
        {
            System.out.println("You Want to Insert Invalid Position in Linked List");
            return;
        }

        newNode.next=temp.next;
        temp.next=newNode;

    }

    public void display()
    {
        Node temp=head;
        while (temp!=null) 
        {
            System.out.print(temp.data+"->");  
            temp=temp.next;  
        }
        System.out.println("Null");
    }

    public static void main(String[] args) 
    {
        AddAtThePositionInLinkedList list =new AddAtThePositionInLinkedList();

        Node fNode=new Node(10);
        Node secNode=new Node(20);
        Node tNode=new Node(30);
        Node fithNode=new Node(50);

        list.addAtParticularPostion(fNode, 1);
        list.addAtParticularPostion(secNode, 2);
        list.addAtParticularPostion(tNode, 3);
        list.addAtParticularPostion(fithNode, 4);

        list.display();
        
        Node fourNode=new Node(40);
        list.addAtParticularPostion(fourNode, 4);

        list.display();

        
        
    }    
}
