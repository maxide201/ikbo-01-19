package prac_12;

public class PhoneNumberTranslator {
    public static String Translate(String inp)
    {
        String res = "";
        int i;
        if(inp.charAt(0) == '+')
        {
            res+="+"+inp.charAt(1);
            i = 2;
        }
        else
        {
            res+="+7";
            i = 1;
        }
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        res+="-";
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        res+="-";
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        res+=inp.charAt(i++);
        return res;
    }
}
