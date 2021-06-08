package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Serhiy Dubovenko
 */
public class MyForm {
    private JLabel label1;
    private JTable table1;
    private JButton button1;
    private JButton button2;

    public MyForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Зачем ты меня нажал?!!!!");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }

    public static void main(String[] args) {
        MyForm form = new MyForm();

    }



}
