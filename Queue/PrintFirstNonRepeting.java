import java.util.LinkedList;
import java.util.Queue;

public class PrintFirstNonRepeting {
    static class Mynew {
        public static void printNonFirstChar(String s) {
            Queue<Character> q1 = new LinkedList<>();

            int freq[] = new int[26];

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                q1.add(ch);
                freq[ch - 'a']++;

                while (!q1.isEmpty() && freq[q1.peek() - 'a'] > 1) 
                {
                    q1.remove();
                }

                if (!q1.isEmpty()) 
                {
                    System.out.print(q1.peek() + " ");
                } else 
                {
                    System.out.print(-1 + " ");
                }

            }
            // if (!q1.isEmpty())
            // {
            // System.out.println(q1.peek()+" ");
            // }
            // else
            // {
            // System.out.println(-1+" ");
            // }

        }
    }

    public static void main(String[] args) {
        Mynew pn = new Mynew();

        Mynew.printNonFirstChar("aabccxb");

    }
}