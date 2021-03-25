package Net.Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author datefate
 * @site create 2021-03-21-下午7:52
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("server is running");

        for (; ; ) {
            Socket socket = ss.accept();
            System.out.println("connected from:"+socket.getRemoteSocketAddress());
            Thread t = new Handler(socket);
            t.start();

        }
    }
}

class Handler extends Thread{
    Socket sock;

    public Handler(Socket sock){
        this.sock=sock;

    }
    @Override
    public void run(){
        try(InputStream input  =this.sock.getInputStream()) {
            try(OutputStream output = this.sock.getOutputStream()) {
                handle(input,output);
            } catch (IOException e) {
                try {
                    this.sock.close();
                } catch (IOException ioException) {
                }
                System.out.println("client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void handle(InputStream input,OutputStream output) throws IOException {
        var writer  = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        var reader = new BufferedReader(new InputStreamReader(input,StandardCharsets.UTF_8));
        writer.write("hello java\n");
        writer.flush();
        for (; ; ) {
            String s = reader.readLine();
            if(s.equals("bye")){
                writer.write("bye");
                writer.newLine();
                writer.flush();
                break;
            }
            writer.write("ok:"+ s + "\n");
            writer.flush();

        }

    }
}
