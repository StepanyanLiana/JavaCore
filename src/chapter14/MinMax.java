package chapter14;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
 class MyClass<T extends  Comparable<T>> implements  MinMax<T> {
    T[] vals;
    MyClass(T[] o){
        vals = o;
    }
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
            return v;
    }
    public  T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
    }
    class GenIFDemo {
        public static void main(String[] args) {
            Integer[] inums = {3, 6, 2, 8, 6};
            Character[] chs = {'b', 'r', 'p', 'w'};
            MyClass<Integer> iob = new MyClass<>(inums);
            MyClass<Character> cob = new MyClass<>(chs);
            System.out.println("Maкcимaльнoe значение в массиве inums: " + iob.max());
            System.out.println("Mинимaльнoe значение в массиве inums:" + iob.min());
            System.out.println("Maкcимaльнoe значение в массиве cob:" + cob.max());
            System.out.println("Mинимaльнoe значение в массиве cob:" + cob.min());
        }
    }

