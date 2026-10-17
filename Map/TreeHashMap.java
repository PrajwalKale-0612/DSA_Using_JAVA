import java.util.TreeMap;

public class TreeHashMap 
{
    public static void main(String[] args) 
    {
        TreeMap<String,Integer>thm=new TreeMap<>();

        thm.put("India", 160);
        thm.put("USA", 80);
        thm.put("China", 170);
        thm.put("England", 70);
        thm.put("Nepal", 20);
        thm.put("Chine", 230);

        System.out.println(thm);

    }    
}
