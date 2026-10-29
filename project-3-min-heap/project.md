# Project 3: Min Heap

Initial due date: 2026-11-08 23:59 PT

In this project, you will be implementing a min heap backed by an auto-resizing array list - in fact, your `IntArrayList` implementation from Worksheet 1. Note that you will need to write an additional method, `void set(int index, int value)`, for your min heap to work correctly; see [the Java documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#set-int-E-) for what the method should do. Your `IntArrayList` should not otherwise be different from what you submitted for Worksheet 1, and your min heap should only use the defined methods, NOT any of the internal member variables.

Your implementation of a min heap must satisfy the constraint that both `enqueue()` and `dequeue()` must have a O(log n) time complexity. Submit your both your updated `IntArrayList` and the completed `IntMinHeap` to the autograder, and also include it on GitHub. Additionally, write a paragraph below explaining how your implementation meets the complexity requirements above. Tag me in a pull request when you have passed all the testcases, so I can review your code.

Complexity justification:

FIXME
