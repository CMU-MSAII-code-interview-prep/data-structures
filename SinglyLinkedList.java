import java.util.LinkedList;

class SinglyLinkedList<T> {

    private Node head;
    private int  size;

    public SinglyLinkedList(){
        size = 0;
        head = null;
    }

    public void add(T value){
        Node curr = new Node(value);
        if(size++ > 0) curr.next = head;
        head = curr;
    }

    public void remove(T key){
        Node curr = head;
       
        Node prev = null;

        if(curr != null && curr.data == key){
            head = curr.next;
            size--;
            return;
        }

        while(curr != null && curr.data != key){
            prev = curr;
            curr = prev.next;
        }

        if(curr == null) return;

        prev.next = curr.next;
        size--;
    }


    public T remove(){
        if(size == 0) 
            throw new RuntimeException("Can not .remove() from empty linked list");
        T output = head.data;
        head = head.next;
        size--;
        return output;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node curr = head;
        while (curr != null) {
            sb.append(curr.data);
            sb.append(",");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();

    }

    private class Node{
        T data;
        Node   next;

        public Node(T value){
            data = value;
        }
    }

    public static void main(String args[]){
        SinglyLinkedList<String> linky = new SinglyLinkedList<String>();

        linky.add("Rob");
        linky.add("Bob");
        linky.add("Steve");

        System.out.println(linky);
        
        linky.remove("Bob");
        System.out.println(linky);
        linky.remove();
    }
}