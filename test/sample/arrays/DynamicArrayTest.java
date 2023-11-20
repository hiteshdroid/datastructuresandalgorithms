package sample.arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DynamicArrayTest {

    private DynamicArray<String> dynamicArray;

    @Before
    public void setUp() {
        dynamicArray = new DynamicArray<String>(2);
    }

    @Test
    public void should_set_and_get() {
        // Given
        this.dynamicArray.set(0, "a");
        // When
        Object output = this.dynamicArray.get(0);
        // Then
        Assert.assertEquals("a", output);
    }

    @Test
    public void should_add_to_the_dynamic_array() {
        // Given

        // When
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");

        // Then
        Assert.assertEquals(4, dynamicArray.size());
        Assert.assertEquals("a", dynamicArray.get(0));
        Assert.assertEquals("b", dynamicArray.get(1));
        Assert.assertEquals("c", dynamicArray.get(2));
        Assert.assertEquals("d", dynamicArray.get(3));
    }

    @Test
    public void should_insert_at_index_to_the_dynamic_array() {
        // Given
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");

        // When
        dynamicArray.insert(1, "e");

        // Then
        Assert.assertEquals(5, dynamicArray.size());
        Assert.assertEquals("a", dynamicArray.get(0));
        Assert.assertEquals("e", dynamicArray.get(1));
        Assert.assertEquals("b", dynamicArray.get(2));
        Assert.assertEquals("c", dynamicArray.get(3));
        Assert.assertEquals("d", dynamicArray.get(4));
    }

    @Test
    public void should_delete_at_index_to_the_dynamic_array() {
        // Given
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");

        // When
        dynamicArray.delete(1);

        // Then
        Assert.assertEquals(3, dynamicArray.size());
        Assert.assertEquals("a", dynamicArray.get(0));
        Assert.assertEquals("c", dynamicArray.get(1));
        Assert.assertEquals("d", dynamicArray.get(2));
    }

    @Test
    public void should_check_if_empty() {
        // Given
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");

        // When
        boolean empty = dynamicArray.isEmpty();

        // Then
        Assert.assertEquals(empty, false);
    }

    @Test
    public void should_check_if_contains() {
        // Given
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");

        // When
        boolean empty = dynamicArray.doesContain("b");

        // Then
        Assert.assertEquals(empty, true);
    }



    @After
    public void tearDown() {
        dynamicArray = null;
    }

}