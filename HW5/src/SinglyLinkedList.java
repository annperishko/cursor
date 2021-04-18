import java.util.Arrays;
import java.util.Objects;

public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private int size;


    private static class Node<E> {
        E data;
        Node<E> next;
    }

    public void push(E data){
        Node<E> oldHead = head;
        head = new Node<>();
        head.data = data;
        head.next = oldHead;
        size++;
    }

    public E pop ()throws LinkedListIsEmptyException {
        if (isEmpty()) {
            throw new LinkedListIsEmptyException();
        }
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }
    public E top() {
        if (isEmpty())
            throw new LinkedListIsEmptyException();
        return head.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNode = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 1)
                stringBuilder.append(nextNode.data);
            else
                stringBuilder.append(nextNode.data).append(", ");
            nextNode = nextNode.next;
        }
        return "[" + stringBuilder + "]";
    }


}
