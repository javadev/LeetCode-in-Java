3272\. Find the Count of Good Integers

Hard

You are given two **positive** integers `n` and `k`.

An integer `x` is called **k-palindromic** if:

*   `x` is a palindrome.
*   `x` is divisible by `k`.

An integer is called **good** if its digits can be _rearranged_ to form a **k-palindromic** integer. For example, for `k = 2`, 2020 can be rearranged to form the _k-palindromic_ integer 2002, whereas 1010 cannot be rearranged to form a _k-palindromic_ integer.

Return the count of **good** integers containing `n` digits.

**Note** that _any_ integer must **not** have leading zeros, **neither** before **nor** after rearrangement. For example, 1010 _cannot_ be rearranged to form 101.

**Example 1:**

**Input:** n = 3, k = 5

**Output:** 27

**Explanation:**

_Some_ of the good integers are:

*   551 because it can be rearranged to form 515.
*   525 because it is already k-palindromic.

**Example 2:**

**Input:** n = 1, k = 4

**Output:** 2

**Explanation:**

The two good integers are 4 and 8.

**Example 3:**

**Input:** n = 5, k = 6

**Output:** 2468

**Constraints:**

*   `1 <= n <= 10`
*   `1 <= k <= 9`