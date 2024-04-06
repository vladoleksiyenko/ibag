package adts;

public interface IBag {

    /**
     * Adds an element to the bag if there is space
     * @param toAdd the element
     * @return true if the element was added, or false otherwise
     */
    boolean add(Object toAdd);

    /**
     * Searches for an element and returns a boolean
     * @param searchFor the element
     * @return true if element is found, false otherwise
     */
    boolean contains(Object searchFor);

    /**
     * Gives the size of the bag (how many elements, excluding empty spaces)
     * @return the amount of elements in the bag
     */
    int size();

    /**
     * Returns the length of the bag (all spaces)
     * @return the length of the bag
     */
    int capacity();

    /**
     * Removes an object from the bag
     * @param searchFor the element that's to be removed
     * @return true if element is found and removed, false otherwise
     */
    boolean remove(Object searchFor);

    /**
     * Returns whether the bag is empty or not
     * @return true if bag is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Clears the bag
     */
    void clear();

}
