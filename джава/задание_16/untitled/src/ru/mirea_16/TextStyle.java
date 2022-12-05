package ru.mirea_16;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;

public class TextStyle
{
    TextStyle()
    {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(4,1));

        JTextField text = new JTextField();
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();

        // Change text font size
        text.setFont(new Font("Times New Roman",Font.BOLD,30));
        // Change text font color
        text.setForeground(Color.BLUE);

        text1.setFont(new Font("MS Sans Seriff",Font.BOLD,30));
        // Change text font color
        text1.setForeground(Color.RED);

        text2.setFont(new Font("“Courier New",Font.BOLD,30));
        // Change text font color
        text2.setForeground(Color.BLACK);

        frame.add(text);
        frame.add(text1);
        frame.add(text2);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new TextStyle();
    }
}