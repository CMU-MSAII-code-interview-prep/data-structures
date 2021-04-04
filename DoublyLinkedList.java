class DoublyLinkedList {

    Node head;
    Node tail;
    int  size;

    private class Node {
        String data;
        Node   next;
        Node   prev;

        public Node(String key){
            data = key;
            next = null;
            prev = null;
        }
    }

    public void addFront(String key){
        Node curr = new Node(key);
        if(size != 0) {
            head.prev = curr;
        }
        else tail = curr;
        curr.next = head;
        curr.prev = null;
        head = curr;
        size++;
    }

    public String removeFront(){
        if(size == 0) throw new RuntimeException("Can not removeFront from empty doubly linked list");
        Node front = head;
        head = front.next;
        if(front.next != null) front.next.prev = front.prev;
        else tail = null;
        size--;
        return front.data;
    }

    public void addBack(String key){
        Node curr = new Node(key);
        if(size != 0) tail.next = curr;
        else head = curr;
        curr.prev = tail;
        curr.next = null;
        tail = curr;
        size++;
    }

    public String removeBack(){
        throw new UnsupportedOperationException("Not implemented");
    }

    public String remove(String key){
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while(curr != null){
            sb.append(curr.data);
            sb.append(" ");
            curr = curr.next;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        DoublyLinkedList doubly = new DoublyLinkedList();
        doubly.addFront("a");
        doubly.addFront("b");
        doubly.addFront("c");

        doubly.addBack("x");
        doubly.addBack("y");
        doubly.addBack("z");
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        
        doubly.addFront("a");
        doubly.addFront("b");
        doubly.addFront("c");
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
    }



}