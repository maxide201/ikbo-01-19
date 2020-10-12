package lab_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[]Args)
    {
        task2();
        task3();
    }
    public static void task2()
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        String regex = "abcdefghiklmonpqrstuv18340";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean b = matcher.matches();
        System.out.println(b);
    }
    public static void task3()
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        String regex = "([0-9]+(\\.[0-9]+)? (?:RUB|USD|EU))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String res = "";
        int pos = 0;
        while(matcher.find(pos))
        {
            res += matcher.group() + " ";
            pos = matcher.end();
        }
        System.out.println(res);
    }
}
