import java.util.ArrayList;
import java.util.List;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
       // System.out.println(list.isEmpty());
        list.add(14);
        list.add(12);
        list.add(0);
        list.add(18);
        list.add(23);
        list.add(45);
        list.add(32);
        list.add(65);
      System.out.println(list.size());
      for(int i=0; i<list.size(); i++){
          System.out.print(list.get(i) + " ");
      }
        //list.remove(3);
        System.out.println("---------");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("---------");
        System.out.println(list.size());
        list.add(98);
        System.out.println("-yyyy-----");
        list.remove(2);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        list.removeRange(2,5);
        System.out.println();
        System.out.println("-xxxxxxx-----");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }





    }
}
