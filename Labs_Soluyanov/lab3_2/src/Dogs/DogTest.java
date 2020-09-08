package Dogs;

public class DogTest
{
    public static void main(String[] arg)
    {
        var beagle = new Beagle("beagle", 2,2,2,2,2,"hairStyle1");
        var bulldog = new Bulldog("bulldog",3,3,3,3,3, "hairStyle2");
        var basenji = new Basenji("bassenji",4,4,4,4,4,"hairStyle1");
        var poodle = new Poodle("poodle",5,5,5,5,5,"hairStyle3");
        System.out.println(beagle);
        System.out.println(bulldog);
        System.out.println(basenji);
        System.out.println(poodle);
        beagle.voice();
        bulldog.voice();
        basenji.voice();
        poodle.voice();

    }
}
