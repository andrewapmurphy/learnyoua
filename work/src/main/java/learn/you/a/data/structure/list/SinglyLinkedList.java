package learn.you.a.data.structure.list;

import learn.you.a.data.structure.Iterator;

/**
 * A linked list that traverses a list in a single direction
 */
public class SinglyLinkedList <T> {
	
	public SinglyLinkedList() {
		
	}
	
	/**
	 * Add a value at the front of the list (head)
	 */
	public SinglyLinkedList<T> push(final T value) {
		return null;
	}
	
	/**
	 * Add a value to the end of the list (footer)
	 * 
	 * @return
	 * 	returns the node containing the value
	 */
	public SinglyLinkedList<T> offer(final T value) {
		return null;
	}
	
	/**
	 * @return
	 * 	number of elements in the list
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * @return
	 * 	returns the first element in the list or null if the list is empty
	 */
	public SinglyLinkedList<T> getHead() {
		return null;
	}
	
	/**
	 * @return
	 * 	returns the last element in the list or null if the list is empty
	 */
	public SinglyLinkedList<T> getFooter() {
		return null;
	}
	
	/**
	 * Inserts a node before after node in the linked list
	 * 
	 * After being inserted, the node before the node we are inserting in front of points
	 * to the node that we are inserting, and the node that we are inserting points to the
	 * node that used to be after the node we're inserting
	 */
	public SinglyLinkedList<T> insertBefore(final SinglyLinkedListNode<T> before, final T value) {
		return null;
	}
	
	/**
	 * Insert a node after another node in the linked list
	 * 
	 * After being inserted, the node we're inserting after points to the new node and the
	 * node current node points to the node that used to be after the node we are inserting
	 * after
	 */
	public SinglyLinkedList<T> insertAfter(final SinglyLinkedList<T> after, final T value) {
		return null;
	}
	
	/**
	 * Remove a node from the list
	 * 
	 * When removed, the node before this node in the list will now point to the node
	 * after this node or null if there isn't a next node
	 */
	public void remove(final SinglyLinkedList<T> node) {
		
	}

	/**
	 * @return
	 * 	iterator that traverses the list from head to food
	 */
	public Iterator<T> getIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
