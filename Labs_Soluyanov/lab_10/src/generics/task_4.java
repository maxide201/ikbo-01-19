package generics;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class task_4 {
    public ArrayList<String> readToList(String path) {
        ArrayList<String> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(path);
            int c;
            String res = "";
            while ((c = reader.read()) != -1) {
                if (c != ' ') {
                    res += (char)c;
                } else {
                    list.add(res);
                    res = "";
                }
            }
            if (res != "")
                list.add(res);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            list = null;
        }
        int i = 0;
        for(String s : list)
        {
            System.out.print(s + " ");
            i++;
            if(i==5)break;
        }
        System.out.println();
        return list;
    }
}
