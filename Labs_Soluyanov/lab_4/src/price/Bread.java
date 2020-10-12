package price;

public class Bread implements Priceable
{
    private int price = 20;

    @Override
    public int getPrice() {
        return price;
    }
}
