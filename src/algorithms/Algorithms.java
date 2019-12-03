/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import algorithms.search.BinarySearch;
import algorithms.sort.BucketSort;
import algorithms.sort.InsertionSort;
import algorithms.sort.MergeSort;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author giagkas
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        //insertion sort
        int [] array1 = new int[]{5,0,3,10,12,4};
        sortWithInsertionSort(array1);
        
        //Merge sort
        int [] array2 = new int[]{5,0,3,10,12,4};
        sortWithMergeSort(array2);
        
        
        //Bucket sort
        List<Integer> list1 = Arrays.asList(5,0,3,10,12,4);
        sortWithBucketSort(list1);
        
        //Binary Search
         int[] array = new int[]{1,2,3,4,5};
        runBinarySearch(array,5);
        
        
    }
    public static void runBinarySearch(int [] array, int numToSearch){
        System.out.println("Array to search with binary search algorithm: ");
        Arrays.stream(array).boxed().forEach(x->System.out.printf("%d ",x));
        System.out.println("");
        BinarySearch bs = new BinarySearch();
        int result = bs.search(array, 0, array.length-1, numToSearch);
        System.out.println("Binary Search: "+numToSearch+" found in index "+result);
    }
    
    public static void sortWithInsertionSort(int[] array){
        System.out.println("Before insertion sort: ");
        Arrays.stream(array).boxed().forEach(x->System.out.printf("%d ",x));
        System.out.println("");
        //sort
        InsertionSort is = new InsertionSort();
        is.sortIntArray(array);
        
        System.out.println("After insertion sort: ");
         Arrays.stream(array).boxed().forEach(x->System.out.printf("%d ",x));
         System.out.println("");
    }
    
    public static void sortWithMergeSort(int[] array){
        System.out.println("Before merge sort: ");
        Arrays.stream(array).boxed().forEach(x->System.out.printf("%d ",x));
        System.out.println("");
        //sort
        MergeSort ms = new MergeSort();
        ms.sort(array);
        
        System.out.println("After merge sort: ");
         Arrays.stream(array).boxed().forEach(x->System.out.printf("%d ",x));
         System.out.println("");
    }
    
     public static void sortWithBucketSort(List<Integer> list){
        System.out.println("Before bucket sort: ");
        list.forEach(x->System.out.printf("%d ",x));
        System.out.println("");
        //sort
         BucketSort bs = new BucketSort();
         List<Integer> sortedList = bs.sort(list);
        
        System.out.println("After bucket sort: ");
         sortedList.forEach(x->System.out.printf("%d ",x));
         System.out.println("");
    }
    
}
