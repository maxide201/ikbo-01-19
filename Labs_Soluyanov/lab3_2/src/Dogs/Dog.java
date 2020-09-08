package Dogs;

public abstract class Dog
{
    private String name;
    private float age;
    private double weight;
    private double length;
    private double height;
    private double width;
    private String hairStyle;

    public Dog(String name, float age, double weight, double length, double height, double width, String hairStyle) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
        this.hairStyle = hairStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void voice()
    {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                ", hairStyle='" + hairStyle + '\'' +
                '}';
    }
}
