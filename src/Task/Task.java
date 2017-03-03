/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

/**
 * This class configures a single task with the atrributes: boolean done
 * and its String name 
 * 
 * @author Daniel Jimenez
 * @since 
 */
public class Task {
    
    /**
     * 
     * @param name
     * @param done 
     */
    public Task(String name, boolean done) {
        this.name = name;
        this.done = done;
    }
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isDone() {
        return done;
    }
    
    /**
     * 
     * @param done 
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    private String name;
    private boolean done;
    
    
}
