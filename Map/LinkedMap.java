import java.util.LinkedHashMap;

public class LinkedMap 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String,Integer>hm=new LinkedHashMap<>(); 
        
        hm.put("india", 150);
        hm.put("England", 70);
        hm.put("USA", 50);
        hm.put("China", 170);

        System.out.println(hm);
        


    }    
}
