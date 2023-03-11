package chapter14;

public class NonGen2 {
    int num;
    NonGen2(int i) {
        num = i;
    }
    int getNum() {
        return num;
    }
}
class Gen6<T> extends  NonGen2 {
    T ob;
    Gen6(T o, int i) {
        super(i);
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
class HierDemo2 {
    public static void main(String[] args) {
        Gen6<String> w = new Gen6<>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());;
    }
}
