/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.everything.again;

/**
 * followed http://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
 * @author Ricky
 */
public class DLinkList {
    private DNode head;
    private DNode tail;
    private int size;
    
    public DLinkList() {
        size = 0;
    }
    
    public int size(){ return size; }
    public boolean isEmpty() { return size == 0; }
    
    public void addFirst(Object val){
        DNode temp = new DNode(val, head, null);
        //If there is a head, make the new node the new head.
        if (head != null) {
            head.prev = temp;
        }
        head = temp;
        //If there is no tail, make the new node the tail.
        if (tail == null) {
            tail = temp;
        }
        size++; //increment the count of elements in the list
    }

    public void addLast(Object val){
        DNode temp = new DNode(val, null, tail);
        //If there is a tail, make the new node the tail.
        if(tail != null){
            tail.next = temp;
        }
        tail = temp;
        //If there is no head, make the new node the head.
        if(head == null) {
            head = temp;
        }
        size++;
    }
    
    public void add(Object val, int count){
        /*
        * very weird increments and decrements on the index in order to put
        * the value into literally the nth place
        */
        DNode current = head;
        int index = count-1;
        // if the index is 0 or less than 0, call addFirst
        if (index <= 0){
            addFirst(val);
            return;
        }
        // if the index is == size, or larger,, call addLast
        else if (index >= size()){
            addLast(val);
            return;
        }
        //those 2 if statements prevent any of the lower code from being called
        //the bottom code only gets called if there is an existing node
        if (current != null){
            for (int i = 0; i < index-1 && current.next != null; i++){
                current = current.next;
            }
        }
        DNode temp = new DNode(val, current.next, current);
        current.next = temp;
        current = current.next;
        temp = temp.next;
        temp.prev = current;
        size++;
    }
    
    public void iterateForward(){
        DNode temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    
    public void iterateBackward(){
        DNode temp = tail;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.prev;
        }
    }
        
    public void removeFirst(){
        if (size == 0){
            System.out.println("Invalid remove");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    
    public void removeLast(){
        if (size == 0){
            System.out.println("Invalid remove");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    
    public void remove(int count){
        if (size == 0){
            System.out.println("Invalid remove");
            return;
        }
        DNode current = head;
        int index = count-1;
        if (index <= 0){
            removeFirst();
            return;
        }
        else if (index+1 >= size()){
            removeLast();
            return;
        }
        if (current != null){
            for (int i = 0; i < index-1 && current.next != null; i++){
                current = current.next;
            }
        }
        DNode temp = current.next;
        current.next = temp.next;
        temp = temp.next;
        temp.prev = current;
        size--;
    }
}
