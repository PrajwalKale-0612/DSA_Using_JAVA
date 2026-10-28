import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque 
{
    static class QueueUsingDe 
    {
       static  Deque<Integer> deque=new LinkedList<>();

        public static void add(int data)
        {
            deque.addLast(data);
        }  

        public static int remove()
        {
            return deque.removeFirst();
        }

        public static int peek()
        {
            return deque.getFirst();
        }
    }    

    public static void main(String[] args) 
    {
        QueueUsingDe q1=new QueueUsingDe();

        QueueUsingDe.add(1);
        QueueUsingDe.add(2);
        QueueUsingDe.add(3);

        System.out.println("Peek "+QueueUsingDe.peek());
        System.out.println(QueueUsingDe.remove());
        System.out.println(QueueUsingDe.remove());
        System.out.println(QueueUsingDe.remove());

    }
}
