
public class MergeLinkedList 
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

    private Node getMid(Node head)
    {
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;    
        }

        return slow;
    }

    private Node merge(Node leftHead,Node rightHead)
    {
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while (leftHead!=null && rightHead!=null) 
        {
            if (leftHead.data<=rightHead.data) 
            {
                temp.next=leftHead;
                leftHead=leftHead.next;    
            }
            else
            {
                temp.next=rightHead;
                rightHead=rightHead.next;
            }
            temp=temp.next;
        }

        while (leftHead!=null) 
        {
            temp.next=leftHead;
            leftHead=leftHead.next;
            temp=temp.next;
        }

        while (rightHead!=null) 
        {
            temp.next=rightHead;
            rightHead=rightHead.next;
            temp=temp.next;    
        }

        return mergeLL.next;
    }

    

    public Node mergeSort(Node head)
    {
        if (head==null || head.next==null) 
        {
            return head;    
        }

        Node mid=getMid(head);

        Node rightNode=mid.next;
        mid.next=null;

        Node left=mergeSort(head);
        Node right=mergeSort(rightNode);

        return merge(left,right);
    }

    public void addAtTheEnd(Node newNode)
    {
        if (head==null) 
        {
            head=newNode;
            return;
        }

        Node temp=head;

        while (temp.next!=null) 
        {
            temp=temp.next;
        }

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

        System.out.println("NULL");
    }


    public static void main(String[] args) 
    {
        MergeLinkedList list=new MergeLinkedList();

        Node fNode=new Node(5);
        Node sNode=new Node(4);
        Node tNode=new Node(3);
        Node frNode=new Node(2);
        Node ftNode=new Node(1);
        
        list.addAtTheEnd(fNode);
        list.addAtTheEnd(sNode);
        list.addAtTheEnd(tNode);
        list.addAtTheEnd(frNode);
        list.addAtTheEnd(ftNode);

        list.display();

        list.head=list.mergeSort(list.head);

        list.display();
    }    
}
