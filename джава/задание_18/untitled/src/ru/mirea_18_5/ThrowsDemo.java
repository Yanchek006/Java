package ru.mirea_18_5;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails"); //приложение пытается использовать null в случае, когда требуется объект
        }
        return "data for " + key;
    }
}