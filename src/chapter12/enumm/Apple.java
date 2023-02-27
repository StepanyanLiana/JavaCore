package chapter12.enumm;

public enum Apple {
    Jonathan(10),
    GoldenDel(9),
    RedDel(12),
    Winesap(15),
    Cortland(8);
    private int price;

    Apple(int p) {
        price = p;
    }
    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
    class EnumDemo3 {
        public static void main(String[] args) {
            Apple app;
            System.out.println("Яблoкo сорта Winesap стоит " +
                     Apple.Winesap.getPrice() +
                    " центов.\n");
            System.out.println("Цeны на все сорта яблок:");
            for (Apple a : Apple.values()) {
                System.out.println(a + " стоит " + a.getPrice() +
                        " центов.");
            }
        }
    }
