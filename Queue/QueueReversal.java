import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal 
{

    static class QueueClass
    {
        public static void queueReverse(Queue<Integer>q1)
        {
            Stack<Integer>s=new Stack<>();

            while (!q1.isEmpty()) 
            {
                s.push(q1.remove());    
            }

            while (!s.isEmpty()) 
            {
                q1.add(s.pop());    
            }
        }    
    }
    public static void main(String[] args) 
    {
        QueueClass qc=new QueueClass();


        Queue<Integer>q1=new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);


        Iterator i1=q1.iterator();

        System.out.println("Before the operation Print Queue : ");
        while (i1.hasNext()) 
        {
            System.out.print(i1.next()+" ");
        }

        QueueClass.queueReverse(q1);

        Iterator i2=q1.iterator();

        System.out.println("\nAfter the operation Print Queue : ");
        while (i2.hasNext()) 
        {
            System.out.print(i2.next()+" ");
        }


    }    
}
