package chapter9.mypack.p1;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("K. J. Fieldig", 123.23);
        current[1] = new Balance("Will Tell", 157.2);
        current[2] = new Balance("Tom Jacson", -12.33);
        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
