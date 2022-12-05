package ru.mirea7_4;

public abstract class MathFunc implements MathCalculable {
    private final double PI = 3.1416;
    protected double radius;

    public  MathFunc() {}
    public  MathFunc(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Длина окружности = " + (2 * PI * radius) + "; Радиус окружности = " + radius;
    }

}
