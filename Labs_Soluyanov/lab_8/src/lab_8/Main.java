package lab_8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]Args)
    {
        task_2();
    }
    public static void task_1()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try
        {
            FileWriter wr = new FileWriter("test.txt");
            wr.append(s);
            wr.flush();
        }
        catch(IOException e)
        {
            System.out.println("Ошибка при работе с файлом!");
        }
    }
    public static void task_2()
    {
        try {
            FileReader r = new FileReader("test.txt");
            int c;
            while ((c = r.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch(IOException e)
        {
            System.out.println("Ошибка при работе с файлом!");
        }
    }
    //task3 индентичен task1

    public static void task_4()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try
        {
            FileWriter wr = new FileWriter("test.txt", true);
            wr.append(s);
            wr.flush();
        }
        catch(IOException e)
        {
            System.out.println("Ошибка при работе с файлом!");
        }
    }
}
