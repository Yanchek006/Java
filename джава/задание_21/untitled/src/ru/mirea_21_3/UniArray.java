package ru.mirea_21_3;


public class UniArray<E> {

    private E[] array;

    public UniArray(E[] array) {
        this.array = array;
    }

    public void showArray() {
        for (E ar : array) {
            System.out.print(ar + " ");
        }
        System.out.println();
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public E getElement(int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        return array[index];
    }

    public void setElement(E value, int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    private void checkIndex(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
    }
}