package chapter9.mypack.interface1;

public class TestIface {
    public static void main(String[] args) {

        Callback c = new Client();

        c.callback(42);

    }
}