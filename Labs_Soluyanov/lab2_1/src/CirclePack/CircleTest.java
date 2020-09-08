package CirclePack;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(2);
        System.out.println(c1);
        c1.setRadius(10);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
