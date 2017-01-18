/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.everything.again;

/**
 * followed the tutorial on Crunchify's website: http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
 * @author Ricky
 */
public class LinkLists {
    private static int counter;
    private LinkNode head;
    
    //Default Constructor
    public LinkLists() { counter = 0; } // no head
    
    //If you created your own head, use this constructor
    public LinkLists(LinkNode head){
        this.head = head;
        counter = 0;
    }
    
    //appends an object to the end of the list
    public void add(Object data) {
        //If there is no head, initialize the first node added as the head
        if (head == null){
            head = new LinkNode(data);
        }
        
        LinkNode temp = new LinkNode(data);
        LinkNode current = head;
        
        //iterate through the nodes until you hit the very last node
        if (current != null) {
            while (current.getNext() != null){
                current = current.getNext();
            }
            
            current.setNext(temp);
        }
        counter++; //increment the count of nodes
    }
    
    //append an object at a specific location of the list
    public void add(Object data, int index){
        LinkNode temp = new LinkNode(data);
        LinkNode current = head;
        
        if (current != null){
            //iterate through the nodes until you hit the desired location or until you hit the very last node
            for (int i = 0; i < index && current.getNext() != null; i++){
                current = current.getNext();
            }
        }
        //set the new node's next to the selected node's next
        temp.setNext(current.getNext());
        //set the selected node's next to reference the new node
        current.setNext(temp);
        counter++; //increment the count of nodes
    }
    
    public Object get(int index){
        //returns the element at the specified index in the list
        if (index < 0) return null;
        LinkNode current = null;
        //if there is a list, iterate through the list
        if(head != null){
            current = head.getNext(); //set the current node to the 1st element
            //iterate through the list until the specified index or until the last node
            for(int i = 0; i < index; i++){
                if (current.getNext() == null)
                    //return null if the current node is the last node
                    return null;
                current = current.getNext();
            }
            return current.getData(); //if the method successfully iterated through the list, return the data
        }
        return current; //return null if there isn't a list
    }
    
    public boolean remove(int index){
        //if the index is out of bounds, return false
        if (index < 1 || index > size())
            return false;
        LinkNode current = head;
        if (head != null){
            //iterate through the list until the specified index or until the last node
            for (int i =0; i < index; i++){
                if (current.getNext() == null)
                    return false;
                current = current.getNext();
            }
            //set the current node's next to the node after the next node. basically ignoring the node in between current and the node after the one you want to delete.
            current.setNext(current.getNext().getNext());
            counter--;
            return true;
        }
        return false;
    }
    
    public String toString(){
        String output = "";
        
        if (head != null) {
            LinkNode current = head.getNext();
            while (current != null){
                output += "[" + current.getData().toString() + "]";
                current = current.getNext();
            }
        }
        return output;
    }
    
    public int size(){
        return counter;
    }
    
    
}
