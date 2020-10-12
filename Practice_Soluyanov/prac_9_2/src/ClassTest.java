public class ClassTest
{
    public static void main(String[]Args)
    {
        Student[]arr = {new Student(9.0,"Andrew"), new Student(3.0,"Jhon"),new Student(8.0,"Masha")};
        for(Student s:arr)
            System.out.println(s);
        System.out.println("После сортировки: ");
        IClass.sort(arr);
        for(Student s:arr)
            System.out.println(s);
        try
        {
            System.out.println("Тут есть студент с именем "+IClass.search(arr, "Jhon").getName());
            System.out.println("Тут есть студент с именем "+IClass.search(arr, "QQQQQQ").getName());
        }
        catch (StudentNotFoundedException e)
        { System.out.println(e.getMessage());}
    }
}
