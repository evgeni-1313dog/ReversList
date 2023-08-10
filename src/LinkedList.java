import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    private Node head;
    private Node tail;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    class Node {
        public Node next;
        public T value;
    }

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void deleteFirst() {
        if (head != null)
            head = head.next;
    }

    public T contains(T value) {
        Node node = head;
        while (node != null) {
            if (node.value.equals(value))
                return node.value;
                node = node.next;
        }
        return null;
    }

    public void Revers(){
        if(head == null && head.next != null){
            tail = head;
            Node current = head.next;
            head.next = null;
            while (current != null){
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }

        }
    }


}
