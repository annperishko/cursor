
    import java.util.NoSuchElementException;

    public class DoublyLinkedList<E> {

        private int size;
        private Node<E> head;
        private Node<E> tail;

        private class Node<E> {
            E element;
            Node<E> prev;
            Node<E> next;

            Node(Node<E> prev, Node<E> next, E element) {
                this.element = element;
                this.prev = prev;
                this.next = next;
            }
        }

        public void addFirst(E element) {
            Node<E> newNode = new Node<>(null, head, element);
            if (size > 0) {
                head.prev = newNode;
            }
            head = newNode;
            if (size == 0) tail = head;
            size++;
        }

        public void addLast(E element) {
            if (size == 0) {
                tail = new Node<>(tail, null, element);
                head = tail;
            }
            tail.next = new Node<>(tail, null, element);
            tail = tail.next;
            size++;
        }
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public Node<E> removeFirst() {
            if (size == 0){
                throw new RuntimeException("List is empty");
            };
            Node<E> temp = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
            return temp;
        }

        public Node<E> removeLast() {
            if (size == 0){
                throw new RuntimeException("List is empty");
            };
            Node<E> temp = head;
            head = head.next;
            head.prev = null;
            size--;
            return temp;
        }

        public void add(int index, E element) {
            if (index > size || index < 0) throw new NullPointerException();
            else if (index == 0) addFirst(element);
            else if (index == size) addLast(element);
            else {
                Node<E> node = findNodeByIndex(index);
                Node<E> newNode = new Node<>(node.prev, node, element);
                node.prev.next = newNode;
                node.prev = newNode;
                size++;
            }
        }

        private Node<E> findNodeByIndex(int index) {
            Node<E> nextNode;
            if (index <= size / 2) {
                nextNode = head;
                for (int pointer = 1; pointer <= index; pointer++) {
                    nextNode = nextNode.next;
                }
            } else {
                nextNode = tail;
                for (int pointer = size - 1; pointer > index; pointer--) {
                    nextNode = nextNode.prev;
                }
            }
            return nextNode;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("DoublyLinkedList{ ");
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

