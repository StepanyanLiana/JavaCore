package independentwork;

public class Mixer {
    public static void main(String[] args) {
        int[] a = {12, 5, 3, 6, 9, 2, 7};
        int v = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    v = a[i];
                    a[i] = a[j];
                    a[j] = v;

                }
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        System.out.println(sum / 2);
        System.out.println(a[a.length / 2]);
        System.out.println(a[a.length - 1]);
        System.out.println(a[a.length - 2]);
        int u = 0;
        for (int y = 0, i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                u = a[i];
                System.out.println(u);
            }

        }
        class A {
            public final int getResult(int a, int b) {
                return 0;
            }
        }

        class B extends A {
            public int getReтsult(int a, int b) {
                return 1;
            }
        }

         class Test {
            public static void main(String args[]) {
                B b = new B();
                System.out.println("x = " + b.getResult(0, 1));
            }int ____s = 7;
            boolean[] b[];
            long[] g[];

        }
        class Toy {
            public String printName() {
                System.out.println("Toy");
            return "h";}

        }


            }
        }







