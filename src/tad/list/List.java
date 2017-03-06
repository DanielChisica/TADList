/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.list;

import Interfaces.TADList;
import java.io.Serializable;
import java.util.Iterator;

/**
 * It's a model and also a controller of a to do list
 * @author Daniel Jimenez
 * @since 3 March 2017
 */
public class List implements TADList, Serializable{
    private Node newNode;
  
    /**
     * Sets a list with it node as null
     */
    public List(){
        newNode=null;
    }
    
    /**
     * Constructor of a list 
     * @param list1 The list to be placed
     */
    public List(List list1){
       newNode=new Node(list1.newNode);
       Node list=list1.newNode;
       Node pos=newNode;
       
        while (list!=null) {            
            pos=new Node(list);
            list=list.getNde();
        }
    }
    
    /**
     * Defines if a list is empty
     * @return True if is empty, false isn't
     */
    @Override
    public boolean IsEmpty() {
        return newNode==null;
    }
    
    /**
     * Adds an element to the task list
     * @param element New element to be placed in the list
     */
    @Override
    public void add(Object element) {
        newNode= new Node(newNode, element);
    }
    
    /**
     * Searches an element into the task list
     * @param element The object to be searched
     * @return The node with its reference
     */
    public Node search(Object element){
        Node position=newNode;
        while (position!=null && ! position.getElement().equals(element)) {            
            position=position.getNde();
        }
        return position;
    }
  
    /**
     * Defines if a list contains an element
     * @param element the element to be searched
     * @return True if the list contains it, false isn't
     */
    @Override
    public boolean contains(Object element) {
       return search(element)!=null;
    }
    
    /**
     * Replaces a current element for a new element
     * @param currentElement The element in the task
     * @param newElement The new element
     */
    @Override
    public void substitute(Object currentElement, Object newElement) {
      Node n=search(currentElement);
        if (n!=null) {
            n.setElement(newElement);
        }
        else{
            throw new java.util.NoSuchElementException("El elemento "+currentElement + " no esta en la lista");
        }
    }
    
   /**
   * Method that returns an iterator about the list
   * @return java.util.Iterator -- The list iterator
   */
  public java.util.Iterator iterator() { 
    return new MyIterator(); 
  }
	
  /*
   * Class that implements the Iterator
   */
  private class MyIterator implements java.util.Iterator {
    private Node position = newNode;
    
    /**
     * Defines if there is other element
     * @return True if has next, false if doesn't have
     */
    public boolean hasNext() { return position != null;}
    
    /**
     * Allows to get the next object
     * @return The next object
     * @throws java.util.NoSuchElementException 
     */
    public Object next() throws java.util.NoSuchElementException {
      if (hasNext()) {
	Object o = position.getElement();
	position = position.getNde();
	return o;
      }
      throw new java.util.NoSuchElementException();
    }

    public void remove() {
      throw new IllegalStateException();
    }
  }
    
    
  
    /**
     * Cleans the list
     */
    @Override
    public void Empty() {
       newNode=null;
    }
    
    /**
     * Not implemented yet
     * @param element The element to be located
     * @return An int with the position
     */
    @Override
    public int find(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Searches in the task list and deletes an element
     * @param element the element to be deleted
     */
    @Override
    public void delete(Object element) {
       Node position=newNode;
        Node last=null;
        while (position!=null && position.getElement()!=element) {            
            last=position;
            position=position.getNde();
        }
        
        if (position!=null) {
            if (position==newNode) {
                newNode=newNode.getNde();
      
            }
            
            else{
                last.setNde(position.getNde());
            }
            
        }
        
    }

   
    
    
}
