package learn.you.a.data.structure.list.array;

import learn.you.a.data.structure.Iterator;

/**
 * An array backed, random access list
 */
public class ArrayList <T> {
	
	/**
	 * Creates an empty array list
	 */
	public ArrayList() {
		
	}
	
	/**
	 * Create an array with an initial size
	 */
	public ArrayList(final int initialSize) {
		
	}
	
	/**
	 * Get the value at a given index.
	 * 
	 * @return
	 * 	Value at the given index or null if the index is valid for the array, but has not been set yet
	 * 
	 * @throws
	 * 	IndexOutOfBoundsException if index is less than 0 or greater than the size of the array
	 */
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Set the value at a given index
	 * 
	 * If the index is greater than the size of the array,
	 * the array is resized
	 */
	public void set(int index, T value) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @return
	 * 	Allocated size of the array
	 */
	public int getSize() {
		return 0;
	}
	
	/**
	 * Resizes the backed array to a specified size
	 * 
	 * Retains current values in the ArrayList whose index still fit within the new size
	 * 
	 * @throws
	 * 	IndexOutOfBoundsException if newSize is less than 0
	 */
	public void resize(final int newSize) {
		
	}

	public Iterator<T> getIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
