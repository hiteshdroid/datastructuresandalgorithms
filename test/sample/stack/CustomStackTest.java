package sample.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static sample.stack.CustomStack.*;

public class CustomStackTest {
    private CustomStack customStack;

    @Before
    public void setUp() {
        customStack = new CustomStack();
    }

    @Test
    public void should_test_push() {
        // Given
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        // When
        int size = customStack.size();

        // Then
        Assert.assertEquals(3, size);
    }

    @Test
    public void should_test_pop() {
        // Given
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        // When
        Node pop = customStack.pop();
        int size = customStack.size();

        // Then
        Assert.assertEquals(3, pop.data);
        Assert.assertEquals(2, size);
    }

    @Test(expected = EmptyStackException.class)
    public void should_test_pop_from_empty_stack() {
        // When
        Node pop = customStack.pop();
    }

    @Test
    public void should_test_peek() {
        // Given
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        // When
        Node peek = customStack.peek();
        int size = customStack.size();

        // Then
        Assert.assertEquals(3, peek.data);
        Assert.assertEquals(3, size);
    }

    @Test(expected = EmptyStackException.class)
    public void should_throw_exception_on_peek_empty_stack() {
        // When
        Node peek = customStack.peek();
    }
}
