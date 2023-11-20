package sample.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static sample.queue.CustomQueue.*;

public class CustomQueueTest {

    private CustomQueue customQueue;

    @Before
    public void setUp() {
        customQueue = new CustomQueue();
    }

    @Test
    public void should_test_push() {
        // Given
        customQueue.push(1);
        customQueue.push(2);
        customQueue.push(3);

        // When
        int size = customQueue.size();

        // Then
        Assert.assertEquals(3, size);
    }

    @Test
    public void should_test_pop() {
        // Given
        customQueue.push(1);
        customQueue.push(2);
        customQueue.push(3);

        // When
        Node pop = customQueue.pop();
        int size = customQueue.size();

        // Then
        Assert.assertEquals(1, pop.data);
        Assert.assertEquals(2, size);
    }

    @Test(expected = EmptyStackException.class)
    public void should_throw_exception_on_pop_empty_queue() {
        // When
        customQueue.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void should_throw_exception_on_peek_empty_queue() {
        // When
        customQueue.peek();
    }
}
