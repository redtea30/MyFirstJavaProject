package exer02;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}

class Window extends Thread {
    static int ticket = 100000;
    private static final ReentrantLock LOCK = new ReentrantLock();

    public void run() {
        while (true) {
            try {
                LOCK.lock();
                if (ticket > 0) {
/*                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                    System.out.println(Thread.currentThread().getName() + "票号，票号为： " + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                LOCK.unlock();

            }

        }
    }
}