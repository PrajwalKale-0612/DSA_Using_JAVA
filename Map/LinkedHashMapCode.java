import java.util.*;

public class LinkedHashMapCode {

    static class LinkedHashMapCustom<K, V> {

        class Node {
            K key;
            V value;

            // Hash bucket chain
            Node bucketNext;

            // Insertion-order list
            Node prev;
            Node next;

            Node(K key, V value) 
            {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;

        private Node[] buckets;

        private Node head;
        private Node tail;

        @SuppressWarnings("unchecked")
        LinkedHashMapCustom() {

            n = 0;
            N = 4;

            buckets = (Node[]) new LinkedHashMapCustom.Node[N];

            head = null;
            tail = null;
        }

        private int hashFunction(K key) 
        {

            int hc = key.hashCode();

            return Math.abs(hc) % N;
        }

        private Node searchInBucket(K key, int bi) 
        {

            Node current = buckets[bi];

            while (current != null) {

                if (current.key.equals(key)) 
                {
                    return current;
                }

                current = current.bucketNext;
            }

            return null;
        }

        private void addToLinkedList(Node node) {

            if (head == null) {

                head = node;
                tail = node;

            } else {

                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        public void put(K key, V value) {

            int bi = hashFunction(key);

            Node existingNode = searchInBucket(key, bi);

            if (existingNode != null) {

                existingNode.value = value;
                return;
            }

            Node newNode = new Node(key, value);

            // Insertion order list
            addToLinkedList(newNode);

            // Hash bucket chain
            newNode.bucketNext = buckets[bi];
            buckets[bi] = newNode;

            n++;

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {

            int bi = hashFunction(key);

            Node node = searchInBucket(key, bi);

            if (node != null) {
                return node.value;
            }

            return null;
        }

        public boolean containsKey(K key) {

            int bi = hashFunction(key);

            return searchInBucket(key, bi) != null;
        }

        public V remove(K key) {

            int bi = hashFunction(key);

            Node current = buckets[bi];
            Node previousBucketNode = null;

            while (current != null) {

                if (current.key.equals(key)) {

                    // Remove from bucket
                    if (previousBucketNode == null) {
                        buckets[bi] = current.bucketNext;
                    } else {
                        previousBucketNode.bucketNext =
                                current.bucketNext;
                    }

                    // Remove from insertion-order list
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }

                    if (current.next != null) {
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev;
                    }

                    n--;

                    return current.value;
                }

                previousBucketNode = current;
                current = current.bucketNext;
            }

            return null;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {

            Node[] oldBuckets = buckets;

            N = N * 2;

            buckets = (Node[]) new LinkedHashMapCustom.Node[N];

            Node current = head;

            while (current != null) {

                current.bucketNext = null;

                int bi = hashFunction(current.key);

                current.bucketNext = buckets[bi];

                buckets[bi] = current;

                current = current.next;
            }
        }

        public void print() {

            Node current = head;

            while (current != null) {

                System.out.println(
                        current.key + " = " + current.value);

                current = current.next;
            }
        }

        public int size() {
            return n;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {

        LinkedHashMapCustom<String, Integer> map =
                new LinkedHashMapCustom<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("Nepal", 5);
        map.put("USA", 200);

        map.print();

        System.out.println("India = "
                + map.get("India"));

        System.out.println("Contains Nepal = "
                + map.containsKey("Nepal"));

        System.out.println("Removed = "
                + map.remove("China"));

        System.out.println();

        map.print();
    }
}