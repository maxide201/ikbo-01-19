package Dogs;

public class Basenji extends Dog
{
    public Basenji(String name, float age, double weight, double length, double height, double width, String hairStyle) {
        super(name, age, weight, length, height, width, hairStyle);
    }

    @Override
    public void voice() {
        System.out.println("ooooooooouuuuu");
    }
}
