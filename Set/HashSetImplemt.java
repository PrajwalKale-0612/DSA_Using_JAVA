import java.util.HashSet;

public class HashSetImplemt 
{
    public static void main(String[] args) 
    {
        HashSet<Integer>hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(9);
        hs.add(4);
        hs.add(6);
        hs.add(4);
        hs.add(7);
        hs.add(8);
        hs.add(5);

        System.out.println(hs);
    }
    
}




// public class HashSetWitoutCollection 
// {

//     // Node
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     private Node[] buckets;
//     private int N;
//     private int size;

//     // Constructor
//     public HashSetWitoutCollection() {

//         N = 4;
//         size = 0;

//         buckets = new Node[N];
//     }

//     // Hash function
//     private int hashFunction(int key) {

//         return Math.abs(key) % N;
//     }

//     // Contains
//     public boolean contains(int key) {

//         int bucketIndex = hashFunction(key);

//         Node current = buckets[bucketIndex];

//         while (current != null) {

//             if (current.data == key) {
//                 return true;
//             }

//             current = current.next;
//         }

//         return false;
//     }

//     // Add
//     public void add(int key) {

//         // Duplicate check
//         if (contains(key)) {
//             return;
//         }

//         int bucketIndex = hashFunction(key);

//         Node newNode = new Node(key);

//         newNode.next = buckets[bucketIndex];

//         buckets[bucketIndex] = newNode;

//         size++;

//         // Load factor
//         double lambda = (double) size / N;

//         if (lambda > 2.0) {
//             rehash();
//         }
//     }

//     // Remove
//     public void remove(int key) {

//         int bucketIndex = hashFunction(key);

//         Node current = buckets[bucketIndex];

//         Node previous = null;

//         while (current != null) {

//             if (current.data == key) {

//                 // First node
//                 if (previous == null) {
//                     buckets[bucketIndex] = current.next;
//                 }

//                 // Middle / last node
//                 else {
//                     previous.next = current.next;
//                 }

//                 size--;

//                 return;
//             }

//             previous = current;
//             current = current.next;
//         }
//     }

//     // Rehash
//     private void rehash() {

//         Node[] oldBuckets = buckets;

//         N = N * 2;

//         buckets = new Node[N];

//         size = 0;

//         for (Node head : oldBuckets) {

//             Node current = head;

//             while (current != null) {

//                 add(current.data);

//                 current = current.next;
//             }
//         }
//     }

//     // Size
//     public int size() {
//         return size;
//     }

//     // Is Empty
//     public boolean isEmpty() {
//         return size == 0;
//     }

//     // Print
//     public void print() {

//         for (int i = 0; i < N; i++) {

//             Node current = buckets[i];

//             while (current != null) {

//                 System.out.print(current.data + " ");

//                 current = current.next;
//             }
//         }

//         System.out.println();
//     }

//     // Main
//     public static void main(String[] args) {

//         HashSetWitoutCollection set = new HashSetWitoutCollection();
//         set.add(10);
//         set.add(20);
//         set.add(10);
//         set.add(30);
//         set.add(40);

//         System.out.println("HashSet:");
//         set.print();

//         System.out.println("Contains 20: "
//                 + set.contains(20));

//         System.out.println("Contains 50: "
//                 + set.contains(50));

//         set.remove(20);

//         System.out.println("After removing 20:");
//         set.print();

//         System.out.println("Size: "
//                 + set.size());

//         System.out.println("Is Empty: "
//                 + set.isEmpty());    
// }

// }
