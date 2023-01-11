package homework6;

public class ArrayUtil {
    void arrayElements(int[] array) {
        System.out.print("Array elements: ");;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
        void sumArray(int[]array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("sum of elements: " + sum);
        }
        void firsteElementOfArray(int[]array){
                System.out.println("first element: " + array[0]);
        }

        void lastElementOfArray(int[]array){
            System.out.println("last element: " + (array.length - 1));
        }

        void middleElementOfArray(int[]array){
            System.out.println("middle element: " + (array.length / 2));
        }

        void arithmeticAverageOfArray(int[]array){
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("the arithmetic average: " + (sum / array.length));
        }

        void maxArray(int[]array){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("max element:  " + max);
        }

        void minArray(int[]array){
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("min element:  " + min);
        }

        void evenElementsOfArray(int[]array) {
            System.out.print("even elements: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }

    void quantityOfEvenElements(int[]array){
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = ++even;
            }
        }
        System.out.println("quantity of even elements: " + even);
    }

    void oddElementsOfArray(int[]array){
        System.out.print("odd elements: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void quantityOfOddElements(int[]array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd = ++odd;
            }
        }
            System.out.println("quantity of odd elements: " + odd);

        }


    }


