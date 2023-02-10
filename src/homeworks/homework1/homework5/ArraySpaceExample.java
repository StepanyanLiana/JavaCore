package homeworks.homework1.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int j = spaceArray.length - 1; j >= 0; j--) {
            if (spaceArray[j] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[j++] = spaceArray[i];
        }
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }

}

