public class Hand
{
    public final int COUNT_OF_FINGERS = 10;
    private double size;
    private String color;

    public Hand(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Grab()
    {
        //grab something
        System.out.println("grab something");
    }

    @Override
    public String toString() {
        return "Hand{" +
                "COUNT_OF_FINGERS=" + COUNT_OF_FINGERS +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
