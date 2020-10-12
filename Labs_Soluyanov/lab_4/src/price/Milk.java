package price;

public class Milk implements Priceable
{
    private int price = 90;

    @Override
    public int getPrice() {
        return price;
    }
}