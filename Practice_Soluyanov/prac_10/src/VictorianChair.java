public class VictorianChair implements Chair {
    private int age;
    public void sit()
    {
        System.out.println("Victorian sitting...");
    }

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }
}

