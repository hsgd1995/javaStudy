package com.entor.innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTListenerTest {
    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        JButton button = new JButton("点我啊！");
        button.setBounds(100, 100, 150, 50);
        myframe.add(button);
        myframe.setSize(400, 400);
        myframe.setLayout(null);
        myframe.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// 提供监听事件
                System.out.println(button.getName());
            }
        });
    }
}
