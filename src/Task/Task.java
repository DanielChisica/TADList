/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import java.io.Serializable;

/**
 * This class configures a single task with the attributes: boolean done
 * and its String name 
 * 
 * @author Daniel Jimenez
 * @since 3 March 2017
 */
public class Task implements Serializable{
    
    /**
     * The constructor states a task with the input attributes
     * @param name The name of the task
     * @param done True if it's done, false isn't
     */
    public Task(String name, boolean done) {
        this.name = name;
        this.done = done;
    }
    
    /**
     * Returns the String with the name
     * @return The name of the task
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name to the task
     * @param name The String name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns if the task is already done, false isn't
     * @return The boolean attribute
     */
    public boolean isDone() {
        return done;
    }
    
    /**
     * Sets if the task is already done
     * @param done The input boolean true if the task already done, false isn't
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    private String name;
    private boolean done;
    
    
}
