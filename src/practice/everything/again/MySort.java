/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.everything.again;

import java.util.ArrayList;

/**
 *
 * @author Ricky
 */
public class MySort {
    
    private static ArrayList<Integer> num; //global variable for quicksort
    private static int length; //global variable for quicksort
    
    public static void BubbleSort(ArrayList<Integer> num){
        int j;
        boolean flag = true;
        int temp;
        
        while (flag){
            flag = false;
            for (j=0; j < num.size() -1; j++){
                if (num.get(j) > num.get(j+1)){
                    temp = num.get(j);
                    num.set(j, num.get(j+1));
                    num.set(j+1, temp);
                    flag = true;
                }
                //uncomment to see the entire for loop go through it's steps 
                //System.out.println(num);
            }
        }
    }
    
    public static void qSort(ArrayList<Integer> list){
        if (list == null || list.isEmpty()) {
            //if there is no list or if the list is empty, return.
            return;
        }
        num = list;
        length = list.size();
        quickSort(0, length - 1); 
    }
    
    public static void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        //calculate the pivot number. take the middle element.
        int pivot = num.get(i+(j-i)/2);
        //System.out.println("lowerIndex: " + lowerIndex);
        //System.out.println("higherIndex: " + higherIndex);
        //System.out.println("Pivot: " + pivot);
        //Keep checking until the lower index crosses the higher index
        while (i <= j){
            //If the lower indexed element is smaller than the pivot, it's in the right place
            while (num.get(i) < pivot){
                //System.out.println(i);
                i++; //Keep going up the array
            }
            //If the higher indexed element is larger than the pivot, it is in the right place.
            while (num.get(j) > pivot){
               //System.out.println(j);
                j--; //Keep going down the array
            }
            //If the lower index has not crossed the higher index yet
            if (i <= j) {
                //Exchange the lower # and the higher #
                exchangeNumbers(i, j);
                i++; //Go to the next element if swapped
                j--; //Go to the next element if swapped
                //System.out.println(num);
            }
        }
        //Recursively call quickSort again, except you do it with the lower half of the pivot and the higher half.
        //Divine and conquer method
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if(i < higherIndex)
            quickSort(i, higherIndex);
    }
    
    private static void exchangeNumbers(int i, int j){
        //System.out.println("Exchanging " + num.get(i) + " and " + num.get(j));
        int temp = num.get(i);
        num.set(i, num.get(j));
        num.set(j, temp);
    }
}
