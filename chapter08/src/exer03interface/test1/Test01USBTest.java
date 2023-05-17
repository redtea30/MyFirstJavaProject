package exer03interface.test1;

public class Test01USBTest {
    public static void main(String[] args) {
        Computer.show(new Flash());
        Computer.show(new Print());

        Computer computer = new Computer();
        System.out.println("********************************************");
        Print print = new Print();
        computer.show(print);
        System.out.println("********************************************");
        computer.show(new Flash());
        System.out.println("********************************************");
        computer.show(new USB() {
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            public void stop() {
                System.out.println("扫描仪结束工作");
            }
        });
        System.out.println("********************************************");
        computer.show(new Flash() {
            public void start() {
                System.out.println("U开始工作");
            }

            public void stop() {
                System.out.println("U结束工作");
            }
        });
        System.out.println("********************************************");
        Computer.show(new Print());


    }
}

interface USB {
    public void start();

    public void stop();
}

class Computer {
    public static void show(USB usb) {
        usb.start();
        System.out.println("电脑启动");
        usb.stop();
    }
}

class Flash implements USB {
    public void start() {
        System.out.println("U盘开始工作");
    }

    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Print implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}

