package sample.arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

//        insert(arr, 4, 9, 4);
//        printArr(arr);
//        System.out.println(" ");
        delete(arr, 4, 1);
        printArr(arr);
    }

    public static void insert(int[] arr, int size, int index, int value) {
        if (index >= arr.length) {
            return;
        }

        if (index > size) {
            arr[index] = value;
            return;
        }

        for (int j = size; j > index; j--) {
            arr[j] = arr[j-1];
        }

        arr[index] = value;
    }

    public static void delete(int[] arr, int size, int index) {
        if (index>= arr.length || index > size) {
            return;
        }

        if (index == size) {
            arr[index] = 0;
            return;
        }

        for (int j = index; j < size; j++) {
            arr[j] = arr[j+1];
        }
    }

    private static void printArr(int[] arr) {
        for(int i = 0; i< arr.length; i ++) {
            System.out.print(arr[i]+" ");
        }
    }
}
