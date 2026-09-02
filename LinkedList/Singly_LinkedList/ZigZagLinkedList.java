public class ZigZagLinkedList 
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

    public void zigZagList()
    // public void zigZagList(Node head)
    {
        // find mid
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;    
        }

        Node mid=slow;

        // reverse 2nd half

        Node right=mid.next;
        mid.next=null;

        Node prevNode=null;
        Node currNode=right;

        while (currNode!=null) 
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        // zig zag merge

        Node rightHead=prevNode;
        Node leftHead=head;

        Node nextL,nextR;

        while (leftHead!=null && rightHead!=null) 
        {
            nextL=leftHead.next;
            leftHead.next=rightHead;
            nextR=rightHead.next;
            rightHead.next=nextL;

            leftHead=nextL;
            rightHead=nextR;
        }
        
    }
    public static void main(String[] args) 
    {
        ZigZagLinkedList list=new ZigZagLinkedList();

        Node fNode=new Node(1);
        Node sNode=new Node(2);
        Node tNode=new Node(3);
        Node frNode=new Node(4);
        Node ftNode=new Node(5);
        Node stNode=new Node(6);
        Node setNode=new Node(7);

        list.addAtTheEnd(fNode);
        list.addAtTheEnd(sNode);
        list.addAtTheEnd(tNode);
        list.addAtTheEnd(frNode);
        list.addAtTheEnd(ftNode);
        list.addAtTheEnd(stNode);
        list.addAtTheEnd(setNode);

        list.display();

        list.zigZagList();
        // list.zigZagList(list.head);

        list.display();



    }    
}
