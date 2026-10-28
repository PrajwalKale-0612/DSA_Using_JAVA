import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InterLeave 
{
    static class InterClass
    {
        public static void interLeaveInQueue(Queue<Integer>q1)
        {
            Queue<Integer>firstHalf=new LinkedList<>();

            int size=q1.size();

            for (int i = 0; i <size/2; i++) 
            {
                firstHalf.add(q1.remove());    
            }

            while (!firstHalf.isEmpty()) 
            {
                q1.add(firstHalf.remove());
                q1.add(q1.remove());    
            }
        }    
    }
    public static void main(String[] args) 
    {
        InterClass ic=new InterClass();


        Queue<Integer>q1=new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);

        InterClass.interLeaveInQueue(q1);

        Iterator i=q1.iterator();

        while (i.hasNext()) 
        {
            System.out.print(i.next()+" ");
        }


    }    
}
