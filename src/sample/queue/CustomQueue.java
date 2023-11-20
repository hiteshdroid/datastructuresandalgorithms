package sample.queue;

import java.util.EmptyStackException;

public class CustomQueue {
    private int size;
    Node head;
    Node tail;

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

    public static class Node {
        Object data;
        Node next;

         public Node(Object data) {
            this.data = data;
        }
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }
}
