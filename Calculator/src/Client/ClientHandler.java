package Client;
import controller.CalculatorPanel;
import controller.Value;
import view.HashSetAndTreeSet;
import view.Node;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// реализуем интерфейс Runnable, который позволяет работать с потоками
public class ClientHandler implements Runnable {
    // исходящее сообщение
    private PrintWriter outMessage;
    // входящее собщение
    private Scanner inMessage;
    private static final String HOST = "localhost";
    private static final int PORT = 3443;
    // клиентский сокет
    private Socket clientSocket = null;
    Value value = new Value();
    HashSetAndTreeSet hashSetAndTreeSet = new HashSetAndTreeSet();
    view.Node node;
    double r = 0;
    String s="";
    // конструктор, который принимает клиентский сокет и сервер
    public ClientHandler(Socket socket) {
        try {
            this.clientSocket = socket;
            this.outMessage = new PrintWriter(socket.getOutputStream());
            this.inMessage = new Scanner(socket.getInputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // Переопределяем метод run(), который вызывается когда
    // мы вызываем new Thread(client).start();
    @Override
    public void run() {
        try {
            while (true) {
                // Если от клиента пришло сообщение
                if (inMessage.hasNext()) {
                    String clientMessage = inMessage.nextLine();
                    if (value.FindingValues(CalculatorPanel.textField.getText())[1] != -1) {
                        node = new Node(value.FindingValues(clientMessage)[0], value.FindingValues(clientMessage)[1], value.Sing(clientMessage), value.Index(clientMessage));
                        if (hashSetAndTreeSet.containsCalc(node)) {
                            r = hashSetAndTreeSet.search(node);
                            s = Double.toString(r);
                            sendMsg(s);
                        } else {
                            hashSetAndTreeSet.add(node);
                            r = node.countUp();
                            s = Double.toString(r);
                            sendMsg(s);
                        }
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // отправляем сообщение
    public void sendMsg(String msg) {
        try {
            outMessage.println(msg);
            outMessage.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}