package lab_1;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        task1();
        task2(args);
        task3();
        task4();
        task5();

    }
    public static void task1()
    {
        //task 1.1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < arr.length;i++) sum +=arr[i];
        System.out.println("sum_1 = " + sum);
        //task 1.2
        sum = 0;
        int i = 0;
        while (i < arr.length) {sum +=arr[i]; i++;}
        System.out.println("sum_2 = " + sum);
        //task 1.3
        sum = i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i<arr.length);
        System.out.println("sum_3 = " + sum);
    }

    public static void task2(String[] args)
    {
        for(int i = 0;i < args.length;i++)
        {
            System.out.println(args[i]);
        }
    }

    public static void task3()
    {
        double sum = 0;
        for(double i = 1;i <= 10;i++) sum += 1/i;
        System.out.println(sum);
    }

    public static void task4()
    {
        int []arr = new int[100];
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random()*1000);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        Arrays.sort(arr);
        System.out.println();
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void task5()
    {
        System.out.println("0! = " + factorial(0));
        System.out.println("4! = " + factorial(4));
        System.out.println("-10! = " + factorial(-10));
        System.out.println("20! = " + factorial(20));
    }

    public static long factorial(int n)
    {
        long ans = 1;
        if(n>=0) {
            for (int i = 1; i <= n; i++) {
                ans *= i;
            }
        } else return -1;
        return ans;
    }
}
