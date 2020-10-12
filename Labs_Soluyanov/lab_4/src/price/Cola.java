package price;

public class Cola implements Priceable
{
    private int price = 50;

    @Override
    public int getPrice() {
        return price;
    }
}
