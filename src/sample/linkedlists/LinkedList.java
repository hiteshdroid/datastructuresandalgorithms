package sample.linkedlists;

public class LinkedList {
    private int size = 0;
    static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    private Node head;

    public void addToFront(Object value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void addToBack(Object value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        if (head == null) {
            throw new IllegalStateException("Empty linked list");
        }
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    public int getSize() {
        return size;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void deleteNode(Object value) {
        if (head == null) {
            return;
        }

        printLinkedList();

        if (head.data == value) {
            head = head.next;
            size--;
            printLinkedList();
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                size--;
                printLinkedList();
                return;
            }
            current = current.next;
        }
    }

    private void printLinkedList() {
        if (head != null) {
            Node current = head;
            while (current.next != null) {
                System.out.print(current.data);
                if (current.next.next != null) {
                    System.out.print("->");
                }
                current = current.next;
            }
            System.out.print("->"+current.data);
            System.out.println();
        }
    }

}
