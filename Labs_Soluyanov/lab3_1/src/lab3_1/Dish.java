package lab3_1;

public abstract class Dish
{
    protected double volume;
    protected String material;
    protected boolean isHandle;

    public Dish(double volume, String material, boolean isHandle) {
        this.volume = volume;
        this.material = material;
        this.isHandle = isHandle;
    }

    public abstract void pour();
}
