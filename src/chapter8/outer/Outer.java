package chapter8.outer;

public class Outer {
    int outer_x = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        int y = 10;

        void display() {
            System.out.println("вывoд: outer_x = " + outer_x);
        }
    }


}
