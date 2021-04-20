# csc241-ideal-BST
 A series of programs that attempts to create ideal BST from already sorted data.

## IntBst() - IntNode() - Main() 
These classes are directly from the BstDemo Code on github.
## BstSorter
This class creates a BstSorted object that can perform
one method, sort(). The sort() method accepts one 
ordered ArrayList as an input and returns an ArrayList
in an order that can be given to a BST to create a 
perfectly balanced BST. This will only work with lists
that contain (2^n)-1 elements otherwise the rounding 
in the math used to reorder the list will remove items
from the list. 

The Integers do not need to be in ascending order 
starting at one, but the demo in the Main class does use
ascending Integers. 1, 2, 3 works just 
as well as 10, 20, 30.

Is this useful, who knows? But it is more of a proof
of concept than anything else.