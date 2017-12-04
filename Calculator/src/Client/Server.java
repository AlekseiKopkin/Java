package Client;
import java.io.*;
import java.net.*;

public class Server {
    static final int PORT = 3440;
    public Server() {
        try {
            ServerSocket servers = null;
            Socket fromclient = null;
            servers = new ServerSocket(PORT);
            while (true) {
                // таким образом ждём подключений от сервера
                fromclient = servers.accept();
                // создаём обработчик клиента, который подключился к серверу
                // this - это наш сервер
                ClientHandler client = new ClientHandler(fromclient);
                //  clients.add(client);
                // каждое подключение клиента обрабатываем в новом потоке
                new Thread(client).start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
      }
    }
}