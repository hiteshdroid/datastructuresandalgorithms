package sample.linkedlists;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import sample.linkedlists.LinkedList.Node;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void should_add_front() {
        // Given
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);

        // When
        Node first = linkedList.getFirst();
        Node last = linkedList.getLast();
        // Then
        Assert.assertEquals(3, first.data);
        Assert.assertEquals(1, last.data);
    }

    @Test
    public void should_add_to_back() {
        // Given
        linkedList.addToBack(1);
        linkedList.addToBack(2);
        linkedList.addToBack(3);

        // When
        Node first = linkedList.getFirst();
        Node last = linkedList.getLast();
        // Then
        Assert.assertEquals(1, first.data);
        Assert.assertEquals(3, last.data);
    }

    @Test
    public void should_get_last_if_head_exists() {
        // Given
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        // When
        Node last = linkedList.getLast();
        // Then
        Assert.assertEquals(1, last.data);
    }

    @Test(expected = IllegalStateException.class)
    public void should_throw_exception_when_getlast_with_empty_linkedlist() {
        // When
        linkedList.getLast();
    }

    @Test
    public void should_get_size() {
        // Given
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        // When
        int size = linkedList.getSize();
        // Then
        Assert.assertEquals(3, size);
    }

    @Test
    public void should_clear_linked_list() {
        // Given
        linkedList.addToBack(1);
        linkedList.addToBack(2);
        linkedList.addToBack(3);
        // When
        linkedList.clear();
        // Then
        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void should_delete_node_with_value() {
        // Given
        linkedList.addToBack(1);
        linkedList.addToBack(2);
        linkedList.addToBack(3);
        linkedList.addToBack(4);

        // When
        linkedList.deleteNode(2);
        // Then

        Assert.assertEquals(3, linkedList.getSize());
    }

    @After
    public void tearDown() {
        linkedList = null;
    }
}