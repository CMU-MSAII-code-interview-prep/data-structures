public class BST<K extends Comparable<K>, V> {

    private int size;
    private Node root;
    
    private class Node {
        public Node left;
        public Node right;
        public final V value;
        public final K key;
        public int height;

        public Node(K k, V v) {
            key   = k;
            value = v;
        }
    }

    public V get(K key) {
        return null;
    }

    public void put(K key, V val) {

    }

    public int size() {
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int rank(K key) {
        return -1;
    }

    public int rank(K key, Node x) {
        return -1;
    }

    public int size(K lo, K hi) {
        return -1;
    }
    
    public K min() {
        return null;
    }

    private Node min(Node node) {
        return null;
    }

    public K max() {
        return null;
    }

    private Node max(Node node) {
        return null;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {
        return null;
    }

    public void delete(K key) {

    }
    
    private Node delete(Node x, K key) {
        return null;
    }
}
