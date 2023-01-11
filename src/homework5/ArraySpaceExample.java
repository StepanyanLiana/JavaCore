package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', 'b', ' ', ' '};
        char[] result = {};
        int b = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                System.out.print(spaceArray[i]);
            }
            
    }
}
}