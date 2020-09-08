package BookTask;

public class BookTest
{
    public static void main(String[] args)
    {
        Book book = new Book("Ivan I I", "Book", "Hello...", 2000, 100);
        System.out.println(book);
        System.out.println(book.getAuthor() + ", " + book.getDescription() + ", " + book.getName() + ", " +
                book.getPages() + ", " + book.getYear());
        book.setAuthor("Petrov P P");
        book.setDescription("...bye");
        book.setName("Book 2");
        book.setPages(101);
        book.setYear(2001);
        System.out.println(book.getAuthor() + ", " + book.getDescription() + ", " + book.getName() + ", " +
                book.getPages() + ", " + book.getYear());
    }
}
