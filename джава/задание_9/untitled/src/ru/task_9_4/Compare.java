package ru.task_9_4;

import java.util.TreeSet;
class Compare implements Comparable<Object>
{
    String  str;
    int     num;
    String  TEMPLATE = "num = %d, str = '%s'";

    Compare(String str, int num)
    {
        this.str = str;
        this.num = num;
    }


    public int compareTo(Object obj)
    {
        Compare entry = (Compare) obj;
        int result = str.compareTo(entry.str);
        if(result != 0)
            return result;

        result = num - entry.num;
        if(result != 0)
            return (int) result / Math.abs( result );

        return 0;
    }

    public String toString()
    {
        return String.format(TEMPLATE, num, str);
    }
}

