package learn.you.a.data.structure.list.array;

import static org.junit.Assert.*;

import java.util.Random;

import learn.you.a.data.structure.Iterator;
import learn.you.a.data.structure.list.array.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void testConstructor() {
		assertEquals(0, (new ArrayList<Integer>()).getSize());
		assertEquals(0, (new ArrayList<Integer>(0)).getSize());
		assertEquals(99, (new ArrayList<Integer>(99)).getSize());
	}
	
	@Test
	public void validSequentialGetSet() {
		final int size = 99;
		final int mult = 3;
		
		final ArrayList<Integer> list = new ArrayList<Integer>(size);
		
		for (int i = 0; i < size; ++i) {
			list.set(i, i * mult);
		}
		
		for (int i = 0; i < size; ++i) {
			assertEquals(Integer.valueOf(i * mult), list.get(i));
		}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void invalidGet() {
		final int size = 5;
		final ArrayList<Integer> list = new ArrayList<Integer>(size);
		
		list.get(size);
	}
	
	@Test()
	public void setRequiresGrow() {
		final ArrayList<Integer> list = new ArrayList<Integer>();
		
		final Integer preFill = 2;
		
		fill(list, preFill, preFill, preFill);
		
		final int oldSize = list.getSize();
		
		final int newIndex = oldSize + 2;
		final Integer expected = 1;
		
		list.set(newIndex, expected);
		
		assertEquals(newIndex+1, list.getSize());
		assertEquals(expected, list.get(newIndex));
		
		for (int i = 0; i < newIndex; ++i) {
			if (i < oldSize) {
				assertEquals(preFill, list.get(i));
			} else {
				assertNull(list.get(i));
			}
		}
	}
	
	@Test
	public void resizeLargerTest() {
		final int originalSize = 5;
		final ArrayList<Integer> list = new ArrayList<Integer>(originalSize);
		
		fill(list, 1, 2, 3, 4, 5);
		
		final int newSize = 10;
		
		list.resize(newSize);
		assertEquals(newSize, list.getSize());
		
		for (int i = 0; i < newSize; ++i) {
			if (i < originalSize) {
				assertEquals(Integer.valueOf(i+1), list.get(i));
			} else {
				assertNull(list.get(i));
			}
		}
	}
	
	@Test
	public void resizeSmallerTest() {
		final int originalSize = 5;
		final ArrayList<Integer> list = new ArrayList<Integer>(originalSize);
		
		fill(list, 1, 2, 3);
		
		final int newSize = 3;
		
		list.resize(newSize);
		
		assertEquals(newSize, list.getSize());
		
		for (int i = 0; i < newSize; ++i) {
			if (i < newSize) {
				assertEquals(Integer.valueOf(i+1), list.get(i));
			}
		}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void badIndexAfterSmallerResizeTest() {
		final int originalSize = 5;
		final ArrayList<Integer> list = new ArrayList<Integer>(originalSize);
		
		fill(list, 1, 2, 3);
		
		final int newSize = 3;
		
		list.resize(newSize);
		
		assertEquals(newSize, list.getSize());
		
		for (int i = 0; i < originalSize; ++i) {
			if (i < newSize) {
				assertEquals(Integer.valueOf(i+1), list.get(i));
			} else {
				list.get(i);
			}
		}
	}
	
	/**
	 * Set a random index in the array to a value
	 * all other values should be null
	 */
	@Test
	public void validRandomGetSet() {
		final int size = 99;
		final int randomIndex = new Random().nextInt(size);
		final Integer expected = 1;
		
		final ArrayList<Integer> list = new ArrayList<Integer>(size);
		
		list.set(randomIndex, expected);
		
		for (int i = 0; i < size; ++i) {
			if (i != randomIndex) {
				assertNull(list.get(i));
			} else {
				assertEquals(expected, list.get(i));
			}
		}
	}
	
	@Test
	public void testIterators() {
		final ArrayList<Integer> list = new ArrayList<Integer>();
		
		fill(list, 5, 7, 9, 1);
		
		Iterator<Integer> iter = list.getIterator();
		
		int i = 0;
		
		while (iter.hasNext()) {
			assertEquals(list.get(i), iter.next());
			++i;
		}
		
		assertEquals(list.getSize(), i);
		assertEquals(Integer.valueOf(4), Integer.valueOf(i));
		
	}
	
	private static <T> void fill(final ArrayList<T> list, final T... values) {
		for (int i = 0; i < values.length; ++i) {
			list.set(i, values[i]);
		}
	}

}
