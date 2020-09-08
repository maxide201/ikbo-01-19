package lab3_1;

public class Kettle extends Dish
{
    public Kettle(double volume, String material, boolean isHandle) {
        super(volume, material, isHandle);
    }

    public void Heat() {
        System.out.println("Heating...");
    }
    @Override
    public void pour() {

    }

    @Override
    public String toString() {
        return "Kettle{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                ", isHandle=" + isHandle +
                '}';
    }
}
