package homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int d = 0;
        System.out.print("in descending order: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    d = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = d;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("in ascending order: ");
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]){
                    d = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = d;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


