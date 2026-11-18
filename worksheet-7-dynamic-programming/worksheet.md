# Worksheet 7: Dynamic Programming

Initial due date: 2026-12-04 23:59 PT

## Review

1. What defines a recursive _algorithm_? As before, take care to not merely define it as a recursive _function_.

2. A lot of problems that can be solved with dynamic programming use recursion, although not all of them do. What makes dynamic programming different from recursion?

3. A popular example of dynamic programming is calculating the nth Fibonacci number. The code for this problem is in `Fibonacci.java`.

    1. What is the formula for finding the nth Fibonacci number?

    2. A recursive version of the Fibonacci function is named `fibonacciRecur` in `Fibonacci.java`. What is the runtime complexity this function? Justify your answer. You do not have to be exactly correct here (since the complexity is hard to think through), but should be in the rough area with appropriate reasoning.

    3. In what way is this recursive function inefficient? Why and how does dynamic programming solve that problem?

    4. A dynamic programming version of this function is named `fibonacciDyn` in `Fibonacci.java`. Add comments to the file to explain how it works.

4. Dijkstra's algorithm, which we discussed in class, can be considered a dynamic programming algorithm. Based on your explanation of dynamic programming above, explain why.

## Explore

In this section, we will write a dynamic programming solution to a tech interview question, adapted from [Cracking the Coding Interview](https://www.crackingthecodinginterview.com/), question 8.1. You will write your code in `StairHop.java`. Please submit that file to the autograder _and_ include it in your GitHub submission. The problem is as follows:

> A child is running up a staircase with n steps, and can hop either 1, 2, or 3 steps at a time. Implement a method to count how many unique ways the child can hop up the stairs. For example, if the stairs have 4 steps total, there are 7 ways of going up them: {1, 1, 1, 1}, {1, 1, 2}, {1, 2, 1}, {2, 1, 1}, {2, 2}, {1, 3}, and {3, 1}.

1. We will start by solving this problem recursively, without using dynamic programming. The general approach here is try hopping 1, 2, or 3 steps, count how many ways there are to hop up the remaining stairs, then combine those results.

    1. What is the "smaller subproblem"?

    2. What is the relationship between the solutions to the smaller subproblems and the solution to the whole problem?

    3. What is/are the base case(s) for this problem, and what should be returned in those case(s)? Note that there are multiple possible valid base case(s), as long as they work together with the recursive case(s).

    4. What is/are the recursive case(s) for this problem?

    5. Write the recursive solution to this question in the `stairhopRecur()` method of `StairHop.java`.

    6. What is the runtime complexity of this solution? As before, you do not have to be exact, but should explain your reasoning.

2. We will now write the dynamic programming solution to the same problem.

    1. What computation is repeated in your recursive solution?

    2. The wrapper method for `stairhop_dyn()` is done for you. Fill in the recursive `stairhop_dyn()` method.

    3. What is the runtime complexity of this solution? Explain your reasoning.

## Challenge

This section explores using dynamic programming on a "real" problem: gerrymandering. First, watch this brief explanation of gerrymandering (<https://www.youtube.com/watch?v=bGLRJ12uqmkLinks>), then read this overview <https://www.washingtonpost.com/news/wonk/wp/2015/03/01/this-is-the-best-explanation-of-gerrymandering-you-will-ever-see/> (non-paywalled version: <https://archive.is/N6bfF>). Finally, here's more details about the computational approaches to this problem: <https://www.technologyreview.com/2021/08/12/1031567/mathematicians-algorithms-stop-gerrymandering/>. You can find an interactive example of using dynamic programming to gerrymander at <https://appoxy.fly.dev/dyna_prog/>.

1. In your own words, explain what gerrymandering is and why it's a problem.

2. Much like the stair hopping example above, using dynamic programming to "solve" gerrymandering involves exploring different possibilities using recursion, them combining those results. What is the "smaller subproblem" for recursion?

3. What is the relationship between the solutions to the smaller subproblems and the solution to the whole problem?

4. To create the smaller subproblems, we must first be able to enumerate all possible first districts. What existing algorithm that you've already learned might help us do this?

5. What is the base case for gerrymandering? That is, what is the easiest version of gerrymandering that you immediately know the answer to?

6. What is the recursive case for gerrymandering?

7. Why is dynamic programming appropriate for gerrymandering, as opposed to normal recursion? That is, in what situation would the same recursive call be made? Include an image to illustrate your answer.
