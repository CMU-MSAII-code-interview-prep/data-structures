package LinkedLists;

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
        if(size != 0)   head.prev = curr;
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
        if(front.next != null) front.next.prev = null;
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
        if(size == 0) throw new RuntimeException("Can not removeFront from empty doubly linked list");
        Node back = tail;
        tail = back.prev;
        if(back.prev == null) head = null;
        else back.prev.next = null;
        size--;
        return back.data;
    }

    public String remove(String key){
        if(size == 0) throw new RuntimeException("Can not removeFront from empty doubly linked list");
        else if(key == head.data) return removeFront();
        else if(key == tail.data) return removeBack();

        Node curr = head;

        while(curr != null && curr.data != key) curr = curr.next;

        if(curr == null) throw new Error("Item not found");

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        return curr.data;
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
        System.out.println(doubly);
        doubly.removeFront();
        System.out.println(doubly);
        doubly.removeFront();
        doubly.addBack("y");
        System.out.println(doubly);
        doubly.removeBack();
        System.out.println(doubly);
        doubly.addFront("b");
        System.out.println(doubly);
        doubly.removeBack();
        doubly.addBack("y1");
        doubly.addBack("y2");
        doubly.addBack("y3");
        System.out.println(doubly);
        doubly.removeBack();
        doubly.removeFront();
        doubly.removeFront();
        doubly.removeFront();
        doubly.addFront("c");
        doubly.addBack("y2");
        doubly.addFront("a");
        doubly.addFront("b");
        doubly.addFront("c");
        doubly.addFront("d");
        System.out.println(doubly);
        doubly.remove("c");
        System.out.println(doubly);
        doubly.remove("c");
        System.out.println(doubly);
    }



}