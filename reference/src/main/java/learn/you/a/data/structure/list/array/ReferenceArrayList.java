package learn.you.a.data.structure.list.array;

import learn.you.a.data.structure.Iterator;
import learn.you.a.data.structure.list.array.ArrayList;

public class ReferenceArrayList <T> extends ArrayList<T> {
	private T[] array;
	private int size;
	
	public ReferenceArrayList() {
		this(0);
	}
	
	public ReferenceArrayList(final int initialSize) {
		array = allocate(initialSize);
		size = initialSize;
	}

	@Override
	public T get(int index) {
		assertCheckIndex(index);
		
		return this.array[index];
	}

	@Override
	public void set(int index, T value) {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index >= this.size) {
			resize(index+1);
		}
		
		this.array[index] = value;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void resize(int newSize) {
		final T[] newArray = allocate(newSize);
		
		final int copyUpToIndex;
		
		if (newSize > this.size) {
			copyUpToIndex = this.size;
		} else {
			copyUpToIndex = newSize;
		}
		
		//could be replaced with System.arraycopy
		for (int i = 0; i < copyUpToIndex; ++i) {
			newArray[i] = this.array[i];
		}
		
		this.array = newArray;
		this.size = newSize;
	}

	@Override
	public Iterator<T> getIterator() {
		return new ReferenceArrayListIterator<T>(this);
	}
	
	@SuppressWarnings("unchecked")
	private T[] allocate(final int size) {
		return (T[]) new Object[size];
	}
	
	private void assertCheckIndex(final int index) {
		if (!checkIndex(index)) {
			throw new IndexOutOfBoundsException("index " + index + " out of bounds");
		}
	}

	private boolean checkIndex(final int index) {
		return index >= 0 && index < this.size;
	}
}
