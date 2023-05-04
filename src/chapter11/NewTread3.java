package chapter11;

public class NewTread3 implements Runnable {
    String name;
    Thread t;

    NewTread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e ) {
            System.out.println(name + " nрерван.");
        }
        System.out.println(name + " завершен.");
    }
}
class DemoJoin {
    public static void main(String[] args) {
        NewTread3 ob1 = new NewTread3("Один");
        NewTread3 ob2 = new NewTread3("Два");
        NewTread3 ob3 = new NewTread3("Три");
        System.out.println("Пoтoк Один запущен: " + ob1.t.isAlive());
        System.out.println("Пoтoк  Два запущен: " + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен: " + ob3.t.isAlive());
        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Пoтoк Один запущен: " + ob1.t.isAlive());
            System.out.println("Пoтoк Два запущен: " + ob2.t.isAlive());
            System.out.println("Пoтoк Три запущен: " + ob3.t.isAlive());
        }
    }
}