package independentwork;

public class example {
        static int x = 7;

        public static void main(String[] args) {
            String s = "";
            for (int y = 0; y < 3; y++) {
                x++;
                switch (x) {
                    case 8:
                        s += "8 ";
                    case 9:
                        s += "9 ";
                    case 10: {
                        s += "10 ";
                        break;
                    }
                    default:
                        s += "d ";
                    case 13:
                        s += "13 ";
                }
            }
            System.out.println(s);
        }

        static {
            x++;
        }

}
class Alpha {
    static String s = " ";

        protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha() {
        s += "sub ";
    }
}

   class SubSubAlpha extends Alpha {
       {
           System.out.println();
       }
    private SubSubAlpha() {
        s += "subsub ";
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
}
 class Bird {
    {
        System.out.print("b1 ");
    }

    public Bird() {
        System.out.print("b2 ");
    }
}

class Raptor extends Bird {
    static {
        System.out.print("r1 ");
    }

    public Raptor() {
        System.out.print("r2 ");
    }

    {
        System.out.print("r3 ");
    }

    static {
        System.out.print("r4 ");
    }
}

class Hawk extends Raptor {
    public static void main(String[] args) {
        System.out.print("pre ");
        new Hawk();
        System.out.println("hawk ");
    }
}





