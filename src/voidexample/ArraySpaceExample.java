package voidexample;

public class ArraySpaceExample {
    void trim(char[] c){
        int startIndex = 0;
        int endIndex = c.length - 1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int j = c.length - 1; j >= 0; j--) {
            if (c[j] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++ ) {
            result[j++] = c[i];
        }
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
}
