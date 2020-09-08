package interfaces;

public class TestMovable
{
    public static void main(String []args)
    {
        MovableCircle c1 = new MovableCircle(0 , 0, 0, 0, 1);
        System.out.println(c1);
        c1.moveUp();
        c1.moveRight();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(0, 0, 4, 4, 5, 2);
        System.out.println(r1);
        r1.moveDown();
        System.out.println(r1);
    }
}
