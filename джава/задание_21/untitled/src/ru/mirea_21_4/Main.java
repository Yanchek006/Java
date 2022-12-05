package ru.mirea_21_4;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathDir = "d:\\Java_box";
        String pathFile = "d:\\Java_box\\Task_File.txt";

        Ctlg ff = new Ctlg(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }

}