package exer01;
//非静态方法加锁
public class SalesTicketDemo2 {
    public static void main(String[] args) {
        TicketSalesRunnable ticketSalesRunnable = new TicketSalesRunnable();
        Thread t1 = new Thread("窗口一");
        Thread t2 = new Thread("窗口二");
        Thread t3 = new Thread("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketSalesRunnable implements Runnable {
    private int ticket = 10000;

    public void run() {
        while (ticket > 0) {
            saleOneTicket();
        }
    }

    private synchronized void saleOneTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出一张票，票号是： " + ticket);
            ticket--;
        }
    }
}