3869\. Count Fancy Numbers in a Range

Hard

You are given two integers `l` and `r`.

An integer is called **good** if its digits form a **strictly monotone** sequence, meaning the digits are **strictly increasing** or **strictly decreasing**. All single-digit integers are considered good.

An integer is called **fancy** if it is good, or if the **sum of its digits** is good.

Return an integer representing the number of fancy integers in the range `[l, r]` (inclusive).

A sequence is said to be **strictly increasing** if each element is **strictly greater** than its previous one (if exists).

A sequence is said to be **strictly decreasing** if each element is **strictly less** than its previous one (if exists).

**Example 1:**

**Input:** l = 8, r = 10

**Output:** 3

**Explanation:**

*   8 and 9 are single-digit integers, so they are good and therefore fancy.
*   10 has digits `[1, 0]`, which form a strictly decreasing sequence, so 10 is good and thus fancy.

Therefore, the answer is 3.

**Example 2:**

**Input:** l = 12340, r = 12341

**Output:** 1

**Explanation:**

*   12340
    *   12340 is not good because `[1, 2, 3, 4, 0]` is not strictly monotone.
    *   The digit sum is `1 + 2 + 3 + 4 + 0 = 10`.
    *   10 is good as it has digits `[1, 0]`, which is strictly decreasing. Therefore, 12340 is fancy.
*   12341
    *   12341 is not good because `[1, 2, 3, 4, 1]` is not strictly monotone.
    *   The digit sum is `1 + 2 + 3 + 4 + 1 = 11`.
    *   11 is not good as it has digits `[1, 1]`, which is not strictly monotone. Therefore, 12341 is not fancy.

Therefore, the answer is 1.

**Example 3:**

**Input:** l = 123456788, r = 123456788

**Output:** 0

**Explanation:**

*   123456788 is not good because its digits are not strictly monotone.
*   The digit sum is `1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 8 = 44`.
*   44 is not good as it has digits `[4, 4]`, which is not strictly monotone. Therefore, 123456788 is not fancy.

Therefore, the answer is 0.

**Constraints:**

*   <code>1 <= l <= r <= 10<sup>15</sup></code>