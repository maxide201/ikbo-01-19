public class Head
{
    private boolean isHair;
    private double sizeOfEyes;
    private double sizeOfEars;
    private double sizeOfNose;
    private String color;

    public Head(boolean isHair, double sizeOfEyes, double sizeOfEars, double sizeOfNose, String color) {
        this.isHair = isHair;
        this.sizeOfEyes = sizeOfEyes;
        this.sizeOfEars = sizeOfEars;
        this.sizeOfNose = sizeOfNose;
        this.color = color;
    }

    public boolean isHair() {
        return isHair;
    }

    public double getSizeOfEyes() {
        return sizeOfEyes;
    }

    public double getSizeOfEars() {
        return sizeOfEars;
    }

    public double getSizeOfNose() {
        return sizeOfNose;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Head{" +
                "isHair=" + isHair +
                ", sizeOfEyes=" + sizeOfEyes +
                ", sizeOfEars=" + sizeOfEars +
                ", sizeOfNose=" + sizeOfNose +
                ", color='" + color + '\'' +
                '}';
    }
}
