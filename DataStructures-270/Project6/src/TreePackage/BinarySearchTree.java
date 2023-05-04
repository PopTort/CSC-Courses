package TreePackage;

import java.util.Iterator;


//import TreePackage.BinaryTree.InorderIterator;

/**
   A class that implements the ADT binary search tree by extending BinaryTree.
   Recursive version.
*/
public class BinarySearchTree<T extends Comparable<? super T>>
             extends BinaryTree<T> 
{
	
	   /** Searches for a specific entry in this tree.
    @param entry  An object to be found.
    @return  True if the object was found in the tree. 
	 * @throws Exception */
public boolean contains(T entry) throws Exception
{
	BinaryNode<T> node = new BinaryNode<T>();
	boolean found = false;
	while (found = false); {
		if (entry.compareTo(node.getData()) == 0) {
			found = true;
		}
		else if(entry.compareTo(node.getData()) > 0){
				node = node.getRightChild();
			}
		else if(entry.compareTo(node.getData()) < 0){
			node = node.getLeftChild();
		}
	}
	
	return found;
}





/** Retrieves a specific entry in this tree.
    @param entry  An object to be found.
    @return  Either the object that was found in the tree or
             null if no such object exists. */
public T getEntry(T entry) {
	BinaryNode<T> node = new BinaryNode<T>();
	boolean found = false;
	while (found = false); {
		if (entry.compareTo(node.getData()) == 0) {
			return entry;
		}
		else if(entry.compareTo(node.getData()) > 0){
				node = node.getRightChild();
			}
		else if(entry.compareTo(node.getData()) < 0){
			node = node.getLeftChild();
		}
	}
	
	return null;
};






/** Adds a new entry to this tree, if it does not match an existing 
    object in the tree. Otherwise, replaces the existing object with
    the new entry.
    @param newEntry  An object to be added to the tree.
    @return  Either null if newEntry was not in the tree already, or
             the existing entry that matched the parameter newEntry
             and has been replaced in the tree. */
public T add(T newEntry) {
	BinaryNode<T> node = new BinaryNode<T>();
	boolean set = false;
	while (set == false) {
		if(node.getData() == null) {
			node.setData(newEntry);
		}
		if(newEntry.compareTo(node.getData()) > 0) {
			node = node.getRightChild();
		}
		if(newEntry.compareTo(node.getData()) < 0) {
			node = node.getLeftChild();
		}
		if(node.hasLeftChild() == false && node.hasRightChild() == false) {
			node.setData(newEntry);
			set = true;
		}
		
		
	}
	return null;
}





/** Removes a specific entry from this tree.
    @param entry  An object to be removed.
    @return  Either the object that was removed from the tree or
             null if no such object exists. */
public T remove(T entry) {
	BinaryNode<T> node = new BinaryNode<T>();
	boolean found = false;
	while (found = false); {
		if (entry.compareTo(node.getData()) == 0) {
			
			//if node is leaf - remove
			if (node.getLeftChild().getData() == null && node.getRightChild().getData() == null) {
				node.setData(null);
				found = true;return entry;
			}
			
			//if node has 1 child - replace
			else if (node.getLeftChild().getData() != null && node.getRightChild().getData() == null) { //1 left - 0 right
				node = node.getLeftChild();
				node.getLeftChild().setData(null);
				found = true;return entry;
			}
			else if (node.getLeftChild().getData() != null && node.getRightChild().getData() == null) { //0 left - 1 right
				node = node.getRightChild();
				node.getRightChild().setData(null);
				found = true;return entry;
			}
			
			//if node has 2 children - substitute predecessor 
			boolean loop = false;
			while(loop = false) { //looking for predecessor 
				BinaryNode<T> temp = new BinaryNode<T>();
							
				if(temp.hasRightChild() == false && temp.hasLeftChild() == true) {//if only left leaf
					node = temp.getLeftChild();
					temp.getLeftChild().setData(null);
					loop = true;
				}
				if(temp.hasRightChild() == true && temp.hasLeftChild() == false) {//if only right leaf
					node = temp.getRightChild();
					temp.getRightChild().setData(null);
					loop = true;
				}
				if(temp.hasRightChild() == false && temp.hasLeftChild() == false) {//if last leaf
					node = temp;
					temp.setData(null);
					loop = true;
				}
				
				
				
				if(temp.getRightChild().getData().compareTo(temp.getData()) < 0) {//if right is smaller
					temp.equals(temp.getRightChild()); continue;
				}
				if(temp.getRightChild().getData().compareTo(temp.getData()) < 0) {//if left is smaller
					temp.equals(temp.getRightChild()); continue;
				}
			}
			
			
			
		}
		else if(entry.compareTo(node.getData()) > 0){
				node = node.getRightChild();
			}
		else if(entry.compareTo(node.getData()) < 0){
			node = node.getLeftChild();
		}
	}
	
	return null;
}






/** Creates an iterator that traverses all entries in this tree.
    @return  An iterator that provides sequential and ordered access
             to the entries in the tree. */
//public Iterator<T> getInorderIterator(){
//	return getInorderIterator();	
//}
} // end BinarySearchTree