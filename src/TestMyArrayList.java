import java.util.ArrayList;
import java.util.List;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }

        list.remove(1);
        System.out.println();
        list.add(5);
        list.remove(1);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf(5));


    }
}
