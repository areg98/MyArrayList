    public class MyArrayList {
        private final int fullSize = 200000000;
        private int size;
        private int temp;
        private byte[] byteArr, byteArr1;
        private short[] shortArr, shortArr1;
        private int[] intArr, intArr1;
        private long[] longArr, longArr1;
        private float[] floatArr, floatArr1;
        private double[] doubleArr, doubleArr1;
        private char[] charArr, charArr1;

        MyArrayList(String type) {

            // ArrayList in Java has a get(int index) method. int is a signed 32 bit value,
            // with a maximum value of 2,147,483,647.
            // That is the largest possible value that can be accessed in an ArrayList
            // Our Array list max size is 200000000, because of:
            // 1. Requested array size exceeds VM limit
            // 2. Java heap space

            temp = -1;

            switch (type) {
                case "byte": {
                    this.byteArr1 = new byte[fullSize];
                    break;
                }
                case "short": {
                    this.shortArr1 = new short[fullSize];
                    break;
                }
                case "int": {
                    this.intArr1 = new int[fullSize];
                    break;
                }
                case "long": {
                    this.longArr1 = new long[fullSize];
                    break;
                }
                case "float": {
                    this.floatArr1 = new float[fullSize];
                    break;
                }
                case "double": {
                    this.doubleArr1 = new double[fullSize];
                    break;
                }
                case "char": {
                    this.charArr1 = new char[fullSize];
                    break;
                }
                default: {
                    // error message
                    System.out.println("\u001B[31m" + "Exception: Incorrect data type" + "\u001B[0m");
                }
            }
        }

        public boolean add(char item){
            this.charArr = new char[++size];
            charArr1[++temp] = item;
            for (int i = 0; i < size; i++) {
                this.charArr[i] = this.charArr1[i];
            }
            return true;
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
            if (intArr != null) return intArr[index];
            else if (charArr != null) return charArr[index];
            else return -1;
        }

        public static void main(String[] args) {
            MyArrayList myArrayList = new MyArrayList("int");
            for (int i = 0; i < 100; i++) {
                myArrayList.add(i);
//            System.out.println(myArrayList.get(i));
            }
            System.out.println(myArrayList.get(5));

            MyArrayList list = new MyArrayList("char");
            list.add('l');
            System.out.println(list.get(0));
        }


}
