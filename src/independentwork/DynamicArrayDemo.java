package independentwork;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(4);
        dy.add(55);
        dy.add(32);
        dy.add(41);
        dy.add(46);
        dy.add(88);
        dy.add(74);
        dy.add(49);
        dy.add(56);
        dy.add(8);
        dy.add(53);
        dy.add(5);
        System.out.println(dy.getByIndex(2));
        dy.print();
        dy.deleteByIndex(9);
        dy.print();
        dy.set(4, 99);
        dy.print();
        dy.add(2, 77);
        dy.print();

    }
}
