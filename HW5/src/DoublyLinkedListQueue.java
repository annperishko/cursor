import java.util.NoSuchElementException;

public class DoublyLinkedListQueue<E> {

    private int size = 0;

    private Node<E> head;
    private Node<E> tail;

    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void enqueue(E element) {
        if (size == 0) {
            tail = new Node<>(element, null, tail);
            head = tail;
        }
        tail.next = new Node<>(element, null, tail);
        tail = tail.next;
        size++;
    }

    public void dequeue() {
        if (size == 0) throw new NoSuchElementException();
        else if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DoublyLinkedListQueue{ ");
        if (size == 0) return sb.toString() + " }";
        Node<E> nextNode = head;
        sb.append(head.element);
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            sb.append(", ").append(nextNode.element);
        }
        return sb.append(" }").toString();
    }
}
