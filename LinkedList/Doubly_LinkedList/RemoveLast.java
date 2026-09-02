public class RemoveLast
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

    public void addFirst(int data)
    {
        Node newNode=new Node(data);

        size++;
        if (head==null) 
        {
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public int removeLast()
    {
        if (head==null) 
        {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;    
        }

        if (size==1) 
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;   
        }

        Node temp=head;
        while (temp.next.next!=null) 
        {
            temp=temp.next;    
        }
        int val=temp.next.data;

        temp.next.prev=null;
        temp.next=null;
        size--;

        
        return val;
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

        RemoveLast DLL=new RemoveLast();

        
        DLL.addFirst(2);
        DLL.addFirst(1);
        DLL.addFirst(5);
        DLL.addFirst(6);
        DLL.addFirst(7);
        DLL.addFirst(8);
        DLL.addFirst(4);
        DLL.addFirst(3);

        DLL.display();
        System.out.println("Size of DLL : "+DLL.size);

        System.out.println("Deleted Value : "+DLL.removeLast());
        DLL.display();
        System.out.println("Size of DLL : "+DLL.size);





    }
}