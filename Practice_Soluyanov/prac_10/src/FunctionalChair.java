public class FunctionalChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Functional sitting...");
    }
    public int sum(int a, int b) {return a+b;}
}
