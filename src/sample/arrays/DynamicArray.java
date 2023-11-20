package sample.arrays;

public class DynamicArray<T> {

    private int size;
    private Object[] data;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.initialCapacity = initialCapacity;
    }

    public void set(int index, Object value) {
        this.data[index] = value;
    }

    public Object get(int index) {
        return this.data[index];
    }

    public void insert(int index, T value) {
    // Check size
        if (size == initialCapacity) {
            resize();
        }
   // Do the insert
         for (int j = size; j > index; j--) {
             data[j] = data[j - 1];
         }
         data[index] = value;
         size++;
    }

    public void resize() {
        Object[] newArray = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newArray[i] = this.data[i];
        }
        this.data = newArray;
        this.initialCapacity = initialCapacity * 2;
    }

    public int size() {
        return size;
    }

    public void add(T a) {
        if (size ==  initialCapacity) {
            resize();
        }
        this.data[size] = a;
        size++;
    }

    public void delete(int index) {
        if (index > size) {
            return;
        }

        for (int j = index; j < size - 1; j++) {
            this.data[j] = this.data[j+1];
        }
        this.data[size - 1] = null;
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean doesContain(Object value) {
        for (int i = 0; i < size; i++) {
            if(this.data[i] == value) {
                return true;
            }
        }
        return false;
    }
}
