/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.list;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie_000
 */
public class ListTest {
    
    public ListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of IsEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        List instance = new List();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        List instance = new List();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of search method, of class List.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object element = null;
        List instance = new List();
        Node expResult = null;
        Node result = instance.search(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class List.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element= new Object();
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of substitute method, of class List.
     */
    @Test
    public void testSubstitute() {
        System.out.println("substitute");
        List instance = new List();

        Object currentElement = new Object();
        Object newElement = null;
         instance.add(currentElement);
        instance.substitute(currentElement, newElement);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of iterator method, of class List.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        List instance = new List();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Empty method, of class List.
     */
    @Test
    public void testEmpty() {
        System.out.println("Empty");
        List instance = new List();
        instance.Empty();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of find method, of class List.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object element = null;
        List instance = new List();
        int expResult = 0;
        int result = instance.find(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class List.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object element = null;
        List instance = new List();
        instance.delete(element);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
