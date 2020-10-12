package prac_6;

public class SortTest
{
    public static void main(String[]Args)
    {
        Student[] arr = {new Student(3), new Student(2), new Student(6), new Student(100),
                new Student(1), new Student(5), new Student(4), new Student(7)};
        for(Student s : arr)
        {
            System.out.print(s);
        }
        System.out.println();
        insertSort(arr);
        for(Student s : arr)
        {
            System.out.print(s);
        }
    }
    public static void insertSort(Student[]arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getiDNumber()> key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1]= key;
        }
    }
}
