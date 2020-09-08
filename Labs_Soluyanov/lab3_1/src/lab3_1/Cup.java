package lab3_1;

public class Cup extends Dish
{

    public Cup(double volume, String material, boolean isHandle) {
        super(volume, material, isHandle);
    }

    @Override
    public void pour() {

    }

    public void takeSip()
    {
        System.out.println("sip...");
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                ", isHandle=" + isHandle +
                '}';
    }
}
