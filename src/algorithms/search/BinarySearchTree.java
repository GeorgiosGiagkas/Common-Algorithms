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
public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }
    
    //O(logn)
    public boolean find(int id){
        Node current = root;
        while(current!= null){
            if(current.value==id){
                return true;
            }
            else if(current.value<id){
                current = current.right;
            }
            else{
                current= current.left;
            }                  
        }        
        return  false;
    }
    
    
}
