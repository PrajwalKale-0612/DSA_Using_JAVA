// import java.util.*;

// public class HasmapCode {

//     static class Hasmap<K,V> {

//         // Node stores one key-value pair
//         public class Node 
//         {

//             K key;
//             V value;

//             public Node(K key, V value) 
//             {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         // Number of key-value pairs
//         private int n;

//         // Number of buckets
//         private int N;

//         // Array of LinkedLists
//         private LinkedList<Node>[] buckets;

//         // Constructor
        
//         public Hasmap() {

//             // Initially no elements
//             this.n = 0;

//             // Initially 4 buckets
//             this.N = 4;

//             this.buckets = new LinkedList[4];

//             // Create LinkedList for every bucket
//             for (int i = 0; i < buckets.length; i++) {
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         // Hash Function
//         public int hashFunction(K key) {

//             int hc = key.hashCode();

//             return Math.abs(hc) % N;
//         }

//         // Search key inside a LinkedList
//         public int searchInLL(K key, int bi) {

//             LinkedList<Node> ll = buckets[bi];

//             for (int i = 0; i < ll.size(); i++) {

//                 Node node = ll.get(i);

//                 // Use equals() instead of ==
//                 if (node.key.equals(key)) {
//                     return i;
//                 }
//             }

//             // Key not found
//             return -1;
//         }

//         // Rehashing
       
//         public void rehash() {

//             // Store old buckets
//             LinkedList<Node>[] oldBuckets = buckets;

//             // Double number of buckets
//             N = N * 2;

//             // Create new bucket array
//             buckets = new LinkedList[N];

//             // Initialize every LinkedList
//             for (int i = 0; i < buckets.length; i++) {
//                 buckets[i] = new LinkedList<>();
//             }

//             // Reinsert all old nodes
//             for (int i = 0; i < oldBuckets.length; i++) {

//                 LinkedList<Node> ll = oldBuckets[i];

//                 while (!ll.isEmpty()) {

//                     Node node = ll.remove();

//                     put(node.key, node.value);
//                 }
//             }
//         }

//         // Insert / Update
//         public void put(K key, V value) {

//             // Find bucket index
//             int bi = hashFunction(key);

//             // Search key in bucket
//             int di = searchInLL(key, bi);

//             // Key already exists
//             if (di != -1) {

//                 Node node = buckets[bi].get(di);

//                 // Update value
//                 node.value = value;
//             }

//             // Key does not exist
//             else {

//                 Node newNode = new Node(key, value);

//                 buckets[bi].add(newNode);

//                 n++;
//             }

//             // Load Factor
//             double lambda = (double) n / N;

//             // Rehash if load factor > 2
//             if (lambda > 2.0) {
//                 rehash();
//             }
//         }

//         // Check whether key exists
//         public boolean containsKey(K key) {

//             int bi = hashFunction(key);

//             int di = searchInLL(key, bi);

//             return di != -1;
//         }

//         // Get value
//         public V get(K key) {

//             int bi = hashFunction(key);

//             int di = searchInLL(key, bi);

//             // Key found
//             if (di != -1) {

//                 Node node = buckets[bi].get(di);

//                 return node.value;
//             }

//             // Key not found
//             return null;
//         }

//         // Remove key
//         public V remove(K key) {

//             int bi = hashFunction(key);

//             int di = searchInLL(key, bi);

//             // Key found
//             if (di != -1) {

//                 Node node = buckets[bi].remove(di);

//                 n--;

//                 return node.value;
//             }

//             // Key not found
//             return null;
//         }

//         // Return all keys
        // public ArrayList<K> keySet() {

        //     ArrayList<K> keys = new ArrayList<>();

        //     // Visit every bucket
        //     for (int i = 0; i < buckets.length; i++) {

        //         LinkedList<Node> ll = buckets[i];

        //         // Visit every node
        //         for (int j = 0; j < ll.size(); j++) {

        //             Node node = ll.get(j);

        //             keys.add(node.key);
        //         }
        //     }

        //     return keys;
        // }

//         // Check whether HashMap is empty
//         public boolean isEmpty() {

//             return n == 0;
//         }

//         // Return number of elements
//         public int size() {

//             return n;
//         }
//     }

//     // Main method
//     public static void main(String[] args) {

//         Hasmap<String, Integer> hm = new Hasmap<>();

