package chapter6.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(3);
        mystack.push(6);
        mystack.push(7);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}
