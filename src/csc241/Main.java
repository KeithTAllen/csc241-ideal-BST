package csc241;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Create/print out an ArrayList of sorted Integers
        ArrayList<Integer> orderedlist1 = new ArrayList<>();
        for(int x = 1; x <= 15; x++){
            orderedlist1.add(x);
        }
        for ( Integer x : orderedlist1) {
            System.out.println(x);
        }

        System.out.println("-------------------");

        //Sort/print out the integers into "BstOrder"
        BstSorter sorter1 = new BstSorter(orderedlist1);
        ArrayList<Integer> bstOrderedList1 = sorter1.sort();
        for (Integer x : bstOrderedList1) {
            System.out.println(x);
        }

        System.out.println("-------------------");

        //Put the BstOrdered list into a BST and printout the tree in three ways
        IntBst bst1 = new IntBst();
        for(int x = 0; x < bstOrderedList1.size(); x++){
            bst1.insert(bstOrderedList1.get(x));
        }
        System.out.println("In order: " + bst1.inOrder());
        System.out.println("Pre order: " + bst1.preOrder());
        System.out.println("Post order: " + bst1.postOrder());

        System.out.println("-------------------");

        //check if the tree is perfect and add another element to disrupt it.
        System.out.println("bst1 perfect: " + bst1.checkPerfect());
        System.out.println("add value to unbalance tree");
        bst1.insert(0);
        System.out.println("bst1 perfect: " + bst1.checkPerfect());
    }
}
