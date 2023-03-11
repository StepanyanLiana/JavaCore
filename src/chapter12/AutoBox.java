package chapter12;

import org.w3c.dom.ls.LSOutput;

public class AutoBox {
    public static void main(String[] args) {

        Integer iOb = 100;
        int i = iOb;
        System.out.println(i + " " + iOb);
    }
}