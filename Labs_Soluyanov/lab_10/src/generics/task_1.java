package generics;

import java.util.ArrayList;

public class task_1<E>
{
    public ArrayList<E> convert(E arr[])
    {
        ArrayList<E> new_arr = new ArrayList<E>();
        for(int i =0;i < arr.length;i++)
            new_arr.add(arr[i]);
        return new_arr;
    }
}