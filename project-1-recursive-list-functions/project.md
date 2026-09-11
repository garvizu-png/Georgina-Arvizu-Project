# Project 1: Tail Recursive List Functions

Initial due date: 2026-09-26 23:59 PT

Note: this assignment requires understanding tail-recursion, which was introduced in the Challenge section of the previous worksheet. We strongly recommend completing that worksheet section before attempting this assignment.

In a previous worksheet, we looked list recursion how we can write functions that traverse a list recursively, without needing to know the size of the list. Instead of talking about recursive *algorithms*, we can actually talk about recursive *data structures*. The singly-linked list is a good example: we can consider a "list" that consists of *just* each node, pointing to the rest of the list:

```java
class ListNode {

    int value = 0;
    ListNode rest = null;

    // ...

}
```

In fact, this is the *original* linked list, invented back in 1958 and known as a [*cons cell*](https://en.wikipedia.org/wiki/Cons). The only thing you can do with this "list" is get the first element or get the rest of the list. A complete implementation of this linked list is found in `ListNode.java`.

This programming project asks you to write twelve tail-recursive linked list functions. The signatures of these functions are listed below; a description of what they do, their arguments, and examples of their use can be found in the starter code.

* <pre><code class="language-java">boolean isEmpty(ListNode list)</code></pre></pre>
* <pre><code class="language-java">int size(ListNode list)</code></pre>
* <pre><code class="language-java">int get(ListNode list, int index)</code></pre>
* <pre><code class="language-java">int indexOf(ListNode list, int element)</code></pre>
* <pre><code class="language-java">int lastIndexOf(ListNode list, int element)</code></pre>
* <pre><code class="language-java">boolean equals(ListNode list1, ListNode list2)</code></pre>
* <pre><code class="language-java">ListNode reverse(ListNode list)</code></pre>
* <pre><code class="language-java">ListNode headList(ListNode list, int n)</code></pre>
* <pre><code class="language-java">ListNode tailList(ListNode list, int n)</code></pre>
* <pre><code class="language-java">ListNode subList(ListNode list, int start, int end)</code></pre>
* <pre><code class="language-java">ListNode add(ListNode list, int element)</code></pre>
* <pre><code class="language-java">ListNode addAll(ListNode list1, ListNode list2)</code></pre>

`ListFunctions.java` contains function stubs for each of the functions above. A second file, `ListFunctionsTestUtils.java`, contains utility functions you may use for testing, but which should not be used in your code. Your submission should additionally follow the constraints below:

* Not all functions require recursion, but all recursive functions must be tail-recursive - that is, whenever functions call themselves, the result must be returned directly.

* Your functions must run in O(n) time (or better).

* You are not allowed to use any non-recursive looping, such as `for`, `while`, or `goto`.

* You are not allowed to have non-local variables (i.e., variables that exist outside of functions), nor create any arrays, nor define any new classes.

* You can call functions earlier in the list in the implementation of later functions, but not vice versa. For example, the code for `addAll` can call `reverse`, but the code for `reverse` must not call `addAll`.

* You should consider writing additional private helper functions; in fact, doing so is necessary to meet the constraints.

You should submit your code to two places:

* To the autograder. Note that the autograder only checks whether your code returns the correct values, but does _not_ check whether your code adheres to the constraints mentioned above. 

* To GitHub. Beyond including a copy of your code, you should write a couple sentences explaining how each function is tail-recursive and runs in O(n) time or faster. If your functions fail to meet one of the constraints, I will let you know in a GitHub comment.
