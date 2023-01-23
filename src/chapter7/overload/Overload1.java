package chapter7.overload;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);

    }

}
