package ru.mirea_11;

public class Kelvin extends Temperature {
    double kelvin;
    Kelvin() {
    }
    Kelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    public double convert(Temperature to) throws AbsoluteZeroException {
        if (to instanceof Celsius) {
            if (kelvin< -459.67) {
                throw new AbsoluteZeroException("The temperature cannot be less than absolute zero.");
            } else {
                return (kelvin-273);
            }
        }
        return kelvin;
    }
}