/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sort;

/**
 *
 * @author giagkas
 */
public class MergeSort {
    private int[] array;
    private int[] tempArray;
    private int length;

    public void sort(int[] array) {        
        this.array = array;
        this.length = array.length;
        this.tempArray = new int[length];
        if (length > 1) {
            doSort(0, length - 1);
        }
    }

    private void doSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {//base case
            //find middle 
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            //sort lower
            doSort(lowerIndex, middle);
            //sort higher
            doSort(middle + 1, higherIndex);
            //merge
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        //copy contents of array into temparray
        for (int i = 0; i < this.length; i++) {
            tempArray[i] = array[i];
        }

        int l = lowerIndex;
        int m = middle + 1;
        int k = lowerIndex;

        while (l <= middle && m <= higherIndex) {
            if (tempArray[l] < tempArray[m]) {
                array[k] = tempArray[l];
                l++;
            } else {
                array[k] = tempArray[m];
                m++;
            }
            k++;
        }

        while (l <= middle) {
            array[k] = tempArray[l];
            l++;
            k++;
        }
    }
}
