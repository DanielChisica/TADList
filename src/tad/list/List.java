/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.list;

import Interfaces.TADList;
import java.util.Iterator;

/**
 *
 * @author EAN
 */
public class List implements TADList{
    private Node newNode;
    
    public List(){
        newNode=null;
    }
    
    public List(Object element){
       
    }

    @Override
    public boolean IsEmpty() {
        return newNode==null;
    }
    

    @Override
    public void add(Object element) {
        newNode= new Node(newNode, element);
    }

    @Override
    public int find(Object element) {
       boolean finded;
       Node nodo=new Node(newNode, element);
        while (finded=false) {
            
        }
    }

    @Override
    public Object delete(Object element) {
        Node pos=new Node(newNode, element);
        while (pos!=null && pos.getElement()!=element) {            
            pos
        }
    }

    @Override
    public boolean contains(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void substitute(Object currentElement, Object newElement) {
        Node n= search(currentElement);
        if (n!=null){
            newElement=n.getElement();
        }
        else{
            throw new NoSuch
        }
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Empty() {
       newNode=null;
    }

   
    
    
}
