/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.list;

/**
 *
 * @author Daniel Jimenez
 */
public class Node {

    public Node(Node nde,Object value) {
       element=value;
       nextNde=nde; 
        
    }
    
    public Node(Object value){
        this(null,value);
    }
    
    

    public Node getNde() {
        return nextNde;
    }

    public void setNde(Node nde) {
        this.nextNde = nde;
    }

    public Object getElment() {
        return element;
    }

    public void setElment(Object elmenet) {
        this.element = elmenet;
    }
    private Node nextNde;
    
    private Object element;
    
    
    
}
