package csc241;

public class IntBst {
    // Instance Variables
    IntNode root;

    // Constructor
    public IntBst(){
        // Create an empty tree
        this.root = null;
    }

    // insert - insert a new value
    public void insert(int v){
        if (root == null){
            // First node
            root = new IntNode(v);
        } else {
            root.insert(v);
        }
    }

    // Contains -- look for a value
    public boolean contains(int v){
        if (root == null) {
            return false;
        } else {
            return root.contains(v);
        }
    }

    // remove -- remove a value
    public void remove(int v){
        if (root != null) {
            root = root.remove(v);
        }
    }

    // inOrder -- in order traversal
    public String inOrder(){
        if (root != null) {
            return root.inOrder();
        } else {
            return "";
        }
    }

    // preOrder -- preorder traversal
    public String preOrder(){
        if (root != null) {
            return root.preOrder();
        } else {
            return "";
        }
    }

    // postOrder -- post order traversal
    public String postOrder(){
        if (root != null) {
            return root.postOrder();
        } else {
            return "";
        }
    }

    public boolean checkPerfect(){
        if (root != null){
            return root.checkPerfect();
        }
        else return true;
    }
}