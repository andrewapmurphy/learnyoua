package learn.you.a.data.structure;

public interface Iterator <T> {
	/**
	 * @return
	 * 	true if the iterator has not reached the end of the list
	 */
	boolean hasNext();
	
	/**
	 * @return
	 * 	Next value or null of there isn't one (eg if hasNext is false)
	 */
	T next();
}
