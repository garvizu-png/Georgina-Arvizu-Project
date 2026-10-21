# Worksheet 4: Heaps and Sorting

Initial due date: 2026-10-26 23:59 PT

## Review

1. In your own words, explain the worst-case runtime complexities of the following sorting algorithms. Justify your answers.

    1. insertion sort
    2. merge sort
    3. quicksort
    4. radix sort

2. In your own words, explain how enqueueing into a min-heap work? What is the worst-case runtime complexity? Justify your answer.

3. In your own words, explain how dequeueing from a min-heap work? What is the worst-case runtime complexity? Justify your answer.

## Explore

1. How might you use a AVL tree as part of a sorting algorithm? What would be the runtime complexity? Justify your answer.

2. How might you use a heap as part of a sorting algorithm? What would be the runtime complexity? Justify your answer.

3. One complexity unique to sorting algorithms that people care about is how they would perform on an array that was already sorted. For each of the following sorting algorithm, explain what would happen if the input was already sorted and what the runtime complexity would be. Justify your answers.

    1. insertion sort
    2. merge sort
    3. quicksort
    4. radix sort

4. Another case that people care about for sorting algorithms is how they would perform on an array that was sorted in _reverse_ order. For each of the following sorting algorithm, explain what would happen if the input was sorted in reverse and what the runtime complexity would be. Justify your answers.

    1. insertion sort
    2. merge sort
    3. quicksort
    4. radix sort

## Challenge

1. One improvement to merge sort, called _natural merge sort_, takes advantage of existing sublists that are already sorted. For example, to sort the list {3, 4, 2, 1, 7, 5, 8, 9, 0, 6}, natural merge sort will first identify the sorted sublists {3, 4}, {2}, {1, 7}, {5, 8, 9}, and {0, 6}, then start merging from these sublists. 

    1. Explain why this would decrease the runtime complexity of merge sort (ie. make it run faster).

    2. If an array of _n_ elements can be broken down into _p_ sorted sublists on average (in the example above, _p_=5), what is the runtime complexity of natural merge sort, taking the identification of the sorted sublists into account? Justify your answer.

    3. Although standard merge sort is binary (2-ary) in that it merges two lists at a time, it is possible to write a ternary (3-ary) merge sort, where it splits the list into thirds and recurses on each third. What is the runtime complexity of ternary merge sort? Justify your answer.

    4. Generalizing from 3-ary merge sort, we can imagine _q_-ary merge sort. What if we push this to the extreme, where _q_=_n_? What would be the complexity of this algorithm? Justify your answer. Hint: keep in mind that log_k(k) = 1 for any k, and that comparison-based sorting cannot be faster than O(n log n) - if your answer is faster than that, your answer is wrong.

2. Read about Timsort on Wikipedia (<https://en.wikipedia.org/wiki/Timsort>), which used to be the default sorting algorithm in a number of programming languages, including Python and Java.
    
    1. Explain why merge sort normally requires O(n) space (in addition to the space for the original array).

    2. Explain how Timsort reduces the amount of space needed for merging.

2. Watch Computerphile's video [Characters, Symbols and the Unicode Miracle](https://www.youtube.com/watch?v=MijmeoH9LT4) and read Daniel Lemire's article [Sorting Strings Properly is Stupidly Hard](https://lemire.me/blog/2018/12/17/sorting-strings-properly-is-stupidly-hard/). In your own words, explain why sorting strings lexicographically (ie. into dictionary order) is complicated in the general case.
