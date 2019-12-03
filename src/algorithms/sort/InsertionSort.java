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
public class InsertionSort {
     //O(n2)
    public  void sortCharArray(char [] data){
        int n = data.length;
        for(int k=1;k<n;k++){//begin with second character
            char c = data[k];
            int j = k;
            while(j>0 && data[j-1]>c){
                data[j]=data[j-1];//slide forward
                j--;
            }
            data[j]=c;//place c
            
        }
    }
    
    
    public  void sortIntArray(int [] data){
        int n = data.length;
        for(int k=1;k<n;k++){//begin with second character
            int i = data[k];
            int j = k;
            while(j>0 && data[j-1]>i){
                data[j]=data[j-1];//slide forward
                j--;
            }
            data[j]=i;//place c
            
        }
    }
}
