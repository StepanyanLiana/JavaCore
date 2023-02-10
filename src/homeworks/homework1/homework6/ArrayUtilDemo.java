package homeworks.homework1.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {20, 5, 10, 11, 4, 7, 48, 3, 23, 88,77,57};
        ArrayUtil ar = new ArrayUtil();
        ar.sumArray(array);
        ar.lastElementOfArray(array);
        ar.arithmeticAverageOfArray(array);
        ar.evenElementsOfArray(array);
        ar.quantityOfEvenElements(array);
        ar.oddElementsOfArray(array);
        ar.quantityOfOddElements(array);
        ar.middleElementOfArray(array);
        ar.firsteElementOfArray(array);
        ar.arrayElements(array);
        ar.minArray(array);
        ar.maxArray(array);
    }

}
