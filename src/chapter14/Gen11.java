package chapter14;

import org.w3c.dom.ls.LSOutput;

public class Gen11<T> {
    T ob;
    Gen11(T o) {
       ob = o;
    }
    T getOb() {
        return ob;
    }
}
 class Gen12 extends  Gen11<String> {
   Gen12(String o) {
       super(o);
   }
   String getOb() {
       System.out.println("Bызвaн метод String getob(): ");
       return ob;
   }
}
class BridgeDemo {
    public static void main(String[] args) {
        Gen12 strOb2 = new Gen12("Tecт обобщений");
        System.out.println(strOb2.getOb());
    }
}
