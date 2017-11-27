package controller;

import view.IndentificatorFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndeteficatorPanel {
    private static JTextField login;
public static JButton buttonEnter;
    private static JPasswordField password;
    public static JLabel loginLabel;
    public static JLabel passwordLabel;

    public IndeteficatorPanel(IndentificatorFrame windowIndeficator) {
        windowIndeficator.add(getTextLodin());
        windowIndeficator.add(getTextPassword());
        windowIndeficator.add(getButtonEnter());
        windowIndeficator.add(getLoginLabel());
        windowIndeficator.add(getPasswordLabel());
    }
    public  static JLabel getPasswordLabel(){
        if(passwordLabel==null){
            passwordLabel=new JLabel("Password");
            passwordLabel.setBounds(10,50,70,25);
        }
        return passwordLabel;
    }
    public static JLabel getLoginLabel(){
        if(loginLabel==null){
            loginLabel=new JLabel("Login");
            loginLabel.setBounds(10,10,70,25);
        }
        return loginLabel;
    }
    public static JButton getButtonEnter() {
        if ( buttonEnter == null) {
            buttonEnter = new JButton("Enter");
            buttonEnter.setBounds(100, 80, 80, 40);
        }
        return buttonEnter;
    }

    public static JTextField getTextLodin() {
        if (login  == null) {
            login= new JTextField();
            login.setBounds(80, 10, 230, 25);
        }
        return login;
    }

    public static JPasswordField getTextPassword() {
        if (password == null) {
            password= new JPasswordField();
            password.setBounds(80, 50, 230, 25);
        }
        return password;
    }
}
