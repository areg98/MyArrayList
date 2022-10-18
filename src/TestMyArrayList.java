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
        System.out.println();
        list.add(5,2);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        list.add(5);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }




    }
}
