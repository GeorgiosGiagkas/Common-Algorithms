/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.search;

/**
 *
 * @author giagkas
 */

//Complexity O(logn) 
public class BinarySearch {
    //array must be sorted
    public int search(int[] array, int l, int r, int x) {
        if (r >= l) {
            int m = l + (r - l) / 2;//mid
            if (array[m] == x) {
                return m;
            }
            if(x<array[m]){
               return search(array, l, m-1, x);
            }
            else{
                return search(array,m+1,r,x);
            }
        }
        return -1;
    }
}
