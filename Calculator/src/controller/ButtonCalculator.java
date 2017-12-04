package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class ButtonCalculator {
    // адрес сервера
    private static final String SERVER_HOST = "localhost";
    // порт
    private static final int SERVER_PORT = 3440;
    // клиентский сокет
    private Socket clientSocket;
    // входящее сообщение
    private Scanner inMessage;
    // исходящее сообщение
    private PrintWriter outMessage;
    String sing = "", deteleSrokaResult = "";
    int numberSing = 0;
    Check check = new Check();
    int index = 0;

    public ButtonCalculator() {
        try {
            // подключаемся к серверу
            clientSocket = new Socket(SERVER_HOST, SERVER_PORT);
            inMessage = new Scanner(clientSocket.getInputStream());
            outMessage = new PrintWriter(clientSocket.getOutputStream());
        } catch (IOException e) {
            // e.printStackTrace();
        }
        CalculatorPanel.getButton0().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton4().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton5().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton6().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton7().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton8().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton9().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButtonDivision().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "/";
                }
            }
        });
        CalculatorPanel.getButtonMinus().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "-";
                }
            }
        });
        CalculatorPanel.getButtonMultiplication().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "*";
                }
            }
        });
        CalculatorPanel.getButtonPlus().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "+";
                }
            }
        });
        CalculatorPanel.getbuttonClean().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText("");
            }
        });
        CalculatorPanel.getButtonPoint().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check.NumberPoints(CalculatorPanel.textField.getText()) == 0) {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                } else {
                    numberSing = 0;
                }
            }
        });
        CalculatorPanel.getButtonRemove().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (CalculatorPanel.textField.getText().length() != 0) {
                    deteleSrokaResult = CalculatorPanel.textField.getText().substring(0, CalculatorPanel.textField.getText().length() - 1);
                }
                CalculatorPanel.textField.setText(deteleSrokaResult);
            }
        });
        CalculatorPanel.getButtonResult().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index++;
                numberSing = 0;
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                sendMsg();
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // бесконечный цикл
                    while (true) {

                        // если есть входящее сообщение
                        if (inMessage.hasNext()) {
                            // считываем его
                            String inMes = inMessage.nextLine();
                            CalculatorPanel.textField.setText(CalculatorPanel.textField.getText()+inMes);
                        }
                    }
                } catch (Exception e) {//ff
                }
            }
        }).start();
        // добавляем обработчик события закрытия окна клиентского приложения
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    outMessage.flush();
                    outMessage.close();
                    inMessage.close();
                    clientSocket.close();
                } catch (IOException exc) {
                    //ff
                }
            }
        });
    }
public void sendMsg() {
    // формируем сообщение для отправки на сервер
    // отправляем сообщение
    outMessage.println(CalculatorPanel.textField.getText()+"\\");
    outMessage.flush();
    }
}
