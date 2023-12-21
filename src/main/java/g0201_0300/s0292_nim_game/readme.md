292\. Nim Game

Easy

You are playing the following Nim Game with your friend:

*   Initially, there is a heap of stones on the table.
*   You and your friend will alternate taking turns, and **you go first**.
*   On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
*   The one who removes the last stone is the winner.

Given `n`, the number of stones in the heap, return `true` _if you can win the game assuming both you and your friend play optimally, otherwise return_ `false`.

**Example 1:**

**Input:** n = 4

**Output:** false

**Explanation:**

    These are the possible outcomes:
    1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
    2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
    3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
    In all outcomes, your friend wins. 

**Example 2:**

**Input:** n = 1

**Output:** true 

**Example 3:**

**Input:** n = 2

**Output:** true 

**Constraints:**

*   <code>1 <= n <= 2<sup>31</sup> - 1</code>