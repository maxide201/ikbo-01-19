package prac_8;
import java.util.Collection;

/**
 * @param <E> - generic type for list
 */
public interface IWaitList<E> {
    /**
     * @param element to add
     */
    public void add(E element);

    /**
     * @return removed element
     */
    public E remove();

    /**
     * @param element to check if it contains
     * @return true if contains
     */
    public boolean contains(E element);

    /**
     * @param c to check if given list is in custom list
     * @return true if list contains all the elements from the given list
     */
    public boolean containsAll(Collection<E> c);

    /**
     * @return true if list is empty
     */
    public boolean isEmpty();
}