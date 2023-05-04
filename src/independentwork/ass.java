package independentwork;

public class ass {
    public static void main(String[] args) {
        int[] array = {1, 45, 21, 7, 8,8 ,78,8};
        countNumber(array, 8);


    }



    public static int countNumber(int[] array, int number) {

        int size = 0;

        for (int i = 0; i < array.length; i++) {

            if (number == array[i]) {
                size = number;
                 size++;
            }
        }
          //  System.out.println(size);
        return size;
    }
}