package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] Args)
    {
        Integer arr[] = {1,2,3,4,5,6,7,8};
        String arr2[] = {"1","ae","rtty"};
        //task_1
        task_1<Integer> t = new task_1<Integer>();
        ArrayList<Integer> new_arr = t.convert(arr);
        System.out.println(new_arr);

        //task_2

        task_2<String> t2 = new task_2<String>(arr2);
        t2.out();

        //task_3
        task_3<Integer> t3 = new task_3<Integer>();
        System.out.println(t3.extract(arr, 4));

        //task_4
        task_4 t4 = new task_4();
        t4.readToList("test.txt");
    }

}

