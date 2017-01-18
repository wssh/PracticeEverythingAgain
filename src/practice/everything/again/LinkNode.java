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
public class LinkNode {
    Object val;
    LinkNode next;
    
    //Default Constructor
    public LinkNode(){
        next = null;
        val = 0;
    }
    //Overloaded Constructors
    public LinkNode(Object val) {
        next = null;
        this.val = val;
    }
    
    public LinkNode(Object val, LinkNode next){
        this.next = next;
        this.val = val;
    }
    
    //Get/Set methods
    public Object getData(){
        return val;
    }
    
    public void setData(Object val){
        this.val = val;
    }
    
    public LinkNode getNext(){
        return next;
    }
    
    public void setNext(LinkNode next){
        this.next = next;
    }
}
