package csc241;

public class Main {

    public static void main(String[] args) {

        IntBst tree1 = new IntBst();

        tree1.insert(4);
        tree1.insert(2);
        tree1.insert(6);
        tree1.insert(1);
        tree1.insert(3);
        tree1.insert(5);
        tree1.insert(7);
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

        System.out.println("INORDER: " + tree1.inOrder());
        System.out.println("PREORDER: " + tree1.preOrder());
        System.out.println("POSTORDER: " + tree1.postOrder());

    }
}
