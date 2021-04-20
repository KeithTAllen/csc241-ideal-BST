package csc241;

import java.util.Random;

public class IntNode {
    // Instance variables
    int value;
    IntNode left,right;

    // Constructor
    public IntNode(int value){
        this.value = value;
        this.left = this.right = null;
    }

    // insert - insert value in appropriate subtree
    public void insert(int v){
        // Determine subtree
        if (v <= value){
            // belongs in left
            if (left == null) {
                // Create a new left child
                left = new IntNode(v);
            } else {
                // Delegate to left
                left.insert(v);
            }
        } else {
            // belongs on the right
            if (right == null) {
                // Create a new right child
                right = new IntNode(v);
            } else {
                // Delegate to right
                right.insert(v);
            }
        }
    }

    // contains - finds a value
    public boolean contains(int v){
        // Check for value
        if (v == value) {
            return true;
        } else if (v < value) {
            // Could be on the left
            if (left == null) {
                // No left child
                return false;
            } else {
                // Delegate to left
                return left.contains(v);
            }
        } else {
            // might on the right
            if (right == null) {
                // No right child
                return false;
            } else {
                // Delegate to right
                return right.contains(v);
            }
        }
    }

    // remove -- Remove values from the tree
    public IntNode remove(int v){
        // Check the subtrees
        if (v < value) {
            // Delegate to left child
            if (left != null) {
                left = left.remove(v);
            }
        } else if (v > value){
            // Delegate to right child
            if (right != null) {
                right = right.remove(v);
            }
        } else {
            // I'm getting removed
            if (left == null && right == null) {
                // Case 1 - leaf node
                return null;
            } else if (left != null && right == null){
                // Case 2 - node with only left
                return left;
            } else if (left == null && right != null){
                // Case 2 - node with only right
                return right;
            } else {
                // Case 3 - two children
                Random r = new Random();  // Random value generator

                //  (1) Identify a new value, then (2) remove the duplicate
                if (r.nextBoolean()){
                    // get maximum value from left
                    value = left.rightMost();
                    // remove duplicate from the left
                    left = left.remove(value);
                } else {
                    // get minimum value from right
                    value = right.leftMost();
                    // remove duplicate from the right
                    right = right.remove(value);
                }
            }
        }
        // Return self reference
        return this;
    }

    protected int rightMost() {
        // returns the right most value
        if (right == null) {
            // no more right children
            return value;
        } else {
            return right.rightMost();
        }
    }

    protected int leftMost() {
        // returns the left most value
        if (left == null) {
            // no more left children
            return value;
        } else {
            return left.leftMost();
        }
    }

    // Traversals
    public String inOrder(){
        String treeStr = "";

        // Go left
        if (left != null) {
            treeStr = treeStr + left.inOrder();
        }

        // Visit
        treeStr = treeStr + "[" + value + "]";

        // Go right
        if (right != null) {
            treeStr = treeStr + right.inOrder();
        }

        // Return string
        return treeStr;
    }

    public String preOrder(){
        String treeStr = "";
        // Visit
        treeStr = treeStr + "[" + value + "]";

        // Go left
        if (left != null) {
            treeStr = treeStr + left.preOrder();
        }

        // Go right
        if (right != null) {
            treeStr = treeStr + right.preOrder();
        }

        return treeStr;
    }

    public String postOrder(){
        String treeStr = "";

        // Go left
        if (left != null) {
            treeStr = treeStr + left.postOrder();
        }

        // Go right
        if (right != null) {
            treeStr = treeStr + right.postOrder();
        }

        // Visit
        treeStr = treeStr + "[" + value + "]";

        return treeStr;
    }
}