package chapter11;

public class NewThread2 extends Thread {
    NewThread2() {
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток: " + this);
        start();
    }
    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен");
    }
}
class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Глaвный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }
}