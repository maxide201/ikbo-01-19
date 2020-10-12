package INN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[]Args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String inn = scanner.next();
        Map<String, String> name_inn = new HashMap<String, String>();
        name_inn.put("qwerty", "1234");
        String t = name_inn.get(name);
        try {
            if (!name_inn.get(name).equals(inn)) {
                throw new InnNotFoundedException("INN not founded: " + inn);
            }
        }
        catch(NullPointerException e)
        {
            throw new NameNotFoundedException("Name not founded: " + name);
        }

    }
}
