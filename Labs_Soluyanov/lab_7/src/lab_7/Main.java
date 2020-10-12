package lab_7;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[]Args)
    {
        ArrayList<Integer> arr = new ArrayList(10);
        ArrayList<Integer> arr2 = new ArrayList(2);

        for(int i = 0; i<10;i++) {
            arr.add(i);
        }
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr.add(0,5);
        arr.addAll(1, arr2);
        arr.remove(13);
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arr.get(0));
        arr.set(0,2);
        System.out.println(arr.get(0));
        Collections.sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arr.indexOf(2));
        System.out.println(arr.lastIndexOf(2));


    }
}
