/*
 * An object that can take a sorted list and sort it
 * into an order to make a perfectly balanced tree.
 */

package csc241;

import java.util.ArrayList;

public class BstSorter {
    private ArrayList<Integer> bstSorted = new ArrayList<>();
    private ArrayList<Integer> ordered;
    private int power;          //power that 2 is raised to; same as level of the tree the pullRequest will be on
    private int c;             //coefficient of root
    private int root;           //root position number of tree; root = (# of elements + 1)/2

    public BstSorter(ArrayList<Integer> ordered){
           this.ordered = ordered;
           this.power = 0;
           this.c = 1;
           this.root = (ordered.size()+1)/2;
    }

    public ArrayList<Integer> sort(){
        //establish root
        Integer pullRequest =(int) ((c*root)/Math.pow(2,power));

        //adds all even placed list items
        //when pull request equals 1, all even placed items have been added to the BstOrdered list
        while(pullRequest != 1){
            //if the pullRequest is greater than a possible place, this means that we need to
            //go down a level in the tree. So c is reset and power is incremented.
            if(pullRequest > ordered.size()){
                c = 1;
                power = power + 1;
            }
            //otherwise add it to the list and recalculate pullRequest
            else {
                bstSorted.add(ordered.get(pullRequest - 1 ));
                c = c + 2;
            }
            pullRequest = (int) ((c*root)/Math.pow(2,power));
        }

        //adds all odd placed items
        for(int x = 0; x < ordered.size(); x = x + 2) {
            bstSorted.add(ordered.get(x));
        }
        return bstSorted;
    }
}