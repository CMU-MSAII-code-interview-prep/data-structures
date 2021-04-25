package Searching;


class SequentalSearchST<K, V> {

    private Node first;

    private class Node {
        K key;
        V val;
        Node next;

        public Node(K key, V val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    // O(n)
    public boolean contains(K key) {
        return get(key) == null;
    }

    // O(n)
    public V get(K key) {
        for (Node x = first; x != null; x = x.next )
            if (key.equals(x.key))
                return x.val;
        return null;
    }

    // O(n)
    public void put(K key, V val) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        // after for loop
        first = new Node(key, val, first);
    }

    public static void main(String[] args) {
       
    }
}