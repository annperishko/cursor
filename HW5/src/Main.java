public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> stack = new SinglyLinkedList<>();
        stack.push(20);
        stack.push(4);
        stack.push(12);
        stack.push(2);

        System.out.println("\t1. Linked list based Stack" +
                "\nStack: " + stack.toString() +
                "\nPop: " + stack.pop() +
                "\nStack: " + stack.toString() +
                "\nSize: " + stack.size() +
                "\nTop: " + stack.top() +
                "\nIs empty? "+ stack.isEmpty());

        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.addFirst("Head");
        list.addLast("Tail");
        list.add(1, "0");
        list.add(1, "2");

        System.out.println("\t2. Doubly linked list " + "\nList: " + list +
                "\nSize: " + list.size());
        list.removeFirst();
        System.out.println("List: "+ list);
        list.removeLast();
        System.out.println(list.isEmpty());

        DoublyLinkedListQueue<Integer> intQueue = new DoublyLinkedListQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);

        System.out.println("\t3. Doubly linkedList based Queue"
        + "\nList: "+ intQueue + "\nSize: " + intQueue.size());
        intQueue.dequeue();
        System.out.println("\nList after removing element: " + intQueue +
                "\nSize: " + intQueue.size());

    }
}