//         // Insert elements
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("Nepal", 5);

//         // Print keys
//         ArrayList<String> keys = hm.keySet();

//         for (String key : keys) {
//             System.out.println(key);
//         }

//         // Get value
//         System.out.println("India: " + hm.get("India"));

//         // Check key
//         System.out.println("Contains India: "
//                 + hm.containsKey("India"));

//         System.out.println("Contains USA: "
//                 + hm.containsKey("USA"));

//         // Size
//         System.out.println("Size: " + hm.size());

//         // Remove
//         System.out.println("Removed: "
//                 + hm.remove("China"));

//         // Size after remove
//         System.out.println("Size after remove: "
//                 + hm.size());

//         // Empty check
//         System.out.println("Is Empty: "
//                 + hm.isEmpty());
//     }
// }





import java.util.*;
public class HasmapCode 
{
    public static class HashMap<K,V>
    {
        private class Node
        {
            K key;
            V value;

            public Node(K key,V value)
            {
                this.key=key;
                this.value=value;
            }

        } 

        private int n;
        private int N;
        private LinkedList<Node> bucket[];

        @SuppressWarnings ("unchecked")
        public HashMap()
        {
            this.N=4;
            this.bucket=new LinkedList[4];

            for (int i = 0; i < bucket.length; i++) 
            {
                bucket[i]=new LinkedList<>();    
            }
        }

        public void rehash()
        {

        }

        public int hashFunction(K key)
        {
            int hc=key.hashCode();
            int bi=Math.abs(hc)%N;
            return bi;
        }

        public int SearchInLL(K key,int bi)
        {
            LinkedList<Node>ll=bucket[bi];

            int di=0;

            for (int i = 0; i <ll.size(); i++) 
            {
                Node node = ll.get(i);
                if (node.key==key) 
                {
                    return di;
                } 
                di++;   
            }
            return -1;
        }



        public void rehash2()
        {
            LinkedList<Node>oldBucket[]=bucket;

            bucket=new LinkedList[N*2];
            N=N*2;

            for (int i = 0; i < oldBucket.length; i++) 
            {
                LinkedList<Node>ll=oldBucket[i];
                for (int j = 0; j < ll.size(); j++) 
                {
                    Node node=ll.remove();
                    put(node.key, node.value);    
                }    
            }
        }

        public void put(K key,V value)
        {
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi);

            if (di!=-1) 
            {
                Node node = bucket[bi].get(di);
                node.value=value;
            }
            else
            {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda=(double)n/N;
            if(lambda>2.0)
            {
                rehash2();
            }
        }


        public boolean containsKey(K key)
        {
            int bi=hashFunction(key);
            int di=SearchInLL(key, bi);

            if (di!=-1) 
            {
                return true;    
            }
            
            return false;
        }


        public V get(K key)
        {
            int bi=hashFunction(key);
            int di=SearchInLL(key, bi);

            if (di!=-1) 
            {
                Node node=bucket[bi].get(di);
                return node.value;    
            }
            return null;
        }


        public V remove(K key)
        {
            int bi=hashFunction(key);
            int di=SearchInLL(key, bi);

            if (di!=-1) 
            {
                Node node=bucket[bi].remove(di);
                n--;
                return node.value;    
            }
            return null;
        }


        public ArrayList<K> keySet()
        {
            ArrayList<K>keys=new ArrayList<>();

            for (int i = 0; i < bucket.length; i++) 
            {
                LinkedList<Node>ll=bucket[i];
                
                for (Node node : ll) 
                {
                    keys.add(node.key);    
                }
            }
            return keys;
        }

        
    }
    public static void main(String[] args) 
    {
        HashMap<String,Integer> Map=new HashMap<String,Integer>();

        Map.put("India", 150);
        Map.put("China", 170);
        Map.put("USA", 100);
        Map.put("New Zeland", 90);
        Map.put("Nepal", 5);
        Map.put("England", 50);




        ArrayList<String>keyName=Map.keySet();

        for (String key : keyName) 
        {
            System.out.println(key);    
        }


        System.out.println(Map.get("India"));
        System.out.println(Map.remove("India"));
        Map.put("India", 200);
        System.out.println(Map.get("India"));
        Map.put("India", 160);
        System.out.println(Map.get("India"));




    }
    
}