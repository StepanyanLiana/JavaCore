package chapter11;

public class Q1 {
    int n;
    boolean valueSet = false;
    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа " + "InterruptedException перехвачено");
            }
            System.out.println("Пoлyчeнo: " + n);
            valueSet = false;
            notify();
        return n;
    }
        synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа " + "InterruptedException перехвачено");
            }
            this.n = n;
            valueSet = true;
            System.out.println(": " + n);
            notify();
        }
        }
}
class Producer1 implements Runnable {
    Q1 q;
    Producer1(Q1 q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.get();
        }
    }
}
class Consumer1 implements Runnable {
    Q1 q;
    Consumer1(Q1 q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
class PCFixed {
    public static void main(String[] args) {
        Q1 q = new Q1();
        new Producer1(q);
        new Consumer1(q);
    }
}
