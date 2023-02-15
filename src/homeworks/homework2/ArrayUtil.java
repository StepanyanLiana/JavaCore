package homeworks.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {20, 5, 10, 11, 4, 7, 48, 3, 23, 88};
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println("sum of elements: " + sum);

            System.out.println("first element: " + array[0]);
            int lastindex = array.length - 1;
            System.out.println("last element: " + array[lastindex]);

            int middle = array[array.length / 2];
        System.out.println("middle element: " + middle);

        double average = sum / array.length;
        System.out.println("the arithmetic average: " + average);


        int max = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println("max element:  " + max);


        int min = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min element: " + min);



        System.out.print("even elements: ");
        int even = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = even + 1;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print(even);


        System.out.println();
        System.out.print("odd elements: ");
                int odd = 0;
                for ( i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 1) {
                        odd = odd++;
                        System.out.print(array[i] + " ");

                    }
                }
                System.out.println();
                System.out.println(odd);

                }
    }
