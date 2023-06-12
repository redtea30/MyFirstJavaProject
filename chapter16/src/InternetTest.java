import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InternetTest {

    @Test
    public void test1() throws IOException {
        InetAddress int1 = InetAddress.getLocalHost();
        System.out.println(int1);

        InetAddress int2 = InetAddress.getByName("8.8.8.8");
        System.out.println(int2);


        InetAddress[] int3 = InetAddress.getAllByName("122.228.95.175");
        String string1 = new String(Arrays.toString(int3));
        System.out.println(string1);

        InetAddress int4 = InetAddress.getByName("www.amap.com");
        System.out.println(int4);
        System.out.println(int4.getHostAddress());
        System.out.println(int4.getHostName());
        System.out.println(int4.isReachable(100));

        System.out.println();
    }


    @Test
    public void test03() throws UnknownHostException {
        byte[] addr = {59, 82, 60, 56};
//        byte[] addr = {(byte)192,(byte)168,24,56};

        InetAddress addr1 = InetAddress.getByAddress(addr);
        System.out.println(addr1);
        System.out.println(addr1.getHostName());
    }


    @Test
    public void client() throws IOException {

        OutputStream os = null;
        Socket socket = null;
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println(inet);

        try {
            int port = 8989;
            socket = new Socket("192.168.56.1", port);

            os = socket.getOutputStream();
            os.write("test test test".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    @Test
    public void Server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;

        try {
            int port = 8989;
            serverSocket = new ServerSocket(port);

            socket = serverSocket.accept();
            System.out.println("客户端启动成功");
            System.out.println("收到了来自于： " + socket.getInetAddress().getHostName() + "的连接");

            is = socket.getInputStream();
            byte[] buffer = new byte[5];
            int len;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((len = is.read(buffer))!=-1) {
                baos.write(buffer, 0, len);
            }

            System.out.println(baos.toString());
            System.out.println("数据接收完了");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (is!=null){
                    is.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (serverSocket!=null){
                    serverSocket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
