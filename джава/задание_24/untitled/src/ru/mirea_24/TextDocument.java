package ru.mirea_24;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TextDocument implements ActionListener{
    File file = new File(""); //создается переменная типпа file где будет храниться путь файла
    public  TextDocument () {
        JFrame frame = new JFrame("Text edit"); //создание объекта в () название объекта
        frame.setSize(800, 600); // размер 800х600 (длина, высота)
        frame.setVisible(true); //отображение frame

        JButton buttonOpen = new JButton ("Open");
        buttonOpen.setLocation (10, 10); //определение местоположения (отступ слева, сверху)
        buttonOpen.setSize(100, 50); //размер (ширина/высота)

        JButton buttonSave = new JButton ("Save");
        buttonSave.setLocation (120, 10); //определение позиция/местоположения
        buttonSave.setSize(100, 50); //размер (ширина/высота)

        JButton buttonNew = new JButton ("New File");
        buttonNew.setLocation (230, 10); //определение местоположения
        buttonNew.setSize(100, 50); //размер (ширина/высота)

        JButton buttonExit = new JButton ("Exit");
        buttonExit.setLocation (10, 480); //определение местоположения
        buttonExit.setSize(100, 50); //размер (ширина/высота)

        JTextArea area = new JTextArea(); //создание объекта
        area.setLocation (10, 70); //определение местоположения
        area.setSize(750, 400); //размер (ширина/высота)

//////////////////////////////////

        //создаем/описываем кнопуку Open (открыть), открывает выбранный файл
        buttonOpen.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(frame); // задали параметр frame откуда будем вызывать
                file = chooser.getSelectedFile(); //получаем путь
                //читаем полученный файл
                try(FileReader reader = new FileReader(file)){
                    //считываем файл как есть
                    //вначале задаем какой нибудь буфер(временная переменная), для хранения этого файла
                    //[]- так как это массив buf - имя переменнной(временная переменная), т.к массив динамический
                    //нужно указать на это - new; потом пишем размер массива типа int он равен file
                    char [] buf = new char [(int) file.length()];
                    reader.read(buf); //считываем данные и заносим в переменную buf
                    area.setText(new String(buf));  //выводим текст (массив символов) - конвертируем в строки


                } catch (Exception e2){

                }

            }
        });

        //создаем/описываем кнопуку Save (сохранить), сохраняет из поля Jtext в наш файл
        buttonSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                try(FileWriter writer = new FileWriter(file)){

                    char [] buf = new char [(int) file.length()];
                    writer.write(area.getText());
                    writer.flush();

                } catch (Exception e){

                }

            }
        });

        //создаем/описываем кнопуку New (новый файл), создает файл (прописываем имя)
        buttonNew.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //вызываем диалоговое окно
                JFileChooser chooser = new JFileChooser();
                if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                    file = chooser.getSelectedFile(); //методом get приравниваем

                    try(FileWriter writer = new FileWriter(file)){

                        char [] buf = new char [(int) file.length()];
                        writer.write("");
                        writer.flush();

                    } catch (Exception e1){

                    }

                }
            }});

        //создаем/описываем кнопуку Exit (выход), выход из программы
        buttonExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
//////////////////////////////////

        //заполнение формы (передаем параметры нашей форме)
        frame.add(buttonOpen);
        frame.add(buttonSave);
        frame.add(buttonNew);
        frame.add(buttonExit);
        frame.add(area);
        frame.add(new JLabel());
    }

    public static void main (String[] args) {
        //для коректной работы добавим SwingUtilities
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                //новый экземпляр нашего метода
                new  TextDocument();
            }
        });

    }

    //метод от ActionListener (в которм есть какое то событие)
    public void actionPerformed(ActionEvent e) {

    }
}
