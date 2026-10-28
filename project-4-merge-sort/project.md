# Project 4: Merge Sort

Initial due date: 2026-11-08 23:59 PT

In this project, you will be implementing merge sort on a singly-linked list - in fact, your `IntLinkedList` implementation from Worksheet 1. Merge sort for linked lists works in much the same as it does for arrays, with the exception that you will need to return the head of a sublist so that merging can occur (as opposed to relying in indices for arrays). Otherwise, the same divide and conquer strategy applies as with merge sort on an array, with the same O(n log n) complexity. In fact, it is arguably more efficient, since you no longer need the O(n) memory cost of having an extra array as you move things around.

For this project, you should use your previous `IntLinkedList.java`, and add a single function - `void mergesort()`. Your implementation of merge sort must satisfy two constraints:

1. Your implementation must *not* use arrays in any way
2. Your implementation must have a O(n log n) runtime complexity.
3. Your implementation must have a O(1) memory complexity - that is, it should not create any new Nodes beyond the nodes already in the list.

Submit your completed merge sort implementation to the autograder, and also include it it GitHub. Additionally, write a paragraph below explaining how your implementation meets the complexity requirements above. Tag me in a pull request when you have passed all the testcases, so I can review your code.

Complexity justification:

FIXME
