package chapter14;

public class NonGen {
    Object ob;
    NonGen(Object o) {
        ob = o;
    }
    Object getOb(){
        return ob;
    }
    void showType() {
        System.out.println("Oбъeкт оЬ относится к типу " + ob.getClass().getName());
    }
}
class NonGenDemo{
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();
        NonGen strOb = new NonGen("Tecт без обобщений");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe " + str);
        iOb = strOb;
       // v = (Integer) iOb.getOb();
    }
}
