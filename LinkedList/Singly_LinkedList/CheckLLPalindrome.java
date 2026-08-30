public class CheckLLPalindrome 
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

    public Node findMiddleNode(Node head)
    {
        Node slow=head;
        Node fast=head;

        if (fast!=null && fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;    
        }

        return slow;
    }

    public boolean checkListPalindromeOrNot()
    {
        if (head==null || head.next==null) 
        {
            return true;
        }

        // step 1 : find the Mid of List :

        Node mid=findMiddleNode(head);

        // step 2 : Reverse the right side part of List :

        Node prevNode=null;
        Node currNode=mid;
        
        while (currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;    
        }

        Node rightHead=prevNode;
        Node leftHead=head;

        // step 3 : compare  Node in both List :

        while (leftHead!=null) 
        {
            if (leftHead.data!=rightHead.data) 
            {
                return false;    
            }
            rightHead=rightHead.next;
            leftHead=leftHead.next;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        CheckLLPalindrome list=new CheckLLPalindrome();

        Node fNode=new Node(1);
        Node sNode=new Node(2);
        Node tNode=new Node(2);
        Node frNode=new Node(3);
        Node fhNode=new Node(1);

        list.addAtFirst(fhNode);
        list.addAtFirst(frNode);
        list.addAtFirst(tNode);
        list.addAtFirst(sNode);
        list.addAtFirst(fNode);


        list.display();

        System.out.println(list.checkListPalindromeOrNot());

    }
}
