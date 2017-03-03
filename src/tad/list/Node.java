/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.list;

/**
 *  This class contains a node of a simply linked list
 * @author Daniel Jimenez
 * @since 1 March 2017
 */
public class Node {
   /**
    * This constructor replaces the object in the node, and the node with a
    * reference
    * @param nde The new reference or node
    * @param value The object to be placed in the node
    */
    public Node(Node nde,Object value) {
       element=value;
       nextNde=nde; 
        
    }
    
    /**
     * Places a object in the node and at the same time, make a null reference
     * @param value 
     */
    public Node(Object value){
        this(null,value);
    }
    
    
    /**
     * Returns the next node
     * @return The reference to other node
     */
    public Node getNde() {
        return nextNde;
    }
    
    /**
     * Sets a node in the current node
     * @param nde the node to be placed
     */
    public void setNde(Node nde) {
        this.nextNde = nde;
    }
    
    /**
     * Returns the element of the node
     * @return The object of the element
     */
    public Object getElement() {
        return element;
    }
    
    /**
     * Puts a element into the current node
     * @param elmenet The element to be placed
     */
    public void setElement(Object elmenet) {
        this.element = elmenet;
    }
    private Node nextNde;
    
    private Object element;
    
    
    
}
