/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.everything.again;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ricky
 */
public class PracticeEverythingAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        Random rand = new Random();
        ArrayList<Integer> myNum = new ArrayList<>();
        System.out.println("Unsorted:");
        for (int i = 0; i < 20 ; i++){
            int n = rand.nextInt(50) + 1;
            //int n = i;
            myNum.add(n);
            //System.out.print(myNum.get(i) + " ");
        }
        System.out.println(myNum);
        //System.out.println("\nSorted(using bubble sort):");
        System.out.println("Sorted(using quick sort):");
        MySort sort = new MySort();
        //MySort.BubbleSort(myNum);
        MySort.qSort(myNum);
        System.out.println("Finished:\n" + myNum);
        
        /*System.out.println("\n\nLink list test:");
        LinkLists myList = new LinkLists();
        myList.add(new Integer(12));
        myList.add("teststring");
        myList.add(true);
        
        System.out.println("myList: " + myList);
        System.out.println(".size(): " + myList.size());
        System.out.println(".get(0): " + myList.get(0));
        System.out.println(".get(1): " + myList.get(1));
        System.out.println(".get(2): " + myList.get(2));
        System.out.println(".remove(1): " + myList.remove(1) + " element removed");;
        System.out.println("myList after removing: " + myList);
        System.out.println(".add(new Integer(99), 1)");
        myList.add(new Integer(99), 1);
        System.out.println("myList after adding 99 at pos 1: " + myList);
        */
        System.out.println("\nDoubly Link List Test:");
        DLinkList myList = new DLinkList();
        myList.add("test", 1);
        myList.add("test2", 1);
        myList.iterateForward();
        //System.out.println("removing 9th/last element, the 9");
        //System.out.println("size: " + myList.size());
        myList.remove(9);
        myList.iterateForward();
        myList.remove(0);
        System.out.println("size: " + myList.size());
        myList.iterateForward();
        myList.add("test3", 1);
        myList.addLast("test4");
        myList.addLast("test5");
        myList.addLast("test6");
        myList.iterateForward();
    }
}
