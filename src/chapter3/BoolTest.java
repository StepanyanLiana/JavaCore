package chapter3;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b =  false;
        System.out.println("b = " + b);
        b = true ;
        System.out.println("b = " + b);
        if(b) System.out.println("this cod is running");
        b = false;

        if(b) System.out.println("this kod is not runing");
        System.out.println("10 > 9 = " + (10 > 9) );
    }
}
