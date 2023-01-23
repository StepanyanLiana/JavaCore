package chapter3;

public class Array1 {
    public static void main(String[] args) {

        int te[] = new int[5];
        te[0] = 5;
        te[4] = 8;
        te[3] = 45;
        int sum = 0;
        System.out.println(te.length / 2);
        for (int i = 0; i < te.length; i++)
            sum = sum + te[i];
        System.out.println(sum);

    }
}
