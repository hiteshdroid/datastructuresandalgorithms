package sample.hashtable;

public class HashTable {

    private final int size;
    private HashEntry[] hashEntries;

    public static class HashEntry {
        private Object key;
        private Object value;
        private HashEntry next;

        public HashEntry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int size) {
        this.size = size;
        hashEntries = new HashEntry[size];
    }

    public void put(Object key, String value) {
        HashEntry newEntry = new HashEntry(key, value);

        int index = getIndex(key);

        //System.out.println("Storing at "+index+" index");

        HashEntry entryAtIndex = hashEntries[index];

        if (entryAtIndex == null) {
            hashEntries[index] = newEntry;
        } else {
            while (entryAtIndex.next != null) {
                entryAtIndex = entryAtIndex.next;
            }

            entryAtIndex.next = newEntry;
        }
    }

    public Object get(Object key) {
        int index = getIndex(key);

        Object storedValue = null;

        HashEntry entryAtIndex = hashEntries[index];

        while (entryAtIndex != null) {
            if (entryAtIndex.key.equals(key)) {
                storedValue = entryAtIndex.value;
            }
            entryAtIndex = entryAtIndex.next;
        }

        return storedValue;
    }

    private int getIndex(Object key) {
        return Math.abs(key.hashCode()) % size;
    }
}
