package ru.mirea_16_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessingGame extends JFrame {

    final int randomNumb = 0+ (int)(Math.random()*20);

    int PlayerNum = 0;
    int count = 3;
    JLabel label = new JLabel("Угадайте число от 1 до 20");
    JButton enterButton = new JButton("Ввод");
    JTextField text = new JTextField();


    GuessingGame() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
        panel.setLayout(new GridLayout(0,1));

        panel.add(label);
        panel.add(text);
        panel.add(enterButton);

        frame.setSize(700, 300);
        frame.setLocationRelativeTo(null);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String textFieldValue = text.getText();
                    PlayerNum = Integer.parseInt(textFieldValue);
                    if (PlayerNum == randomNumb) {
                        enterButton.setEnabled(false);
                        label.setText("Вы угадали! Загаданное число - "+randomNumb);
                        JOptionPane.showMessageDialog(null, "Вы выиграли!", "Победа", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    else if (PlayerNum > randomNumb) {
                        count--;
                        label.setText("Загаданное число меньше, осталось "+count+" попытки");
                        textFieldValue = "";
                    }
                    else if (PlayerNum < randomNumb) {
                        count--;
                        label.setText("Загаданное число больше, осталось "+count+" попытки");
                        textFieldValue = "";
                    }
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "Вы проиграли, загаданное число: " + randomNumb, "Game over", JOptionPane.ERROR_MESSAGE);
                        enterButton.setEnabled(false);
                        frame.dispose();
                    }
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[]args) {
        new GuessingGame();
    }
}