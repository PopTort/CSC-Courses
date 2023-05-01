/**
   A class of bags whose entries are stored in a chain of linked nodes.
	The bag is never full.
*/

public class LinkedBag<T> implements BagInterface<T>{



	private class Node 
	{
		private T    data; // Entry in bag
		private Node next; // Link to next node
	
		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

	
	private Node firstNode;       // Reference to first node
	private int numberOfEntries;

	// Default constructor
	public LinkedBag() 
	{
		
		
	} // end default constructor
	
	@Override //DONE
	public int getCurrentSize() {
		return numberOfEntries;
	}

	@Override //DONE
	public boolean isEmpty() {
		if(numberOfEntries > 0) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override //DONE
	public boolean add(T newEntry) {
		if(newEntry != null) {
			Node temp_node = new Node(newEntry);
			temp_node.next = firstNode;
			firstNode = temp_node;
			numberOfEntries++;
			return true;
		}
		else {
			return false;
		}
	}

	@Override //DONE
	public T remove() {
		T result = null;
		
		if (firstNode != null) {
			result = firstNode.data;
			firstNode = firstNode.next;
			numberOfEntries--;
			
		}
		return result;
	}

 	// Locates a given entry within this bag.
	// Returns a reference to the node containing the entry, if located,
	// or null otherwise.
	private Node getReferenceTo(T anEntry)
	{
		Node currentNode; 
		
		for (currentNode = firstNode;currentNode != null; currentNode = currentNode.next)
		{
			if (anEntry==currentNode.data)
				return currentNode;
		} // end while
		return currentNode;
	} // end getReferenceTo

	
	
	
	
	@Override //DONE
	public boolean remove(T anEntry) {
		Node currentNode = null;
		boolean removed = false;
		for (currentNode = firstNode;currentNode != null; currentNode = currentNode.next) {
			if(anEntry == currentNode.data) {
				if(currentNode.next != null) {
					currentNode.data = currentNode.next.data;
					removed = true;
					numberOfEntries--;
				}
					
			}
		}
		return removed;
	}

	@Override //DONE
	public void clear() {
		for(int i =0;i < numberOfEntries;i++) {
			firstNode = null;
			firstNode = firstNode.next;
			
		}
		
	}

	@Override //DONE
	public int getFrequencyOf(T anEntry) {
		Node currentNode;
		int total =0;
		
		for (currentNode = firstNode;currentNode != null; currentNode = currentNode.next)
		{
			if (anEntry==currentNode.data)
				total++;
		} 
		return total;
	} 

	
	
	@Override //DONE
	public boolean contains(T anEntry) {
		Node currentNode; 
		
		for (currentNode = firstNode;currentNode != null; currentNode = currentNode.next)
		{
			if (anEntry==currentNode.data)
				return true;
		} 
		return false;
	} 

	@Override //DONE
	public T[] toArray() {
		String newArray[] = new String[numberOfEntries];
		Node current = firstNode;
		for(int i = 0; i < numberOfEntries;i++) {
			String tempData = (String) current.data;
			newArray[i] = tempData;
			current = current.next;
			
			
		}
		return (T[]) newArray;
	}
	
}