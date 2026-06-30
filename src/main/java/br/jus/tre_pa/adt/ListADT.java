package br.jus.tre_pa.adt;

public interface ListADT<T> {

    // Initialize the list to be empty
    public ListADT<T> initialize();

    // Return an element from the list at any give position.
    public T get(int position);

    // Insert a new element at any list position.
    public T insert(T element);

    // Remove the first occurrence of any elemen from a non-empty list.
    public T remove();

    // Remove the element at a specified location from a non-empty list.
    public T removeAt(int location);

    // Replace an element at any position with another element.
    public void replace();

    // Return the number of elements in the list.
    public int size();

    // Return true if the list is empty; otherwise, return false.
    public boolean isEmpty();

    // Return true if the list is full otherwise return false
    public boolean isFull();


}
