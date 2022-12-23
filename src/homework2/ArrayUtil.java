package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {20, 5, 10, 11, 4, 7, 48, 3, 23, 88};
        int i;

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println(max);



        int min = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}