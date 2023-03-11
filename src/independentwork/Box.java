package independentwork;

import java.util.Scanner;

public class Box {
        int size;

        Box(int s) {
            size = s;
        }
    }

    class Laser {
        public static void main(String[] args) {
            Box b1 = new Box(5);
            System.out.println(b1.size);
            Box[] ba = go(b1, new Box(6));
            ba[0] = b1;
            for (Box b : ba) System.out.print(b.size + " ");
        }

        static Box[] go(Box b1, Box b2) {
            b1.size = 4;
            Box[] ma = {b2, b1};
            return ma;
        }

    }
    class Dark {
        int x = 3;

        public static void main(String[] args) {

            foreach:
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(" " + j);
                    if (j == 3 && k == 1) break foreach;
                    if (j == 0 || j == 2) break;
                }
            }
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                double i = scanner.nextDouble();
                System.out.println(i / 3);

            }
        }
    }
