package independentwork;

public class Alien {
    String invade(short ships) { return "a few"; }
    String invade(short... ships) { return "many"; }
}
class Defender {
    public static void main(String [] args) {
        new Alien().invade();
    }
}
