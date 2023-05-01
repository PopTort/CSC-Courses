/**
 * 
 */

/**
 * @author gaok
 *
 */
public final class ArrayBag<T> implements BagInterface<T>{

	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY=25;
	
	/** Creates an empty bag whose initial capacity is 25. */
	public ArrayBag()
	{
		this (DEFAULT_CAPACITY);
	} // end default constructor
	
	/** Creates an empty bag having a given capacity.
    @param desiredCapacity  The integer capacity desired. */
	public ArrayBag(int desiredCapacity)
	{
		bag=(T[]) new Object[desiredCapacity];
		numberOfEntries=0;
	} // end constructor

	
	
	@Override
	public int getCurrentSize() {
		int count = 0;
		for (int x = 0; x < bag.length; x++) {
			if (bag[x] != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		boolean result = false;
		for (int x = 0; x < bag.length;x++) {
			if (bag[x] == null) {
				result = true;
			}
			else {
				result = false;
			}
	}
		return result;
	}

	
	@Override
	public boolean add(T newEntry) {
		for (int x = 0; x < bag.length;x++) {
			if (bag[x] == null) {
				bag[x] = newEntry;
				return true;
			}
		}
		return false;
	}
	
	
	

	@Override
	public T remove() {
		int slot = 0;
			if (bag[slot] == null) {
				return null;	
			}
			else {
				T orginalEntry = bag[slot];
				bag[slot] = null;
				return(orginalEntry);
			}
	}


	@Override
	public boolean remove(T anEntry) {
		for (int x = 0; x < bag.length; x++) {
			if (anEntry == bag[x]) {
				bag[x] = null;
			}
		}
		return true;
	}

	@Override
	public void clear() {
		for (int x = 0; x < bag.length; x++) {
				bag[x] = null;
		}	
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int amount = 0;
		for (int x = 0; x < bag.length; x++) {
			if (bag[x] == anEntry) {
				amount = amount + 1;
			}
		}
		return amount;
	}

	@Override
	public boolean contains(T anEntry) {
		for (int x = 0; x < bag.length; x++) {
			if (anEntry == bag[x]) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T[] toArray() { 
	
	T newArray[] = bag;
	
	return newArray;
	}
}

	
	
	
	
	
	
	