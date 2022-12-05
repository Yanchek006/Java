package ru.mirea7_4;

public class TestMath {
    public static void main(String[] args) {
        int result = powerFunction(2, 5);
        System.out.println("Возведение в степень = " + result);
        MathFunc math = new MathFunc(10) {
            public double getRe() {
                return 0;
            }

            public double getIm() {
                return 0;
            }
            public double abs() {
                return 0;
            }
        };
        Complex obj = new Complex(1, 2);
        System.out.println(math);
        System.out.println(obj);

    }
    static int powerFunction(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = base * result;
        }
        return result;
    }

}
