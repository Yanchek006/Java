package ru.mirea7_4;

public class Complex{
    private double mRe;
    private double mIm;

    public Complex(double re, double im) {
        mRe = re;
        mIm = im;
    }

    public double getRe() {
        return mRe;
    }

    public double getIm() {
        return mIm;
    }

    public double abs() {
        return Math.sqrt(mRe * mRe + mIm * mIm);
    }

    public Complex getReciprocal() {
        double denominator = mRe * mRe + mIm * mIm;
        if (denominator != 0) {
            return new Complex(mRe / denominator, -mIm / denominator);
        } else {
            throw new IllegalStateException("z = 0");
        }
    }

    public String toString() {
        return "Re = " + mRe + ", Im = " + mIm;
    }
}
