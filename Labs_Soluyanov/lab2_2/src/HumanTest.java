public class HumanTest
{
    public static void main(String[] args)
    {
        Human human = new Human(1.78, 75, 1, 1.2,
                true, 0.2, 0.2,0.2, "HumanSkin" );
        System.out.println(human);
        human.leftLeg.Step();
        human.rightArm.Grab();
        System.out.println(human.head.getSizeOfNose());
        System.out.println(human.head.getSizeOfEyes());
        System.out.println(human.head.getSizeOfEars());
        System.out.println(human.leftArm.getSize());
        System.out.println(human.leftLeg.getColor());
        System.out.println(human.head.isHair());
    }
}
