package ru.task_11_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Date_Build {
    long getMlsc(String date_str) {
        long mlsc = -1;
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = a.parse(date_str);
            mlsc = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return mlsc;
    }
}

class T_Date extends Date_Build {
    public Date build(String date_str) {
        Date date;
        long mlsc = getMlsc(date_str);
        date = new Date(mlsc);
        return date;
    }
}

class T_Calendar extends Date_Build {
    Calendar build(String date_str) {
        Calendar calendar = Calendar.getInstance();

        try {
            SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            calendar.setTime(a.parse(date_str));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }
}

class Main {
    Calendar taskReceiptDate;
    Date handoverTaskDate;
    public Main( Calendar taskReceiptDate) {
        this.taskReceiptDate = taskReceiptDate;
    }



    public String toString() {
        return "Main{";

    }
}

