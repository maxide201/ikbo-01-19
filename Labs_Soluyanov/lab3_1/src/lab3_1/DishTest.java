package lab3_1;

public class DishTest
{
    public static void main(String[] args)
    {
        Cup cup = new Cup(1, "glass", true);
        Plate plate = new Plate(0.01, "glass", false);
        Kettle kettle = new Kettle(2,"metal", true);
        System.out.println(cup);
        System.out.println(plate);
        System.out.println(kettle);
        cup.takeSip();
        plate.Eating();
        kettle.Heat();
    }
}
