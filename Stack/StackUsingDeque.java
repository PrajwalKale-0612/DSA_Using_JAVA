import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque 
{
    static class Stack 
    {
        static Deque<Integer>deque=new LinkedList<>();

        public static void push(int data)
        {
            deque.addLast(data);
        }

        public static int pop()
        {
            return deque.removeLast();
        }

        public static int peek()
        {
            return deque.getLast();
        }
        
    }
    public static void main(String[] args) 
    {
        Stack s=new Stack();

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("Peek"+Stack.peek());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
    }     
}