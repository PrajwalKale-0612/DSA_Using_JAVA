public class HashWithOutCollection<K> {

    static class Node<K> {
        K data;
        Node<K> next;

        Node(K data) {
            this.data = data;
        }
    }

    private int N;
    private int n;

    private Node<K>[] buckets;

    @SuppressWarnings("unchecked")
    HashWithOutCollection() {
        N = 4;
        n = 0;

        buckets = (Node<K>[]) new Node[N];
    }

    public int hashFunction(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }

    public boolean contains(K key) {

        int bi = hashFunction(key);

        Node<K> currNode = buckets[bi];

        while (currNode != null) {

            if (currNode.data.equals(key)) {
                return true;
            }

            currNode = currNode.next;
        }

        return false;
    }

    public void add(K key) {

        if (contains(key)) {
            return;
        }

        int bi = hashFunction(key);

        Node<K> newNode = new Node<>(key);

        newNode.next = buckets[bi];
        buckets[bi] = newNode;

        n++;

        double lambda = (double) n / N;

        if (lambda > 2.0) {
            rehash();
        }
    }

    @SuppressWarnings("unchecked")
    public void rehash() {

        Node<K>[] oldBucket = buckets;

        N = N * 2;
        n = 0;

        buckets = (Node<K>[]) new Node[N];

        for (Node<K> head : oldBucket) {

            Node<K> currNode = head;

            while (currNode != null) {

                add(currNode.data);

                currNode = currNode.next;
            }
        }
    }

    public K remove(K key) {

        int bi = hashFunction(key);

        Node<K> prevNode = null;
        Node<K> currNode = buckets[bi];

        while (currNode != null) {

            if (currNode.data.equals(key)) {

                if (prevNode == null) {
                    buckets[bi] = currNode.next;
                }
                else {
                    prevNode.next = currNode.next;
                }

                n--;

                return currNode.data;
            }

            prevNode = currNode;
            currNode = currNode.next;
        }

        return null;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void print() {

        for (int i = 0; i < N; i++) {

            Node<K> currNode = buckets[i];

            while (currNode != null) {

                System.out.print(currNode.data + " ");

                currNode = currNode.next;
            }
        }

        System.out.println();
    }


    public static void main(String[] args) {

        HashWithOutCollection<Integer> hs =
                new HashWithOutCollection<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(3);
        hs.add(4);

        hs.print();

        System.out.println("Contains 2: " + hs.contains(2));

        System.out.println("Contains 5: " + hs.contains(5));

        System.out.println("Size: " + hs.size());

        System.out.println("Removed: " + hs.remove(2));

        System.out.println("Size: " + hs.size());

        System.out.println("Empty: " + hs.isEmpty());
    }
}