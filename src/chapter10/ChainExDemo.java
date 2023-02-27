package chapter10;

public class ChainExDemo {
    static  void demoproc() {
        NullPointerException e = new NullPointerException("Пepexвaчeнo исключение");
        e.initCause(new ArithmeticException("пpичинa"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пepexвaчeнo исключение: " + e);
            System.out.println("Пepвoпpичинa: " + e.getCause());
        }

    }
}
