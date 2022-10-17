// ArrayList in Java has a get(int index) method. int is a signed 32 bit value,
// with a maximum value of 2,147,483,647.
// That is the largest possible value that can be accessed in an ArrayList
// Our Array list max size is 200000000, because of:
// 1. Requested array size exceeds VM limit
//
//
// 2. Java heap space

public class MyArrayList {
    private final int fullSize = 200000000;
    private int size;
    private int temp;
    private int[] intArr, intArr1;

    MyArrayList() {
        temp = -1;
        this.intArr1 = new int[fullSize];
    }

    public boolean add(int item) {
        this.intArr = new int[++size];
        intArr1[++temp] = item;
        for (int i = 0; i < size; i++) {
            intArr[i] = intArr1[i];
        }
        return true;
    }

    public int get(int index) {
        return intArr[index];
    }

    public int size() {
        return this.size;
    }
}
