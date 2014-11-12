package main.java.learn.you.a.data.structure.list.array;

import learn.you.a.data.structure.list.array.ArrayList;
import learn.you.a.data.structure.list.array.ArrayListIterator;

public class ReferenceArrayListIterator <T> extends ArrayListIterator<T> {
	private int currentIndex;
	private int lastIndex;
	private ArrayList<T> list;
	
	ReferenceArrayListIterator(final ArrayList<T> list) {
		this.currentIndex = 0;
		this.lastIndex = list.getSize();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return this.currentIndex < this.lastIndex;
	}

	@Override
	public T next() {
		if (!hasNext()) {
			return null;
		}
		
		final int index = this.currentIndex;
		++this.currentIndex;
		
		return this.list.get(index);
	}
}
