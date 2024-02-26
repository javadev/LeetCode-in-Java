374\. Guess Number Higher or Lower

Easy

We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns 3 possible results:

*   `-1`: The number I picked is lower than your guess (i.e. `pick < num`).
*   `1`: The number I picked is higher than your guess (i.e. `pick > num`).
*   `0`: The number I picked is equal to your guess (i.e. `pick == num`).

Return _the number that I picked_.

**Example 1:**

**Input:** n = 10, pick = 6

**Output:** 6

**Example 2:**

**Input:** n = 1, pick = 1

**Output:** 1

**Example 3:**

**Input:** n = 2, pick = 1

**Output:** 1

**Example 4:**

**Input:** n = 2, pick = 2

**Output:** 2

**Constraints:**

*   <code>1 <= n <= 2<sup>31</sup> - 1</code>
*   `1 <= pick <= n`