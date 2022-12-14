package chapter3;

public class Light {
        public static void main(String[] arg) {
        int lightspeed = 18600;
        long days;
        long second;
        long distance;
        days = 1000;
        long seconds = days * 24 * 60 * 60;
             distance = lightspeed * seconds;
                System.out.print("за" + days);
                System.out.print(" дней свет пройодет около ");
                System.out.println(distance + "миль");
    }
}
