public class Human
{
    private double height;
    private double weight;
    public Hand leftArm;
    public Hand rightArm;
    public Leg leftLeg;
    public Leg rightLeg;
    public Head head;

    public Human(double height, double weight, double armSize, double legSize,
                 boolean isHair, double sizeOfEyes, double sizeOfEars, double sizeOfNose, String color) {
        this.height = height;
        this.weight = weight;
        leftArm = new Hand(armSize, color);
        rightArm = new Hand(armSize, color);
        leftLeg = new Leg(legSize, color);
        rightLeg = new Leg(legSize, color);
        head = new Head(isHair, sizeOfEyes, sizeOfEars, sizeOfNose, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", leftArm=" + leftArm +
                ", rightArm=" + rightArm +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", head=" + head +
                '}';
    }
}
