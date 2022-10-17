import java.util.ArrayList;
import java.util.List;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyArrayList list1 = new MyArrayList();
        for (int i = 1; i < 26; i++) {
            list.add(i);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
        list.clone(list1);
        List<Integer>arr = new ArrayList<Integer>() ;
        arr.add(4);
        System.out.println(arr.get(0));

        MyArrayList list1 = new MyArrayList();
        list1.add(4);
        System.out.println(list1.get(0));

    }
}
