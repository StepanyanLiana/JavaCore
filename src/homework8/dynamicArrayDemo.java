package homework8;

public class dynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamic = new DynamicArray();
        dynamic.add(45);
        dynamic.add(15);
        dynamic.add(78);
        dynamic.add(93);
        dynamic.add(37);
        dynamic.add(38);
        dynamic.add(26);
        dynamic.add(8);
        dynamic.add(7);
        dynamic.add(88);
        dynamic.add(74);
        dynamic.add(88);
        System.out.println(dynamic.getByIndex(0));
        System.out.println(dynamic.getByIndex(-1));
        dynamic.print();
        dynamic.deleteByIndex(19);
        dynamic.deleteByIndex(5);
        dynamic.deleteByIndex(9);
        dynamic.deleteByIndex(0);
        dynamic.set(6, 23);
        dynamic.set(1, 62);
        dynamic.add(5, 33);
        System.out.println(dynamic.exists(5));
        System.out.println(dynamic.exists(21));
        System.out.println(dynamic.getIndexByValue(88));
        System.out.println(dynamic.getIndexByValue(1));

    }
}
