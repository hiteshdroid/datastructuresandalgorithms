package sample.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {

    private HashTable hashTable;

    @Before
    public void setup() {
        hashTable = new HashTable(10);
    }

    @Test
    public void should_test_adding_to_hashtable() {
        // Given
        hashTable.put("Hitesh", "1001");
        hashTable.put("Ankit", "1002");
        hashTable.put("Amit", "1003");

        // When
        Object hiteshValue = hashTable.get("Hitesh");
        Object ankitValue = hashTable.get("Ankit");
        Object amitValue = hashTable.get("Amit");

        // Then
        Assert.assertEquals("1001", hiteshValue);
        Assert.assertEquals("1002", ankitValue);
        Assert.assertEquals("1003", amitValue);
    }

    @After
    public void tearDown() {
        hashTable = null;
    }
}
