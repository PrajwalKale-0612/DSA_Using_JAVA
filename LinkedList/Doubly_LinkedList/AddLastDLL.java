public class AddLastDLL 
{
    public static class Node 
    {
        int data;
        Node prev;
        Node next;
        
        public Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }

    }

    Node head=null;
    Node tail=null;
    public static int size;

    public void addLast(int data)
    {
        Node newNode=new Node(data);

        if (head==null) 
        {
            head=tail=newNode;
            return;    
        }

        Node temp=head;

        while (temp.next!=null) 
        {
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.prev=temp;
    }

    public void display()
    {
        Node temp=head;

        while (temp!=null) 
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

 public static void main(String[] args) 
 {
    AddLastDLL DLL=new AddLastDLL();

    DLL.addLast(1);
    DLL.addLast(2);
    DLL.addLast(3);
    DLL.addLast(4);
    DLL.addLast(8);

    DLL.display();
 }    
}
