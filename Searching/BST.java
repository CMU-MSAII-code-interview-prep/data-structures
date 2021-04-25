package Searching;

import Interfaces.Date;

public class BST {

    /**
     * Private class which
     * represents a node in the binary tree
     */
    private class Node {
        // the pointers to right and left children
        Node left;
        Node right;

        // key and value of the node
        Comparable key;
        int val;

        /**
         * Constructor for the Node class
         * it accepts a Comparable key
         * and an integer value
         */
        public Node(Comparable key, int val) {
            this.key = key;
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node root;
    private int  size;

    public BST() {
        root = null;
        size = 0;
    }

    public void put(Comparable key, int value) {
        root = put(key, value, root);
    }
    
    private Node put(Comparable key, int value, Node node) {
        if (node == null)
            return new Node(key, value);
        
        int cmp = key.compareTo(node.key);

        if(cmp > 0)
            node.right = put(key, value, node.right);
        else if (cmp < 0)
            node.left  = put(key, value, node.left);
        else
            node.val = value;

        return node;
    }

    public Integer get(Comparable key) {
        return get(key, root);
    }
    
    private Integer get(Comparable key, Node node) {
        if (node == null)
            return null;
        
        int cmp = key.compareTo(node.key);

        if      (cmp > 0) return get(key, node.right);
        else if (cmp < 0) return get(key, node.left);
        else              return node.val;
    }


    public static void main(String[] args) {
        BST myTree = new BST();

        Date d0 = new Date(2009, 5, 10);
        Date d1 = new Date(2015, 2, 10);
        Date d2 = new Date(2012, 9, 10);
        Date d3 = new Date(2010, 3, 10);
        Date d4 = new Date(2016, 9, 10);
        Date d5 = new Date(2013, 12, 10);
        Date d6 = new Date(2014, 11, 10);
        Date d7 = new Date(2011, 1, 10);

        myTree.put(d0, 144);
        myTree.put(d1, 24);
        myTree.put(d2, 251);
        myTree.put(d3, 233);
        myTree.put(d4, 151);
        myTree.put(d5, 2);
        myTree.put(d6, -3);
        myTree.put(d7, 852);

        System.out.println(myTree.get(new Date(2013, 12, 10)));
    }

}
