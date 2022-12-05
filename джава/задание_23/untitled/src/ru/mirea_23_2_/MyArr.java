package ru.mirea_23_2_;


public class MyArr<T> {
    private int size = 0;
    private T[] data = null;

    public MyArr(){}

    public void add(T element)
    {
        if (size == 0)
        {
            data = (T[]) new Object[1];
            data[0] = element;
        }
        else
        {
            T[] tmp = (T[]) new Object[size];
            for (int i = 0; i < size; ++i)
            {
                tmp[i] = data[i];
            }

            data = (T[]) new Object[size + 1];
            for (int i = 0; i < size; ++i)
            {
                data[i] = tmp[i];
            }

            for (int i = 0; i < size + 1; ++i)
            {
                if (data[i] == null)
                {
                    data[i] = element;
                    break;
                }
            }

        }

        size++;
    }



    public void remove(T elem)
    {
        boolean found = false;
        for (int i = 0; i < size; ++i)
            if (data[i] == elem)
            {
                data[i] = null;
                found = true;
                break;
            }
        if (found)
        {
            T[] tmp = (T[]) new Object[size];
            for (int i = 0; i < size; ++i)
                tmp[i] = data[i];

            size--;
            if (size != 0)
            {
                data = (T[]) new Object[size];
                for (int i = 0, k = 0; i < size; ++i)
                    if (tmp[i] != null)
                        data[i] = tmp[i + k];
                    else
                    {
                        k = 1;
                        data[i] = tmp[i + k];
                    }
            }
            else
                data = null;
        }
    }


    public void remove(int index)
    {
        boolean found = false;
        for (int i = 0; i < size; ++i)
            if (i == index)
            {
                data[i] = null;
                found = true;
                break;
            }
        if (found)
        {
            T[] tmp = (T[]) new Object[size];
            for (int i = 0; i < size; ++i)
                tmp[i] = data[i];

            size--;
            if (size != 0)
            {
                data = (T[]) new Object[size];
                for (int i = 0, k = 0; i < size; ++i)
                    if (tmp[i] != null)
                        data[i] = tmp[i + k];
                    else
                    {
                        k = 1;
                        data[i] = tmp[i + k];
                    }
            }
            else
                data = null;
        }
    }


    public int indexOf(T elem)
    {
        int index = -1;
        for (int i = 0; i < size; ++i)
            if (data[i] == elem)
                return i;
        return index;
    }

    public T get(int index){
        return data[index];
    }

    public void set(int index, T element)
    {
        boolean found = false;
        for (int i = 0; i < size; ++i)
            if (i == index)
            {
                data[i] = element;
                found = true;
                break;
            }

    }

    public int size()
    {
        return size;
    }

    @Override
    public String toString()
    {
        String str = "[";
        for (int i = 0; i < size; ++i)
        {
            if (data[i] != null)
            {
                str += data[i].toString();
                if (i != size-1 && data[i+1] != null)
                    str += ", ";
            }
        }
        str += "]";

        return str;
    }
}