public interface IClass
{
    public static void sort(IStudent[]arr) {
        for (int i = 1; i < arr.length; i++) {
            IStudent key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getMark()> key.getMark()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1]= key;
        }
    }
    public static Student search(Student[]arr, String name)
    {
        int i = 0;
        for (IStudent s:arr)
        {
            if(s.getName().equals(name))
                break;
            i++;
        }
        if(i==arr.length)
            throw new StudentNotFoundedException("Не найден студен с именем "+name);
        return arr[i];
    }
}
