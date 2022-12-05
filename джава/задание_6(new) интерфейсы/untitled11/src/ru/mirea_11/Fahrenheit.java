package ru.mirea_11;

public class Fahrenheit extends Temperature {
    double fahrenheit;
    Fahrenheit() {
    }
    Fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double convert(Temperature to) throws AbsoluteZeroException {
        if (to instanceof Celsius) {
            if (fahrenheit < -459.67) {
                throw new AbsoluteZeroException("The temperature cannot be less than absolute zero.");
            } else {
                return ((fahrenheit - 32) * 5) / 9;
            }
        }
        return fahrenheit;
    }
}
