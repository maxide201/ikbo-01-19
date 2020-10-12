package prac_12;

public class Main {
    public static void main(String[]Args)
    {
        //task 1;
        Person p1 = new Person("aaa", "bbb","ccc");
        Person p2 = new Person("aaa", "bbb","");
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        //task 2;
        try {
            Address adr = new Address("1, 2, 3, 4, 5, 6, 7");
            System.out.println(adr.toString());
        }catch(Exception e) { }
        try {
            Address adr = new Address("1; 2; 3; 4; 5; 6; 7");
            System.out.println(adr.toString());
        }catch(Exception e) { }
        try {
            Address adr = new Address("1 2 3 4 5 6 7");
            System.out.println(adr.toString());
        }catch(Exception e) { }
        try {
            Address adr = new Address("1, 2, 3, 4, 5, 6");
            System.out.println(adr.toString());
        }catch(Exception e) { System.out.println(e); }

        //task 3;
        System.out.println(PhoneNumberTranslator.Translate("+79154705552"));
        System.out.println(PhoneNumberTranslator.Translate("89154705552"));
        System.out.println(PhoneNumberTranslator.Translate("+10000000000"));
    }
}
