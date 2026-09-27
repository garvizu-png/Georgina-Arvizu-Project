# Project 2: AVL Tree

Initial due date: 2026-10-11 23:59 PT

## Introduction

This project asks you to implement the `StringAVLTreeSet` class, which uses an AVL tree to store a set of Strings (without duplicates). The class already has a `Node root` and an `int size`, both of which are public. __Please do not rename these variables or make them private__, as the testing code relies on them to work correctly. Your job is instead to implement three methods:

* `void add(String string)`: Add a String to the tree. If the String already exists in the tree, no duplicate is added.

* `boolean contains(String string)`: Return whether the String is in the tree.

* `public void remove(String string)`: This method removes a String from the tree, if it exists. When a node is removed, an _earlier_ String should be used to replace it; if no earlier String exists, a _later_ String should be used instead.

__This is the most difficult assignment of this entire course__. All of the methods above must run in O(log n) time or faster and must be recursive, which makes them difficult to debug. I highly encourage you to start early and to seek help as soon as you are stuck.

## Comparing Strings

Just like how `==` may not give the correct result for Strings, `<` and `>` may not give the correct results either. For `==` we use `.equals()` instead; for `<` and `>`, we use [`.compareTo()`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)), which compares Strings based on their lexicographical order - that is, which one will appear first in a dictionary. `A.compareTo(B)` can return three things:

* an `int` less than 0 if `A` appears before `B`
* `0` if `A` and `B` are the same
* an `int` greater than 0 if `A` appears after `B`

So `"ABC".compareTo("DEF") < 0`, `"ABC".compareTo("ABC") == 0`, and `"DEC".compareTo("ABC") > 0` will all evaluate to `true`.

## Supporting Methods, Classes, and Functions

The `StringAVLTreeSet` class already has two methods `clear()` and `size()` written for you, which remove all nodes and returns the size of the tree respectively. The `Node` class is also provided and already has all the member variables needed. You should not change `Node.java`, as your changes will not be reflected in the autograder. Finally, there are three functions in `TreeFunctions.java` to help with testing and debugging, which can take either a `StringAVLTreeSet` (if you want information on the whole tree) or a `Node` (if you want information on a subtree).

Note that all of these methods rely on the `left` and `right` pointers of your nodes, meaning that _if your tree is malformed, these functions could go into an infinite loop_. These methods are meant to help, but not replace, normal debugging.

* `int[] toSortedArray()` puts the Strings in the tree into an array in sorted order. For example, consider the tree:

    ```
        D 
       / \
      B   F 
     / \   \
    A   C   G
    ```

    Calling `toSortedArray()` on this tree will return a `String[]`:

    ```
    {"A", "B", "C", "D", "F", "G"}
    ```

* `void prettyPrint()` prints out the tree in a human-readable form. The output is a normal tree rotated counter clockwise, so the root is on the left and the leaves towards the right, with earlier elements at the bottom and later elements at the top. Calling `prettyPrint()` on the tree above will print:

    ```
        "G"
      "F"
        null
    "D" 
        "C"
      "B"
        "A"
    ```

* `String toStructureString()` returns a String that encodes the entire structure of the tree. This is primarily used for testing on the autograder, and so may not be as useful for you. In the resulting string, each node in the tree is a set of parenthesis, with the first item in the parenthesis being the value, the second item being the left child, and the third item being the right child. The `null` "node" is represented as a set of empty parentheses. Calling `toStructureString()` on the tree above will return the String:

    ```
    ("D" ("B" ("A" () ()) ("C" () ())) ("F" () ("G" () ())))
    ```

## Hints

Since writing an AVL tree is a significant undertaking, I recommend breaking down the process into the following steps:

1. Write the code for a recursive binary search tree _that doesn't self-balance_. Use the functions in `TreeFunctions.java` to make sure the result follows the binary search tree property. To make the next steps easier, _make sure your recursive calls return the root node of the subtree_. This isn't necessary for an unbalanced binary search tree, but is essential for an AVL tree.

2. Figure out some test cases (i.e., sequence of Strings to add) that might identify bugs in an AVL tree. Start with the smallest examples possible - what Strings would you have to insert, in what order, to force a clockwise rotation? A counter-clockwise rotation? A double rotation? Then start writing test cases that involve children, etc.

3. Write the code for adding to an AVL tree, by adding code that can rotate and balance the nodes. As before, each recursive call should return the root of that subtree, _even if a rotation has occurred_. The new root will be connected to the parent _after_ the recursive call returns.

4. Finally, write the code for removing elements from an AVL tree.

While it's easy to find working implementations of AVL trees online, I encourage you *not* to look at them, and write your code using only the description from the textbook and your own understanding of AVL trees. If you feel the need to look at working code, your aim should be to better understand how that code works, and once you gain that understanding, you should write your program without reference to the working implementation. __Do *not* copy code from an existing AVL tree implementation.__
