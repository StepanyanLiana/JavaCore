package chapter14;

public class Gen13<T extends  Number> {
    T ob;
    T vals[];
    Gen13(T o, T[] nums) {
        ob = o;
    //vals = new T[10]; //WRONG!
        vals = nums;
    }
}
class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen13<Integer> iOb = new Gen13<>(50, n);
        //Gen13<Integer> gens[] = new Gen13<Integer>[10];  //WRONG!
        Gen13<?> gen[] = new Gen13<?>[10];
    }
}
