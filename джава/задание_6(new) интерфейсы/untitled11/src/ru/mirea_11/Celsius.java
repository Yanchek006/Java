package ru.mirea_11;

public class Celsius extends Temperature {
    double celsius;
    Celsius() {
    }
    Celsius(double celsius) {
        this.celsius = celsius;
    }
    public double convert(Temperature to) {
        if (to instanceof Fahrenheit) {
            return (celsius * 9) / 5 + 32;
        }

        else if(to instanceof Kelvin)
        {
            return (celsius +  273);
        }
        return celsius;

    }





}