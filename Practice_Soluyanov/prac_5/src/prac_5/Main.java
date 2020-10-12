package prac_5;

import java.util.Scanner;

public class Main {
    public static void task_14(int N)
    {
        System.out.print(Integer.toString(N).charAt(0) + " ");
        N = N % (int) Math.pow(10, (int) Math.log10(N));;
        if (N != 0)task_14(N);
    }
    public static void task_15(int N)
    {
        System.out.print(N % 10 + " ");
        N /= 10;
        if(N != 0) task_15(N);
    }
    public static int task_16(int max, int count)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x==0)
            return count;
        else if (x > max)
        {
            max = x;
            count = 1;
        }
        else if (x == max)
            count++;

        count = task_16(max,count);
        return count;
    }
    public static void main(String[] args) {
        task_14(1234);
        System.out.println();
        task_15(1234);
        System.out.println();
        System.out.println(task_16(-1,0));
    }
}

