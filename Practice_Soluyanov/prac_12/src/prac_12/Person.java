package prac_12;

public class Person {
    private String name;
    private String surname;
    private String papa_th;

    public Person(String name, String surname, String papa_th) {
        this.name = name;
        this.surname = surname;
        this.papa_th = papa_th;
    }

    public String getInfo()
    {
        StringBuffer res = new StringBuffer(surname);
        if(!(name.equals("") || papa_th.equals("")))
            res.append(" ").append(name.charAt(0)).append(".").append(papa_th.charAt(0)).append(".");
        return res.toString();
    }
}
