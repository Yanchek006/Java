package ru.mirea_11;

public abstract class Temperature {
    public abstract double convert(Temperature to) throws AbsoluteZeroException;
}