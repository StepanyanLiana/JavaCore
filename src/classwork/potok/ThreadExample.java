package classwork.potok;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread(), "My Thread");
        t.start();
        //t.isAlive();
       // System.out.println(t);
       // Thread thread = Thread.currentThread();
       // System.out.println(thread.getName());
       // System.out.println(thread.getPriority());
       // System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
