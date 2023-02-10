package homeworks.homework1.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        System.out.print("1) ");
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                k++;
            }
        }
        System.out.println(k);


        System.out.print("2) ");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print(chars2[(chars2.length - 1) / 2] + ", ");
        System.out.println(chars2[chars2.length / 2]);


        System.out.print("3) ");
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println( (chars3[chars3.length - 1] == 'y') && (chars3[chars3.length - 2] == 'l'));




            System.out.print("4) ");
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
            for (int j = 0; j < text.length; j++) {
                if (text[j] != ' ') {
                    System.out.print(text[j]);
                }
            }


        }

}