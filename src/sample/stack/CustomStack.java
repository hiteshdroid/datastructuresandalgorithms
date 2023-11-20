package sample.stack;

import java.util.EmptyStackException;

public class CustomStack {

    private int size = 0;
    private Node head;

    public static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public Node pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Node pop = head;
        head = head.next;
        size--;
        return pop;
    }

    public Node peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return head;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }
}
