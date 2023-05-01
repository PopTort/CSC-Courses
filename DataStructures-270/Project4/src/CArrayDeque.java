public class CArrayDeque<T> {
	
	private T[] items;
	private int front;
	private int back;
	private int size;
	final static int CAPACITY=10;
	
	// Default constructor
	public  CArrayDeque() {
		//TO DO
		items = (T[]) new Object[CAPACITY];
	}
	
	/** Sees whether this queue is empty.
	 @return  True if the queue is empty, or false if not. */
	public boolean isEmpty() {
		//TO DO
		return size<=0;
	}

	/** Adds a new entry to this queue at front.
    @param newEntry  The object to be added as a new entry.
    @return  True if the addition is successful, or false if not. */
	public boolean addFront(T newEntry) {
		//TO DO
		if (size>=CAPACITY) {
			return false;
		}
		front--;
		if (front < 0) {
			front = CAPACITY -1;
		}
		items[front] = newEntry;
		size++;
		return true;
		
	}
	
	/** Adds a new entry to this queue at back.
    @param newEntry  The object to be added as a new entry.
    @return  True if the addition is successful, or false if not. */	
	public boolean addBack(T newEntry) {
		//TO DO
		if (size>=CAPACITY) {
			return false;
		}
		back++;
		if (back > CAPACITY) {
			back = 0;
		}
		items[back] = newEntry;
		size++;
		return true;
		
	}
	
	/** Removes the entry at front from the queue, if possible.
    @return True if the removal was successful, or false if not. */
	public boolean removeFront() {
		if (size <=0) {
			return false;
		}
		items[front] = null;
		front++;
		if (front == CAPACITY) {
			front = 1;
		}
		size--;
		return true;

	}
	
	/** Removes the entry at back from the queue, if possible.
    @return True if the removal was successful, or false if not. */
	public boolean removeBack() {
		if (size <=0) {
			return false;
		}
		items[back] = null;
		front--;
		if (back == CAPACITY) {
			back = CAPACITY -1;
		}
		size--;
		return true;

	}
	
	/** Retrieve the entry at front in the queue, if possible.
    @return the front entry if the retrieve was successful, or null if not. */
	public T retrieveFront() {
		//TO DO
		return items[front];		
	}

	/** Retrieve the entry at back in the queue, if possible.
    @return the front entry if the retrieve was successful, or null if not. */
	public T retrieveBack() {
		//TO DO
		return items[back];		
	}
	
	/** Retrieves all entries that are in this queue.
    @return  A newly allocated array of all the entries in this queue. */
	public T[] toArray(){
		//TO DO
		return items;			
	}
	
}