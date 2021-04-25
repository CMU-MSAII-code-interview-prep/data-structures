public class BST<K extends Comparable<K>, V> {

    private int size;
    private Node root;
    
    private class Node {
        public Node left;
        public Node right;
        public V value;
        public final K key;
        public int height;

        public Node(K k, V v) {
            key = k;
            value = v;
            left = null;
            right = null;
            height = 0;
        }
    }
    
    public BST() {
        root = null;
        size = 0;
    }

    public V get(K key) 
    { return get(key, root); }

    private V get(K key, Node node) {
        if (node == null)
            return null;

        int cmp = key.compareTo(node.key);
        if (cmp < 0)      return get(key, node.left);
        else if (cmp > 0) return get(key, node.right);
        else              return node.value;
    }

    public void put(K key, V val) 
    { root = put(key, val, root); }

    public Node put(K key, V val, Node node) {
        if (node == null) return new Node(key, val);
        int cmp = key.compareTo(node.key);
        if      (cmp < 0) node.right  = put(key, val, node.right);
        else if (cmp > 0) node.left   = put(key, val, node.left);
        else              node.value  = val;
        node.height = size(node.left) + size(node.right) + 1;
        return node;
    }

    private int size(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
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
