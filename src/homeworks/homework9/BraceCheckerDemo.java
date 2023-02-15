package homeworks.homework9;

public class BraceCheckerDemo {
    Stack stack = new Stack();
    public static void main(String[] args) {
        String text = "{Hello }{Java][(";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
