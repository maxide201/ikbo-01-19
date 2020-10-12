import java.util.Scanner;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        System.out.print("Input age of chair:");
        Scanner scanner = new Scanner(System.in);
        return new VictorianChair(scanner.nextInt());
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
