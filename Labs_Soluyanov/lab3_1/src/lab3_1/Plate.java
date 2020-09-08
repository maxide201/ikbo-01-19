package lab3_1;

public class Plate extends Dish
{
    public Plate(double volume, String material, boolean isHandle) {
        super(volume, material, isHandle);
    }

    @Override
    public void pour() {

    }
    public void Eating()
    {
        System.out.println("Eating...");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                ", isHandle=" + isHandle +
                '}';
    }
}
