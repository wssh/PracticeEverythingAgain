/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.everything.again;

/**
 *
 * @author Ricky
 */
public class DNode {
    Object val;
    DNode next;
    DNode prev;
    
    public DNode(){}
    public DNode(Object val, DNode next, DNode prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
    
    public DNode getNext(){
        return next;
    }
    
    public DNode getPrev(){
        return prev;
    } 
}
