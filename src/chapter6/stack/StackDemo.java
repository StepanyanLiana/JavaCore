package chapter6.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        System.out.println(mystack.tos);
        mystack.push(3);
        mystack.push(6);
        mystack.push(4);
        mystack.push(37);
        int a = mystack.pop();
        System.out.println(a);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}
