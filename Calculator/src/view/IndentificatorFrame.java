package view;

import model.File;

import javax.swing.*;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class IndentificatorFrame extends JFrame {
    String [][]res=new String[3][3];
    PrintMessages printMessages=new PrintMessages();
    char [] password;
    public  IndentificatorFrame() {
        setBounds(100, 100, 345, 170);
        setTitle("Indentificator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        IndentificatorPanel();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void IndentificatorPanel() {
        try {
            setLayout(null);
            // Specifies the position of the element

            JLabel labelPassword =new JLabel("Password");
            labelPassword.setBounds(10,50,70,25);

            JLabel labelLogin =new JLabel("Login");
            labelLogin.setBounds(10,10,70,25);

            final TextField textFieldLogin = new TextField();
            textFieldLogin.setBounds(80, 10, 230, 25);

            JPasswordField textFieldPassword = new JPasswordField();
            textFieldPassword.setBounds(80, 50, 230, 25);

            JButton buttonEnter = new JButton("Enter");
            buttonEnter.setBounds(100, 80, 80, 40);

            add(labelLogin);
            add(labelPassword);
            add(textFieldLogin);
            add(textFieldPassword);
            add(buttonEnter);

            buttonEnter.addActionListener(new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    File file = new File();
                    res[0][0] = textFieldLogin.getText();
                    password = textFieldPassword.getPassword();
                    res[1][0] = new String(password);
                    file.ReadFile(res);
                    Frame.getCalculatorFrame();
                }
            });

        } catch (ArithmeticException exception) {
            printMessages.Error();
        }
    }
}