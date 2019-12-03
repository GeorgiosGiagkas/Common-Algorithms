/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author giagkas
 */
public class BucketSort {
    public List<Integer> sort(List<Integer> initialList){
        //find nubmer of buckets to create
        final int numBuckets = (int) Math.sqrt(initialList.size());
        //create buckets List and List for each bucket
        List<List<Integer>> buckets = new ArrayList<>(numBuckets);
        for(int i =0 ; i<numBuckets;i++){
            buckets.add(new ArrayList<>());
        }
        
        int maxValue = findMaxValue(initialList);
        
        //put each num to corresponding bucket
        initialList.forEach(i->{
            buckets.get(findBucket(i, maxValue, numBuckets)).add(i);
        });
        
        //sort each bucket based on sorting Algorithm (example: insertion sort, merge sort etc)
        buckets.forEach(b->{
            b.sort(Comparator.naturalOrder());
        });
        
        //combine buckets
        List<Integer> sortedList = new LinkedList<>();
        buckets.forEach(b->sortedList.addAll(b));
        
        return sortedList;
    }
    
    //find in which bucket to put each int
    private int findBucket(int i, int maxValue, int numBuckets){        
        return (int)((double)i/maxValue *(numBuckets-1));        
    }
    
    //find max 
    private int findMaxValue(List<Integer> list){
        
        return list.stream().mapToInt(i->i).max().getAsInt();
    }
}
