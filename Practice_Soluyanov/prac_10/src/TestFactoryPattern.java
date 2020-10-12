public class TestFactoryPattern {
    public static void main(String[]Args)
    {
        Client client = new Client();
        ChairFactory chairFactory = new ChairFactory();
        client.setChair(chairFactory.createMagicChair());
        client.sit();
        client.setChair(chairFactory.createVictorianChair());
        client.sit();
        client.setChair(chairFactory.createFunctionalChair());
        client.sit();

    }
}
