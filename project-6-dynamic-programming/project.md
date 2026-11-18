# Project 6: Dynamic Programming

Initial due date: 2026-12-04 23:59 PT

In this project, you will write three different functions that use dynamic programming. All of these are taking from technical interview preparation resources.

1. Write a function `int leastSquares(int n)` that returns the least number of square numbers that sum to n. 

    * Example 1: `least_squares(12) == 3`, since 12 = 4 + 4 + 4.
    * Example 2: `least_squares(13) == 2`, since 13 = 4 + 9.

    This question is adapted from <https://leetcode.com/problems/perfect-squares/>.

2. Imagine that you have planned a vacation, and you know on which days you will be traveling by train. You also know that you can get three types of tickets passes:

    * 1-day pass, for $2
    * 7-day pass, for $7
    * 30-day pass, for $15

    Given a sorted `int[] days` of travel days (as the number of days after the start of the vacation), write a function `int cheapestTickets(int[])` that returns the cheapest possible cost of buying tickets for all the days of travel.

    * Example 1: `cheapestTickets(new int[]{1,4,6,7,8,20}) == 11`.
        * On day 1, buy a 1-day pass for $2 (which covers travel for day 1)
        * On day 4, buy a 7-day pass for $7 (which covers travel for days 4, 6, 7, and 8)
        * On day 20, buy a 1-day pass for $2 (which covers travel for day 20)

    * Example 2: `cheapestTickets(new int[]{1,2,3,4,5,6,7,8,9,10,30,31}) == 17`
        * On day 1, buy a 30-day pass for $15 (which covers travel for days 1-30)
        * On day 31, buy a 1-day pass for $2 (which covers travel for day 31)

    This question is adapted from <https://leetcode.com/problems/minimum-cost-for-tickets/>.

3. Given a longer word (eg., "dogwalker") and a list of shorter words (eg., "do", "dog", "walk", "er", and "walker"), write a function `int mostSubwords(String, String[])` that returns the most number of shorter words that can be used together to form the longer word.

    * Example 1: `mostSubwords("dogwalker", new String[]{"do", "dog", "walk", "er", "walker"}) == 3`, since "dogwalker" can be broken into "dog", "walk", and "er".
    * Example 2: `mostSubwords("banana", new String[]{"a", "an", "ana", "ba", "ban", "nan", "nana"}) == 3`, since "banana" can be broken into either "ba", "nan", and "a", or "ban", "an", and "a".

    This question is adapted from [Cracking the Coding Interview](https://www.crackingthecodinginterview.com/), question 17.15.
