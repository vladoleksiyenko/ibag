package structures;

import adts.IBag;

import java.util.Arrays;

public class Bag implements IBag {

    private Object[] data;

    public Bag(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Bag bag capacity: " + capacity);
        }
        data = new Object[capacity];
    }

    private int size;

    /**
     * Adds an element to the bag if there is space
     *
     * @param toAdd the element
     * @return true if the element was added, or false otherwise
     */
    @Override
    public boolean add(Object toAdd) {
        // is the bag full?
        if (size == data.length) {
            return false;
        }

        data[size] = toAdd;

        // move to the next unused index in the array
        size++;

        return true;
    }

    /**
     * Searches for an element and returns a boolean
     *
     * @param searchFor the element
     * @return true if element is found, false otherwise
     */
    @Override
    public boolean contains(Object searchFor) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gives the size of the bag (how many elements, excluding empty spaces)
     *
     * @return the amount of elements in the bag
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns the length of the bag (all spaces)
     *
     * @return the length of the bag
     */
    @Override
    public int capacity() {
        return data.length;
    }

    /**
     * Removes an object from the bag
     *
     * @param searchFor the element that's to be removed
     * @return true if element is found and removed, false otherwise
     */
    @Override
    public boolean remove(Object searchFor) {
        if (!contains(searchFor)) {
            return false;
        }

        // search for the element
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)) {
                // shift accordingly
                for (int j = i + 1; j < size; j++) {
                    data[j - 1] = data[j];
                }
                data[size - 1] = null;
                size--;

                return true; // found it!
            }
        }

        return false; // not found!
    }

    /**
     * Returns whether the bag is empty or not
     *
     * @return true if bag is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    @Override
    public void clear() {
//        data = new Object[data.length];
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
