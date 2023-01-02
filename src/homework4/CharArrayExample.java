package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        System.out.print("1) ");
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int k = 0;
        int i;
        for (i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                k++;
            }
        }
        System.out.println(k);


        System.out.print("2) ");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print(chars2[(chars2.length - 1) / 2] + ", ");
        System.out.println(chars2[chars.length / 2]);


        System.out.print("3) ");
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = true;
        if ((chars3.length - 1 == 'y') && (chars3.length - 2 == 'l')) {
            b = false;
        }

            System.out.println(b);

            System.out.print("4) ");
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
            int j;
            for (j = 0; j < text.length; j++) {
                if (text[j] != ' ') {

                    System.out.print(text[j]);
                }
            }


        }

}