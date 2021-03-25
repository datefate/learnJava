package Net.Tcp.Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author datefate
 * @site create 2021-03-21-下午9:02
 */
public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket= new DatagramSocket(8888);
        System.out.println("server is running");
       for(;;){
//            accept
            byte[]  buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            datagramSocket.receive(packet);
            String cmd = new String(packet.getData(),packet.getOffset(),packet.getLength(), StandardCharsets.UTF_8);

//            send
            String resp ="bad command";
            switch (cmd){
                case "date":
                    resp = LocalDate.now().toString();
                    break;
                case "time":
                    resp = LocalTime.now().withNano(0).toString();
                    break;
                case "datetime":
                    resp = LocalDateTime.now().withNano(0).toString();
                    break;
                default:
                    resp ="I don't know";
                    break;
            }
            System.out.println(cmd + ">>>"+resp);

            packet.setData(resp.getBytes(StandardCharsets.UTF_8));
            datagramSocket.send(packet);

        }
    }
}
