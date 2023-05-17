package exer01;


//同步代码块
public class SalesTicketDemo {
    public static void main(String[] args) {
     /*   Ticket ticket = new Ticket();
        Thread t1 = new Thread("窗口一");
        {
            public void run () {
            while (true) {
                synchronized (ticket) {
                    ticket.sale();
                }
            }
        }

        } ;
        Thread t2 = new Thread("窗口二");
        {
            public void run () {
            while (true) {
                synchronized (ticket) {
                    ticket.sale();
                }
            }
        }
        };

        Thread t3 = new Thread("窗口三");
        {
            public void run () {
            while (true) {
                synchronized (ticket) {
                    ticket.sale();
                }
            }
        }
        };



        t1.start();
        t2.start();
        t3.start();*/

        Ticket ticket = new Ticket();
        Thread t1 = new Thread("窗口一") {
            public void run() {
                while (true) {
                    synchronized (ticket) {
                        ticket.sale();
                    }
                }
            }
        };
        Thread t2 = new Thread("窗口二") {
            public void run() {
                while (true) {
                    synchronized (ticket) {
                        ticket.sale();
                    }
                }
            }
        };
        Thread t3 = new Thread("窗口三") {
            public void run() {
                while (true) {
                    synchronized (ticket) {
                        ticket.sale();
                    }
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();


    }


}

class Ticket {
    private int ticket = 1000000;

    public void sale() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出一张票，票号： " + ticket);
            ticket--;
        } else {
            throw new RuntimeException("没票了");
        }
    }

/*    public int getTicket() {
        return ticket;
    }*/
}


