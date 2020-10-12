public class Student implements IStudent
{
    private Double mark;
    private String name;

    public Student(Double mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public Double getMark() {
        return mark;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }
}
