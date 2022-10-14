public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 1; i < 26; i++) {
            list.add(i);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
