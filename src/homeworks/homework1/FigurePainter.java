package homeworks.homework1;

public class FigurePainter {

    public static void main(String[] args) {

        System.out.println("Figure 1");

        for (int i = 5; i > 0; i--) {
            for (int j = 5; j >= i; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Figure 2");


        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("11");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


                System.out.println("Figure 3");

                for (int i = 0; i < 5; i++) {

                    for (int j = 5; j > i; j--) {

                        System.out.print("* ");
                    }
                    System.out.println();

                }

    }

}
