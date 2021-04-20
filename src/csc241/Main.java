package csc241;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> orderedlist1 = new ArrayList<>();
        for(int x = 1; x <= 7; x++){
            orderedlist1.add(x);
        }
        for ( Integer x : orderedlist1) {
            System.out.println(x);
        }

        System.out.println("-------------------");

        BstSorter sorter1 = new BstSorter(orderedlist1);
        ArrayList<Integer> bstOrderedList1 = sorter1.sort();
        for (Integer x : bstOrderedList1) {
            System.out.println(x);
        }

        System.out.println("-------------------");

        IntBst bst1 = new IntBst();
        for(int x = 0; x < bstOrderedList1.size(); x++){
            bst1.insert(bstOrderedList1.get(x));
        }
        System.out.println("In order: " + bst1.inOrder());
        System.out.println("Pre order: " + bst1.preOrder());
        System.out.println("Post order: " + bst1.postOrder());

        System.out.println("-------------------");

        System.out.println("bst1 perfect: " + bst1.checkPerfect());
        bst1.insert(0);
        System.out.println("bst1 perfect: " + bst1.checkPerfect());

//        IntBst tree1 = new IntBst();
//        tree1.insert(4);
//        tree1.insert(2);
//        tree1.insert(6);
//        tree1.insert(1);
//        tree1.insert(3);
//        tree1.insert(5);
//        tree1.insert(7);
//
//        tree1.insert(20);
//        tree1.insert(10);
//        System.out.println("INORDER: " + tree1.inOrder());
//        tree1.insert(30);
//        System.out.println("INORDER: " + tree1.inOrder());
//
//
//        System.out.println("CONTAINS 30: " + tree1.contains(30));
//        System.out.println("CONTAINS 15: " + tree1.contains(15));

        // Remove
//        tree1.remove(30);
//        System.out.println("CONTAINS 30 after remove: " + tree1.contains(30));
//        tree1.remove(20);
//        System.out.println("CONTAINS 20 after remove: " + tree1.contains(20));
//        System.out.println("CONTAINS 10 after remove: " + tree1.contains(10));
//
//        System.out.println("INORDER: " + tree1.inOrder());
//        System.out.println("PREORDER: " + tree1.preOrder());
//        System.out.println("POSTORDER: " + tree1.postOrder());
    }
}
