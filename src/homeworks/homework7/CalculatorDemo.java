package homeworks.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.plus(7,15));
        System.out.println(cal.minus(22.8,13.4));
        System.out.println(cal.multiply(7,4.6));
        System.out.println(cal.divide(56,9));
        System.out.println(cal.divide(9,0));
    }
}
