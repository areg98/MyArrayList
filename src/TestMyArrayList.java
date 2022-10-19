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
      //  list.add(13);
//        list.add(15);
     //  System.out.println(list.get(0));
//        System.out.println(list.get(1));
      System.out.println(list.size());
      for(int i=0; i<list.size(); i++){
          System.out.print(list.get(i) + " ");
      }
//        System.out.println(list.contains(22));
        //list.clear();
       // System.out.println(list.isEmpty());
        list.remove(3);
        System.out.println("---------");
       // System.out.println(list.get(3));
       // System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//        System.out.println(list.get(6));
        System.out.println("---------");
        System.out.println(list.size());
        list.add(98);
        System.out.println("-yyyy-----");
        list.remove(2);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }





    }
}
