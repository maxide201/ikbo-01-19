package generics;

public class task_2<T> {
    public T content[];
    public task_2(T arr[])
    {
        content = arr;
    }
    public void out()
    {
        for(int i =0;i<content.length;i++)
        {
            System.out.print(content[i] + " ");
        }
        System.out.println();
    }
}
