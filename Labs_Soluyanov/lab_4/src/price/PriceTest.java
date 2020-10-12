package price;

public class PriceTest
{
    public static void main(String[] args)
    {
        Cola cola = new Cola();
        Milk milk = new Milk();
        Bread bread = new Bread();

        System.out.println(cola.getPrice());
        System.out.println(milk.getPrice());
        System.out.println(bread.getPrice());

    }
}
