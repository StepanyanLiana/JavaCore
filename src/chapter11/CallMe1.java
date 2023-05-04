package chapter11;

public class CallMe1 {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    CallMe1 target;
    Thread t;

    public Caller1(CallMe1 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
      synchronized (target) {
          target.call(msg);
        }
    }
}
class Synch1 {
    public static void main(String[] args) {
        CallMe1 target = new CallMe1();
        Caller1 ob1 = new Caller1(target, "Добро пожаловать");
        Caller1 ob2 = new Caller1(target, "в синхронизированный");
        Caller1 ob3 = new Caller1(target,"мир!");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
    }
}
