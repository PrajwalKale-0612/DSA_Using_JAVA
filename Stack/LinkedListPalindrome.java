import java.util.*;
public  class LinkedListPalindrome 
{
    static class Node 
    {
        char data;
        Node next;
        
        Node(char data)
        {
            this.data=data;
            this.next=null;
        }
    }


    public static boolean isPalindrome(Node head)
    {
        Stack<Character> s=new Stack<>();

        Node temp=head;

        while (temp!=null) 
        {
            s.push(temp.data);
            temp=temp.next;    
        }

        temp=head;
        while (temp!=null) 
        {
            if (temp.data!=s.pop()) 
            {
                return false;
            }
            temp=temp.next;
        }

        return true;

    }
    public static void main(String[] args) 
    {
        Node head=new Node('A');
        head.next=new Node('B');
        head.next.next=new Node('C');
        head.next.next.next=new Node('B');
        head.next.next.next.next=new Node('A');

        System.out.println(isPalindrome(head));
    }    
}