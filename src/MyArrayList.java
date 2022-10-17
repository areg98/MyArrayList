// ArrayList in Java has a get(int index) method. int is a signed 32 bit value,
// with a maximum value of 2,147,483,647.
// That is the largest possible value that can be accessed in an ArrayList
// Our Array list max size is 200000000, because of:
// 1. Requested array size exceeds VM limit
// 2. Java heap space

public class MyArrayList {
    private final int fullSize = 20000000;
    private int size;
    private int temp;
    private int[] arr, arr1;

    MyArrayList() {
        size = 0;
        temp = -1;
        this.arr1 = new int[fullSize];
    }

    public boolean add(int item) {
        this.arr = new int[++size];
        arr1[++temp] = item;
        for (int i = 0; i < size; i++) {
            arr[i] = arr1[i];
        }
        return true;
    }

    public void remove(int index){
        this.arr = new int[--size];
        for (int i = 0, j = 0; i < size; i++, j++) {
            if (i == index) {
                j++;
            }
            arr[i] = arr1[j];
        }
        this.arr1 = new int[fullSize];
        this.temp--;
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int item) {
        for (int i = 0; i < this.size; i++) {
            if (arr[i] == item) return true;

        }
        return false;
    }

    public void clear() {
        size = 0;
        temp = -1;
        this.arr = new int[size];
        this.arr1 = new int[fullSize];

    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int indexOf(int num){
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }
    public int lastIndexOf(int num){
        for (int i = size-1; i >= 0; i--) {
            if (arr[i] == num) return i;
        }
        return -1;
    }
}
