/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class Node <T extends Comparable<T>> {
    Node<T> next;
    T value;
    
    /**
     * Constructor of new node
     * @param newValue value
     */
    public Node(T newValue){
        value = newValue;
    }
    
    /**
     * Gets the next node
     * @return the next node
     */
    public Node next(){
        return next;
    }
    
    /**
     * Checks if there is a next node
     * @return whether or not there is a next node
     */
    public boolean hasNext(){
        return next!=null;
    }
    
    /**
     * To string method for node
     * @return the value of the node in string format
     */
    @Override
    public String toString(){
        return value.toString();
    }
   
    
    
}
