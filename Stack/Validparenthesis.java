import java.util.Stack;
public class Validparenthesis
{
    public static boolean isValid(String str)
    {
        Stack<Character>s=new Stack();

        for (int i = 0; i < str.length(); i++) 
        {
            char ch=str.charAt(i);

            if (ch=='('||ch=='{'||ch=='[') 
            {
                s.push(ch);
            }    
            else
            {
                if (s.isEmpty()) 
                {
                    return false;
                }
                else if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']'))
                {
                    s.pop();
                }
            }
        }

        if (!s.isEmpty()) 
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public static void main(String args[])
    {
        System.out.println(isValid("((({{}[])))"));
    }
}