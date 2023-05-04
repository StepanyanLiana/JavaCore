package classwork.potok;

public class MyThread implements  Runnable {
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("my Thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
