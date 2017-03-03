/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.list;

import Interfaces.TADList;
import java.util.Iterator;

/**
 * Is a model and also a controller of a to do list
 * @author Daniel Jimenez
 * @since 3 March 2017
 */
public class List implements TADList{
    private Node newNode;
  
    /**
     * Sets a list with its node as null
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
     * Adds a element to the task list
     * @param element New element to be placed in the list
     */
    @Override
    public void add(Object element) {
        newNode= new Node(newNode, element);
    }
    
    /**
     * Searches a element into the task list
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
     * Defines if a list contains a element
     * @param element the element to be searched
     * @return True if it contains it, false isn't
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
     * 
     * @return 
     */
    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Cleans a node
     */
    @Override
    public void Empty() {
       newNode=null;
    }
    
    /**
     * 
     * @param element
     * @return 
     */
    @Override
    public int find(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Searches in the task list and deletes a element
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
