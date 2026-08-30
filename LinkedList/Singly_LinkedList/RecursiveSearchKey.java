public class RecursiveSearchKey 
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

    public  void addAtFirst(Node newdata)
    {
        if (head==null) 
        {
            head=newdata;
            head.next=null;
            return;
        }

        newdata.next=head;
        head=newdata;

    }


    public int recSearch(Node temp,int key)
    {
        if (temp==null) 
        {
            return -1;    
        }

        if (temp.data==key) 
        {
            return 0;    
        }
        int idx=recSearch(temp.next, key);

        if (idx==-1) 
        {
            return -1;    
        }

        return idx+1;
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


    public void recDisplay(Node head)
    {
        Node temp=head;

        if (temp==null) 
        {
            System.out.println("NULL");
            return;    
        }

        System.out.print(temp.data+"->"); 
        recDisplay(temp.next);   
        
    }
    public static void main(String[] args) 
    {
        RecursiveSearchKey list=new RecursiveSearchKey();

        Node fNode=new Node(10);
        Node twNode=new Node(20);
        Node thNode=new Node(30);
        Node fourNode=new Node(40);
        
        list.addAtFirst(fNode);
        list.addAtFirst(twNode);
        list.addAtFirst(thNode);
        list.addAtFirst(fourNode);

        System.out.println("Print List : ");
        list.display();
        list.recDisplay(list.head);

        int key=20;

        int sIdx=list.recSearch(list.head,key);

        if (sIdx==-1) 
        {
            System.out.println(key+" is not found");
        }
        else
        {
            System.out.println(key+" is found at index "+sIdx);
        }
        



        
    }    
}
