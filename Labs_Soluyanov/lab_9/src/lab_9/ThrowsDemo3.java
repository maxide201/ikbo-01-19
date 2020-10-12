package lab_9;

import java.util.Scanner;

//Задания 7-8
public class ThrowsDemo3 {
    public void getKey() { //удалил throws Exception
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        while (myScanner.hasNextLine()) {//цикл реализвоан
            try { //try-catch добавлен
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("The line is empty, try entering correct line");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

}