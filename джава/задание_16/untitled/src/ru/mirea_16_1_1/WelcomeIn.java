package ru.mirea_16_1_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WelcomeIn extends JFrame
{
    JFrame frame = new JFrame();
    JButton North = new JButton("NORTH");
    JButton South = new JButton("SOUTH");
    JButton Center = new JButton("CENTER");
    JButton West = new JButton("WEST");
    JButton East = new JButton("EAST");

    public WelcomeIn() {
        frame.setLayout(new BorderLayout());
        frame.add(North, BorderLayout.NORTH);
        frame.add(South, BorderLayout.SOUTH);
        frame.add(Center, BorderLayout.CENTER);
        frame.add(West, BorderLayout.WEST);
        frame.add(East, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setVisible(true);
        North.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "Вы попали в", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        South.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать ЮАО", "Вы попали в", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО", "Вы попали в", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        West.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "Вы попали в", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        East.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "Вы попали в", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new WelcomeIn();

    }
}