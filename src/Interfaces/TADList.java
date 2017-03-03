/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 * @author Daniel Jimenez
 * @version 1.0
 */
public interface TADList {
    
    /**
     * Check if the list is empty
     * @return : Boolean true if is empty, false isn´t
     */
    public boolean IsEmpty();
    
    public void Empty();
    
    /**
     * Add a new element to the list
     * @param element new element to be added
     */
    public void add(Object element);
    
    /**
     * Search and return a position of the element to find
     * @param element the element to be searched
     * @return int: with the position
     */
    public int find(Object element);
    
    /**
     * Delete a element in the list
     * @param element the element to be deleted
     */
    public void delete(Object element);
    
    /**
     * Ask to the list, if a element is contained on it
     * @param element element to be wanted
     * @return Boolean: True if the list contains the element, false it isn´t
     */
    public boolean contains(Object element);
      
    /**
     * Substitute a new element in the list on the position of a current element
     * @param currentElement
     * @param newElement 
     */
    public void substitute(Object currentElement, Object newElement);
    
    /**
     * Ask a iterator
     * @return a Iterator
     */
    public java.util.Iterator iterator();
    
}
